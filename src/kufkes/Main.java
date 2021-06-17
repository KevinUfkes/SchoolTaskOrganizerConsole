package kufkes;

import kufkes.classes.ProgramManager;

public class Main {

    public static void main(String[] args) {

        ProgramManager pm = new ProgramManager(10);

        pm.addProgram("Physics", "PHYS-100", 50);
        pm.addProgram("Blacksmithing", "BLSM-201",50);

//        System.out.println(pm.ToString());

        pm.addProgram("Building Destruction", "BDSC-999", 50);

//        System.out.println(pm.ToString());
//
//        pm.deleteProgram(1002);
//
//        System.out.println(pm.ToString());

        pm.programs[0].addCourse("Rollercoasters", "RCST-99");
        pm.programs[0].addCourse("Canons", "CNNS-98");

        System.out.println(pm.programs[0].toString());



    }
}
