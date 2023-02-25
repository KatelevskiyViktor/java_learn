package ic;

public class Program {
    public static void main(String[] args) {
        Toy t_one = new Toy(1, "Bear", 2, 20);
        Toy t_two = new Toy(2, "Horse", 1, 60);
        Toy t_three = new Toy(3, "Bird", 1, 50);

        DB db = new DB();
        db.addToy(t_one);
        db.addToy(t_two);
        db.addToy(t_three);

        Scam scam = new Scam();

        scam.rafflePrizeToy(db.toys, db.prizeToys);
        scam.rafflePrizeToy(db.toys, db.prizeToys);

        scam.getPrizeToy(db.prizeToys);
        

        for (Toy t : db.toys) {
            System.out.println("All toys: " + t.name + " || Count:" + t.count);
        }

        for (Integer pt : db.prizeToys) {
            System.out.println("Not issued toys ID: " + pt);
        }

        
    }
}
