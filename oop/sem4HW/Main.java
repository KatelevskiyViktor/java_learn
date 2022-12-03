package oop.sem4HW;

public class Main {
    public static void main(String[] args) {
       Cat cat = new Cat(new Field());
        for (int[] string : cat.catWalk()) {
          for (int string2 : string) {
            if(string2 != -1 || string2 != 88)System.out.print(string2 + " ");
            else System.out.print(string2);
          }
          System.out.println();
        } 
      
        
      }
}
