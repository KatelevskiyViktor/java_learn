package ia;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean switcher = true;
        try(Scanner console = new Scanner(System.in)){
        Registry registry = new Registry();
        while(switcher){
            try{
            System.out.print("Hi, do you want to add animal (Enter: a)" + 
                        "\nor see commands selected animal (Enter: c)" + 
                        "\nor teach some animal (Enter: t)" + 
                        "\nor out (Enter: q): ");
            String firstStep = console.nextLine();
           
            if("a".equals(firstStep)){
                String[] animalInfo = new String[5];
                System.out.print("Hi, what type of animal do you want to add? (Enter: cat, dog, horse, donkey): ");
                animalInfo[0] = console.nextLine();
                System.out.print("Name animal: ");
                animalInfo[1] = console.nextLine();
                System.out.print("Date birth: ");
                animalInfo[2] = console.nextLine();
                System.out.print("Enter command wich animal know: ");
                animalInfo[3] = console.nextLine();
                System.out.print("Enter № passport: ");
                animalInfo[4] = console.nextLine();
                if(registry.add(animalInfo)){
                    System.out.println("\nAnimal is added!\n");
                }else{
                    System.out.println("\nI don't know this animal!\n");
                }
            }else if("c".equals(firstStep)){
                System.out.print("Enter series and number passport animal (Example: 2233345678): ");
                String sNPass = console.nextLine();
                Object object = registry.showCommands(sNPass);
                if(object.getClass().getSimpleName().equals("Cat")){
                    Cat cat = (Cat) object;
                    System.out.println("Commands this animal is:");
                    for(String str : cat.commands){
                        System.out.println(str);
                    }
                }else if(object.getClass().getSimpleName().equals("Dog")){
                    Dog dog = (Dog) object;
                    System.out.println("Commands this animal is:");
                    for(String str : dog.commands){
                        System.out.println(str);
                    }
                }else if(object.getClass().getSimpleName().equals("Horse")){
                    Horse horse = (Horse) object;
                    System.out.println("Commands this animal is:");
                    for(String str : horse.commands){
                        System.out.println(str);
                    }
                }else if(object.getClass().getSimpleName().equals("Donkey")){
                    Donkey donkey = (Donkey) object;
                    System.out.println("\nCommands this animal is:");
                    for(String str : donkey.commands){
                        System.out.println(str);
                    }
                    System.out.println();
                }else{
                    System.out.println("\nError! No such animal or number passport wrong!\n");
                }
            }else if("t".equals(firstStep)){
                System.out.print("Enter number passport animal (Example: 2233345678): ");
                String sNPass = console.nextLine();
                System.out.print("Enter new command: ");
                String command = console.nextLine();
                registry.teacherCommands(sNPass, command);
                System.out.println("\nAnimal tiched! Сongratulations!\n");
            }
            else if("q".equals(firstStep)){
                System.out.println("\nGoodbay sweety =**** Will glad to see next time =)\n");
                switcher = false;
            }else{
                System.out.println("\nYou enter some shit! Goodby, i don't want to speak with you...\n");
                switcher = false;
            }
        
        }catch(Exception e){
            System.out.println("Do you play enough? Gust enter what i say and all be fine ;)");
        }
        }
    }

    }
}
