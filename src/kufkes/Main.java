package kufkes;

import kufkes.classes.LinkedList.LinkedList;
import kufkes.classes.Program;
import kufkes.classes.ProgramManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ProgramManager pm = new ProgramManager(10);
//
//        pm.addProgram("Physics", "PHYS-100", 50);
//        pm.addProgram("Blacksmithing", "BLSM-201",50);
//
////        System.out.println(pm.ToString());
//
//        pm.addProgram("Building Destruction", "BDSC-999", 50);
//
////        System.out.println(pm.ToString());
////
////        pm.deleteProgram(1002);
////
////        System.out.println(pm.ToString());
//
//        pm.programs[0].addCourse("Rollercoasters", "RCST-99", 50);
//        pm.programs[0].addCourse("Canons", "CNNS-98", 50);
//        pm.programs[0].courses[0].addTask("Assignment 01", 15.0);
//        pm.programs[0].courses[0].addTask("Assignment 02", 20.0);
//
//        System.out.println(pm.ToString());

        LinkedList<Integer> intLL = new LinkedList<Integer>();
        LinkedList<Double> dblLL = new LinkedList<Double>();
        LinkedList<Program> prgmLL = new LinkedList<Program>();

        intLL.addFront(34);
        intLL.addFront(32);
        intLL.addFront(345);
        intLL.addFront(176);

        dblLL.addFront(34.1);
        dblLL.addFront(33.6);
        dblLL.addFront(42.4);
        dblLL.addFront(89.3);

        Program p = new Program(666, "Physics", "PHYS-100", 45);
        prgmLL.addFront(p);

        System.out.println(intLL.printList());
        System.out.println(dblLL.printList());
        System.out.println(prgmLL.printList());
    }
}
