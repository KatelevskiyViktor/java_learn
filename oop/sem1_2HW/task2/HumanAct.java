package oop.sem1_2HW.task2;

public abstract class HumanAct {
    public void openDoor(){
        if(Wardrobe.door == true) 
            System.out.println("Door already open!");
        else{
            Wardrobe.door = true;
            System.out.println("Door open!");
        }
        
    }

    public abstract void closeDoor();
}
