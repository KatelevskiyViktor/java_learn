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

    public abstract void closeDoor();

    public boolean putClothes(String clothe) {
        if (Wardrobe.door == false) {
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < Wardrobe.clothes.length; i++) {
            if (Wardrobe.clothes[i] == null) {
                Wardrobe.clothes[i] = clothe;
                System.out.println("Сlothes are put on!");
                return true;
            }
        }

        System.out.println("There is no place!");
        return false;
    }

    public boolean removeClothe(String clothe) {
        if (Wardrobe.door == false) {
            System.out.println("In the beginning, you need to open the door");
            return false;
        }

        for (int i = 0; i < Wardrobe.clothes.length; i++) {
            if (Wardrobe.clothes[i] == clothe) {
                Wardrobe.clothes[i] = null;
                System.out.println("Сlothes are put off!");
                return true;
            }
        }

        System.out.println("There are no such clothes!");
        return false;
    }
}