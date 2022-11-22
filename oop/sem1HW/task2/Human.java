package oop.sem1HW.task2;

public class Human {
    public String name;
    public void openDoor(Wardrobe wardrobe){
        if(wardrobe.door == true) 
            System.out.println("Door already open!");
        else{
            wardrobe.door = true;
            System.out.println("Door open!");
        }
        
    }
    public void closeDoor(Wardrobe wardrobe){
        if(wardrobe.door == false) 
            System.out.println("Door already close!");
        else{
            wardrobe.door = false;
            System.out.println("Door close!");
        }
    }

    public boolean putClothes(Wardrobe wardrobe, String clothe){
        if(wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < wardrobe.clothes.length; i++) {
            if(wardrobe.clothes[i] == null){
                wardrobe.clothes[i] = clothe;
                System.out.println("Сlothes are put on!");
                return true;
            }
        }
        
        
        System.out.println("There is no place!");
        return false;
    }

    public boolean removeClothe(Wardrobe wardrobe, String clothe){
        if(wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < wardrobe.clothes.length; i++) {
            if(wardrobe.clothes[i] == clothe){
                wardrobe.clothes[i] = null;
                System.out.println("Сlothes are put off!");
                return true;
            }
        }
    
        
        System.out.println("There are no such clothes!");
        return false;
    }

    public boolean watchWhatInWardrobe(Wardrobe wardrobe){
        if(wardrobe.door == false){
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        System.out.println(wardrobe.toString()); 
        return true;
    }
}
