package ic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Scam {
 
    public boolean checkPrizeToy(ArrayList<Integer> prizeToys, int toyID){
        for (Integer toy : prizeToys) {
            if(toy == toyID)return true;
        }
        return false;
    };



    public void rafflePrizeToy(ArrayList<Toy> toys, ArrayList<Integer> prizeToysID){
        int temp = 100;
        int prizeToy = 0;
        for(Toy toy: toys){
            int fol = 100 - toy.frequency_of_loss;
            if(fol < temp && toy.count != 0){  
                temp = fol;
                prizeToy = toy.id;
            }
        }   
        prizeToysID.add(prizeToy); 
        for(Toy toy: toys){
            if(toy.id == prizeToy) toy.count -=1;
        }
    }

    public void getPrizeToy(ArrayList<Integer> prizeToysID){
        
        try(FileWriter writer = new FileWriter("prizeToy.txt", true))
        {
            String text = "Issued toys ID: " + prizeToysID.get(0) + "\n\n";
            writer.write(text);       
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }

        prizeToysID.remove(0);
       
    }
    
}
