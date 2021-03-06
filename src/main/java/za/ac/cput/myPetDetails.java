package za.ac.cput;
/* Breyton Ernstzen - 217203027
         GIT and TDD group excercise
         4 February 2022

 */
public class myPetDetails {
    private String name;
    private String breed;
    private String specie;
    private int numberOfLegs;

    //Default constructor
    public myPetDetails(){
        this.name = "";
        this.breed = "";
        this.specie ="";
        this.numberOfLegs = 0;
    }

    public myPetDetails(String name, String breed, String specie, int numberOfLegs) {
        this.name = name;
        this.breed = breed;
        this.specie = specie;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "myPets{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", specie='" + specie + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
