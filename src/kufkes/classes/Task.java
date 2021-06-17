package kufkes.classes;

public class Task {
    private int id;
    private String name;
    private double weight;

    public Task(int id, String name, double weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        String s = "";
        s += "\n\t\tID: " + this.id;
        s += "\n\t\tName: " + this.name;
        s += "\n\t\tWeight: " + this.weight;
        return s;
    }
}
