package seminar6HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import seminar6HW.Cat;

public class Main {
    public static void main(String[] args) {
        // a-1:
        Cat cat = new Cat();
        HashMap<Integer, String> mapV = new HashMap<>();
        HashMap<Integer, String> mapD = new HashMap<>();

        cat.id = 1;
        cat.breed = "siamese";
        cat.weight = 6;
        cat.height = 60;
        cat.name = "Vas'ka";
        cat.color = "gray";
        cat.age = 6;
        cat.setPetID(1223435467);
        mapV.put(cat.getPetID(), "cat distemper / 15.11.22");
        mapD.put(cat.getPetID(), "calciviroza / 17.11.21");
        cat.setVaccinationAndDate(mapV);
        cat.setDiseasesAndDate(mapD);

        // System.out.println(cat);

        // a-2,3:
        HashSet<Cat> dbCats = new HashSet<>();

        Cat cat2 = new Cat();
        cat2.id = 1;
        cat2.breed = "siamese";
        cat2.weight = 6;
        cat2.height = 60;
        cat2.name = "Vas'ka";
        cat2.color = "gray";
        cat2.age = 6;
        cat2.setPetID(1223435467);
        mapV.put(cat2.getPetID(), "cat distemper / 15.11.22");
        mapD.put(cat2.getPetID(), "calciviroza / 17.11.21");
        cat2.setVaccinationAndDate(mapV);
        cat2.setDiseasesAndDate(mapD);

        Cat cat3 = new Cat();
        cat3.id = 2;
        cat3.breed = "cheshire";
        cat3.weight = 5;
        cat3.height = 50;
        cat3.name = "Gav";
        cat3.color = "brown";
        cat3.age = 5;
        cat3.setPetID(1223695467);
        mapV.put(cat3.getPetID(), "chlamydia / 15.11.22");
        mapD.put(cat3.getPetID(), "ringworm / 17.11.21");
        cat3.setVaccinationAndDate(mapV);
        cat3.setDiseasesAndDate(mapD);

        dbCats.add(cat3);
        dbCats.add(cat);
        dbCats.add(cat2);

        Iterator<Cat> i = dbCats.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());
        // System.out.println();
        // }

        // a-4:
        System.out.println(cat.equals(cat2));

        while (i.hasNext()) {
            System.out.println(i.next());
            System.out.println();
        }
    }
}
