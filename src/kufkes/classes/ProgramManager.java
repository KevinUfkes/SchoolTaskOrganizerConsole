package kufkes.classes;

import kufkes.classes.LinkedList.LLNode;
import kufkes.classes.LinkedList.LinkedList;

public class ProgramManager {

    private int programIdSeed;
    private LinkedList<Program> programs;

    public ProgramManager(){
        this.programIdSeed = 1000;
        this.programs = new LinkedList<Program>();
    }

    public void addProgram(String name, String code){
        Program tempProgram = new Program(programIdSeed, name, code);
        programs.addFront(tempProgram);
        programIdSeed++;
    }

    public Program getProgramById(int id){
        if(programs.head==null){
            return null;
        }

        LLNode<Program> curr = programs.head;
        while(curr!=null && curr.data.getId()!=id){
            curr = curr.next;
        }
        if(curr==null){
            return null;
        }
        return curr.data;
    }

    public String toString(){
        String s = "Program List: ";
        s += programs.printList();
        return s;
    }
}
