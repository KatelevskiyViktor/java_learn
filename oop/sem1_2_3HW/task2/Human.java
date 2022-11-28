package oop.sem1_2_3HW.task2;

public class Human extends HumanAct {
    public String name;

    @Override
    public void closeDoor(){
        if(Wardrobe.door == false) 
            System.out.println("Door already close!");
        else{
            Wardrobe.door = false;
            System.out.println("Door close!");
        }
    }

    

    public boolean watchWhatInWardrobe(){
        if(Wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        System.out.println(new Wardrobe().toString()); 
        return true;
    }
}
