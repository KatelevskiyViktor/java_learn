package seminar6HW;

import java.util.HashMap;

public class Cat {
    public int id;
    public int age;
    public String color;
    public int weight;
    public int height;
    public String name;
    public String breed;
    private int petID;
    private HashMap<Integer, String> vaccinationAndDate = new HashMap<>();
    private HashMap<Integer, String> diseasesAndDate = new HashMap<>();

    public HashMap<Integer, String> getVaccinationAndDate() {
        return vaccinationAndDate;
    }

    public void setVaccinationAndDate(HashMap<Integer, String> vaccinationAndDate) {
        this.vaccinationAndDate.putAll(vaccinationAndDate);
    }

    public HashMap<Integer, String> getDiseasesAndDate() {
        return diseasesAndDate;
    }

    public void setDiseasesAndDate(HashMap<Integer, String> diseasesAndDate) {
        this.diseasesAndDate.putAll(diseasesAndDate);
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    @Override
    public String toString() {
        return "Name kotejki is: " + this.name +
                "\nColor is: " + this.color +
                "\nAge is: " + this.age +
                "\nBreed is: " + this.breed +
                "\nWeight is: " + this.weight +
                "\nHeight is: " + this.height +
                "\nVaccination: " + this.vaccinationAndDate.get(this.getPetID()) +
                "\nDiseases: " + this.diseasesAndDate.get(this.getPetID());
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        return id == cat.id 
                && this.name == cat.name 
                && this.color == cat.color
                && this.age == cat.age 
                && this.breed == cat.breed
                && this.weight == cat.weight
                && this.height == cat.height
                && this.getPetID() == cat.getPetID()
                && this.getVaccinationAndDate().equals(cat.getVaccinationAndDate())
                && this.getDiseasesAndDate().equals(cat.getDiseasesAndDate());

    }

    
    @Override
    public int hashCode() {
        return this.id;
    }
}
