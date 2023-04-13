package ia;

public class Registry {
    DB db = new DB();
    Counter counter = new Counter();

    public boolean add(String[] animalInfo){
        if("cat".equals(animalInfo[0])) {
            Cat cat = new Cat();
            cat.name = animalInfo[1];
            cat.birth = animalInfo[2];
            cat.commands.add(animalInfo[3]);
            cat.sNPass = animalInfo[4];
            cat.id = counter.count;
            db.cats.add(cat);
            counter.count++;
            return true;
        } else if("dog".equals(animalInfo[0])) {
            Dog dog = new Dog();
            dog.name = animalInfo[1];
            dog.birth = animalInfo[2];
            dog.commands.add(animalInfo[3]);
            dog.sNPass = animalInfo[4];
            dog.id = counter.count;
            db.dogs.add(dog);
            counter.count++;
            return true;
        } else if("horse".equals(animalInfo[0])) {
            Horse horse = new Horse();
            horse.name = animalInfo[1];
            horse.birth = animalInfo[2];
            horse.commands.add(animalInfo[3]);
            horse.sNPass = animalInfo[4];
            horse.id = counter.count;
            db.horses.add(horse);
            counter.count++;
            return true;
        } else if("donkey".equals(animalInfo[0])) {
            Donkey donkey = new Donkey();
            donkey.name = animalInfo[1];
            donkey.birth = animalInfo[2];
            donkey.commands.add(animalInfo[3]);
            donkey.sNPass = animalInfo[4];
            donkey.id = counter.count;
            db.donkeys.add(donkey);
            counter.count++;
            return true;
            
        } else {
            return false;
        }
    }

    public Object showCommands(String sNPass){

            for(Cat cat : db.cats){
               if(cat.sNPass.equals(sNPass)){
                  return cat;
               }
            }
      
            for(Dog dog : db.dogs){
               if(dog.sNPass.equals(sNPass)){
                    return dog;
               }
            }
        
            for(Horse horse : db.horses){
                if(horse.sNPass.equals(sNPass)){
                    return horse;
                }
             }

            for(Donkey donkey : db.donkeys){
                if(donkey.sNPass.equals(sNPass)){
                    return donkey;
                }
             }

            return null;
    }

    public void teacherCommands(String sNPass, String command){

        for(Cat cat : db.cats){
           if(cat.sNPass.equals(sNPass)){
                cat.commands.add(command);
           }
        }
  
        for(Dog dog : db.dogs){
           if(dog.sNPass.equals(sNPass)){
               dog.commands.add(command);
           }
        }
    
        for(Horse horse : db.horses){
            if(horse.sNPass.equals(sNPass)){
                horse.commands.add(command);
            }
         }

        for(Donkey donkey : db.donkeys){
            if(donkey.sNPass.equals(sNPass)){
                donkey.commands.add(command);
            }
         }

        
}
}
