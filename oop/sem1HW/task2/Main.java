package oop.sem1HW.task2;

public class Main {
   public static void main(String[] args) {
    Human human = new Human();
    Wardrobe wardrobe = new Wardrobe();

    human.putClothes(wardrobe, "sweater");
    human.openDoor(wardrobe);
    human.openDoor(wardrobe);
    human.putClothes(wardrobe, "sweater");
    human.putClothes(wardrobe, "t-shirt");
    human.watchWhatInWardrobe(wardrobe);
    human.closeDoor(wardrobe);

   }
}
