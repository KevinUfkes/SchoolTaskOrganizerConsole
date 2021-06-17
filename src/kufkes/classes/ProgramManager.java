package kufkes.classes;

public class ProgramManager {
    public Program [] programs;
    private int maxPrograms;
    private int numPrograms;
    private int programIdSeed;

    public ProgramManager(int maxPrograms){
        this.maxPrograms = maxPrograms;
        programs = new Program [maxPrograms];
        numPrograms = 0;
        this.programIdSeed = 1000;
    }

    public boolean addProgram(String name, String code, int maxCourses){
        if(numPrograms < maxPrograms){
            programs[numPrograms] = new Program(programIdSeed, name, code, maxCourses);
            numPrograms++;
            programIdSeed++;
            return true;
        }
        return false;
    }

    public boolean deleteProgram(int id){
        int loc = search(id);
        if(loc!=-1){
            programs[loc] = programs[numPrograms];
            numPrograms--;
            return true;
        }
        return false;
    }

    private int search(int id){
        for(int x=0; x<numPrograms; x++){
            if (id == programs[x].getId()) {
                return x;
            }
        }
        return -1;
    }

    public String ToString(){
        String s = "Program List: ";
        for(int x=0; x<numPrograms; x++){
            s += "\n----------";
            s += programs[x].toString();
            s += "\n----------";
        }
        return s;
    }
}
