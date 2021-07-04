package kufkes;

import kufkes.classes.Course;
import kufkes.classes.Program;
import kufkes.classes.ProgramManager;
import kufkes.classes.Task;


import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //Date for Tests
        String tempDateString;

        tempDateString = "10-07-2021 11:59:59";

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = formatter.parse(tempDateString);

        // Linked List implementation test
        ProgramManager pm01 = new ProgramManager();
        pm01.addProgram("Fruit Proficiency", "FP - 607");
        Program fruitProficiency = pm01.getProgramById(1000);
        fruitProficiency.addCourse("Intro to Apple Peeling", "IAPP-999");
        Course introAppPeeling = pm01.getProgramById(1000).getCourseById(2000);
        introAppPeeling.addTask("Peeling Race 1", 100.0, date);

        System.out.println(pm01.toString());

    }
}
