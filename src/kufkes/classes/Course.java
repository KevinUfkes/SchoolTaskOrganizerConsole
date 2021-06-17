package kufkes.classes;

public class Course {
    private int id;
    private String name;
    private String code;

    public Course(int id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;
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
        s += "\n";
        return s;
    }
}
