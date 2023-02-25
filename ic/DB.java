package ic;

import java.util.ArrayList;

public class DB {
    ArrayList<Toy> toys = new ArrayList<>();
    ArrayList<Integer> prizeToys = new ArrayList<>();

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void addPrizeToy(Integer toyID){
        prizeToys.add(toyID);
    }
    
}
