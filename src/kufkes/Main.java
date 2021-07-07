package kufkes;

import kufkes.classes.*;


import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //Date for Tests
        String tempDateString01;
        String tempDateString02;
        String tempDateString03;
        String tempDateString04;
        String tempDateString05;

        tempDateString01 = "07-07-2021 11:59:59";
        tempDateString02 = "08-08-2021 11:59:59";
        tempDateString03 = "09-09-2021 11:59:59";
        tempDateString04 = "10-10-2021 11:59:59";
        tempDateString05 = "11-11-2021 11:59:59";


        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date01 = formatter.parse(tempDateString01);
        Date date02 = formatter.parse(tempDateString02);
        Date date03 = formatter.parse(tempDateString03);
        Date date04 = formatter.parse(tempDateString04);
        Date date05 = formatter.parse(tempDateString05);

        // Linked List implementation test
        ProgramManager pm01 = new ProgramManager();
        pm01.addProgram("Fruit Proficiency", "FP - 607");
        Program fruitProficiency = pm01.getProgramById(1000);
        fruitProficiency.addCourse("Intro to Apple Peeling", "IAPP-999");
        fruitProficiency.addCourse("Orange Textures", "OTXT-988");
        Course introAppPeeling = pm01.getProgramById(1000).getCourseById(2000);
        Course orangeTextures = pm01.getProgramById(1000).getCourseById(2001);
        introAppPeeling.addTask("Peeling Race 1", 100.0, date01);
        introAppPeeling.addTask("Peeling Race 2", 100.0, date02);
        introAppPeeling.addTask("Peeling Race 3", 100.0, date03);
        introAppPeeling.addTask("Peeling Race 4", 100.0, date04);
        introAppPeeling.addTask("Peeling Race 5", 100.0, date05);

        orangeTextures.addTask("Peel Orange 1", 50.5, date02);
        orangeTextures.addTask("Peel Orange 2", 49.5, date04);




        System.out.println(pm01.tasksByDate());

    }
}
