package oop.sem1HW.task1;

public class Main {
    public static void main(String[] args) {
        Human viktorK = new Human();
        Human elenaO = new Human();

        viktorK.siblings = new String[] { "StanislavK", "ElenaO" };
        viktorK.name = "ViktorK";
        elenaO.parents = new String[] { "SvetlanaK", "ValeriyO" };
        elenaO.name = "ElenaO";

       
        System.out.println(viktorK.toString() + "\n");
        System.out.println(viktorK.relativeResearcher(viktorK, elenaO) + "\n\n");
        System.out.println(elenaO.toString() + "\n");
        System.out.println(elenaO.relativeResearcher(elenaO, viktorK) + "\n\n");

    }
}