import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create 3 animal objects for the zoo
        Animal animal1 = new Animal("Tiger", "Jungle", 660, true, true);
        Animal animal2 = new Animal("Kangaroo", "Australian Outback", 200, false, false);
        Animal animal3 = new Animal("Wolf", "Deep Forest", 175, false, true);

        //Arraylist to store animal objects, should probably call it a zoo
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(animal1);
        zoo.add(animal2);
        zoo.add(animal3);


        //Run program introduction
        System.out.println("\nWelcome to the zoo! Let's interact with some of our animals..");

        //Loop through to print animal info
        for (int i = 0; i < zoo.size(); i++) {
            System.out.println("\nLet's bring out our " + zoo.get(i).getSpecies());
            System.out.println("The " + zoo.get(i).getSpecies() + " comes into view and says " + zoo.get(i).animalSound());
            System.out.println(zoo.get(i).feedAnimal());
            System.out.println(zoo.get(i).animalState());
        }
    }
}