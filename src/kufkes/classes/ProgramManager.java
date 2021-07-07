package kufkes.classes;

import kufkes.classes.LinkedList.LLNode;
import kufkes.classes.LinkedList.LinkedList;

public class ProgramManager {

    private static int programIdSeed;
    private LinkedList<Program> programs;

    public ProgramManager(){
        this.programIdSeed = 1000;
        this.programs = new LinkedList<>();
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

    public String tasksByDate(){
        LinkedList<Task>tasksByDate = new LinkedList<>();
        LLNode<Program> programCurr;
        programCurr = programs.head;
        if(programs.head==null){
            return null;
        }
        while(programCurr!=null){
            LLNode<Course> courseCurr;
            courseCurr = programCurr.data.getCourses().head;

            while(courseCurr!=null){
                LLNode<Task> taskCurr;
                taskCurr = courseCurr.data.getTasks().head;

                while(taskCurr!=null){

                    Task taskByDateTemp ;
                    taskByDateTemp = new Task(taskCurr.data);
                    LLNode<Task> tempTaskNode = new LLNode<>(taskByDateTemp);
                    tempTaskNode.next = null;

                    if(tasksByDate.head==null || (tasksByDate.head.data.getDueDate().after(tempTaskNode.data.getDueDate()) || tasksByDate.head.data.getDueDate().equals(tempTaskNode.data.getDueDate()))){
                        tempTaskNode.next = tasksByDate.head;
                        tasksByDate.head = tempTaskNode;
                    } else{
                        LLNode<Task> tasksByDateCurr, tasksByDatePrev;
                        tasksByDateCurr = tasksByDatePrev = tasksByDate.head;
                        while(tasksByDateCurr!=null && (tasksByDateCurr.data.getDueDate().before(tempTaskNode.data.getDueDate()) || tasksByDate.head.data.getDueDate().equals(tempTaskNode.data.getDueDate()))){
                            tasksByDatePrev = tasksByDateCurr;
                            tasksByDateCurr = tasksByDateCurr.next;
                        }
                            tasksByDatePrev.next = tempTaskNode;
                            tempTaskNode.next = tasksByDateCurr;
                    }

                    taskCurr = taskCurr.next;
                }
                courseCurr = courseCurr.next;
            }
            programCurr = programCurr.next;


        }
        System.out.println("ehllo");

        String s = "";
        LLNode<Task> tasksByDateCurr;
        tasksByDateCurr = tasksByDate.head;
        while(tasksByDateCurr!=null){
            s += tasksByDateCurr.data;
            tasksByDateCurr = tasksByDateCurr.next;
            ;
        }
        return s;
//        return tasksByDate.printList();
    }

    public String toString(){
        String s = "Program List: ";
        s += programs.printList();
        return s;
    }
}
