package oop.sem1_2HW.task2;

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

    public boolean putClothes( String clothe){
        if(Wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < Wardrobe.clothes.length; i++) {
            if(Wardrobe.clothes[i] == null){
                Wardrobe.clothes[i] = clothe;
                System.out.println("Сlothes are put on!");
                return true;
            }
        }
        
        
        System.out.println("There is no place!");
        return false;
    }

    public boolean removeClothe(String clothe){
        if(Wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < Wardrobe.clothes.length; i++) {
            if(Wardrobe.clothes[i] == clothe){
                Wardrobe.clothes[i] = null;
                System.out.println("Сlothes are put off!");
                return true;
            }
        }
    
        
        System.out.println("There are no such clothes!");
        return false;
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
