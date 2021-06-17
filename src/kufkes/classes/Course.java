package kufkes.classes;

public class Course {
    private int id;
    private String name;
    private String code;
    public Task [] tasks;
    private int maxTasks;
    private int numTasks;
    private int taskIdSeed;

    public Course(int id, String name, String code, int maxTasks){
        this.id = id;
        this.name = name;
        this.code = code;
        this.maxTasks = maxTasks;
        this.tasks = new Task [maxTasks];
        this.numTasks = 0;
        this.taskIdSeed = 3000;
    }

    public boolean addTask(String name, double weight){
        if(numTasks<maxTasks){
            tasks[numTasks] = new Task(taskIdSeed, name, weight);
            numTasks++;
            taskIdSeed++;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString(){
        String s = "";
        s += "\n\tID: " + this.id;
        s += "\n\tName: " + this.name;
        s += "\n\tCode: " + this.code;
        s += "\n\tTasks: ";
        for(int x=0; x<numTasks; x++){
            s += tasks[x].toString();
        }
        s += "\n";
        return s;
    }
}
