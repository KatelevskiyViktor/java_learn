package oop.sem1_2_3HW.task2;

public abstract class HumanAct {
    public void openDoor() {
        if (Wardrobe.door == true)
            System.out.println("Door already open!");
        else {
            Wardrobe.door = true;
            System.out.println("Door open!");
        }

    }

    public void closeDoor(){
        if(Wardrobe.door == false) 
            System.out.println("Door already close!");
        else{
            Wardrobe.door = false;
            System.out.println("Door close!");
        }
    };

    public abstract boolean putClothes(String clothe); 
    public abstract boolean removeClothe(String clothe); 
}