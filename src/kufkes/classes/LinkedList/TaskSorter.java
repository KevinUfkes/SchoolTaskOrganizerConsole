package kufkes.classes.LinkedList;

import kufkes.classes.Course;
import kufkes.classes.Program;
import kufkes.classes.Task;

public class TaskSorter {

    public TaskSorter(){

    }

    public String tasksByDate(LinkedList<Program> programs){
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
        return tasksByDate.printList();
    }

    public String tasksByWeight(LinkedList<Program> programs){
        LinkedList<Task>tasksByWeight = new LinkedList<>();
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
                    Task taskByWeightTemp;
                    taskByWeightTemp = new Task(taskCurr.data);
                    LLNode<Task> tempWeightTaskNode = new LLNode<>(taskByWeightTemp);
                    tempWeightTaskNode.next = null;

                    if(tasksByWeight.head==null || tasksByWeight.head.data.getWeight()<=tempWeightTaskNode.data.getWeight()){
                        tempWeightTaskNode.next = tasksByWeight.head;
                        tasksByWeight.head = tempWeightTaskNode;
                    } else{
                        LLNode<Task> tasksByWeightCurr, tasksByWeightPrev;
                        tasksByWeightCurr = tasksByWeightPrev = tasksByWeight.head;
                        while(tasksByWeightCurr!=null && tasksByWeightCurr.data.getWeight()>=tempWeightTaskNode.data.getWeight()){
                            tasksByWeightPrev = tasksByWeightCurr;
                            tasksByWeightCurr = tasksByWeightCurr.next;
                        }
                        tasksByWeightPrev.next = tempWeightTaskNode;
                        tempWeightTaskNode.next = tasksByWeightCurr;
                    }
                    taskCurr = taskCurr.next;
                }
                courseCurr = courseCurr.next;
            }
            programCurr = programCurr.next;
        }
        return tasksByWeight.printList();
    }
}
