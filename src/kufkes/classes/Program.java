package kufkes.classes;

public class Program {
    private int id;
    private String name;
    private String code;
    public Course [] courses;
    private int maxCourses;
    private int numCourses;
    private int courseIdSeed;

    public Program(int id, String name, String code, int maxCourses){
        this.id = id;
        this.name = name;
        this.code = code;
        this.maxCourses = maxCourses;
        courseIdSeed = 2000;
        courses = new Course[maxCourses];
    }

    public boolean addCourse(String name, String code, int maxTasks){
        if(numCourses<maxCourses){
            courses[numCourses] = new Course(courseIdSeed, name, code, maxTasks);
            numCourses++;
            courseIdSeed++;
            return true;
        }
        return false;
    }

    public int getId(){
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
        String s = "\n";
        s += "\nID: " + this.id;
        s += "\nName: " + this.name;
        s += "\nCode: " + this.code;
        s += "\nCourses: ";
        if(numCourses>0){
            for(int x=0; x<numCourses; x++){
                s += courses[x].toString();
            }
        } else{
            s += "\tNo Courses";
        }

        return s;
    }
}
