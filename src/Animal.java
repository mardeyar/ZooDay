public class Animal {

    //Define the properties of an animal
    private String species;
    private String habitat;
    private int maxWeight;
    private boolean isEndangered;
    private boolean isCarnivore;

    public Animal(String species, String habitat, int maxWeight, boolean isEndangered, boolean isCarnivore) {
        this.species = species;
        this.habitat = habitat;
        this.maxWeight = maxWeight;
        this.isEndangered = isEndangered;
        this.isCarnivore = isCarnivore;
    }

    //region "Setters & Getters"
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
    //endregion

    //region "Animal Methods"
    protected String feedAnimal() {
        if (isCarnivore == true) {
            return "You fed the " + species + " a piece of meat.";
        } else {
            return "You fed the " + species + " a handful of berries.";
        }
    }

    protected String animalSound() {
        if (species == "Tiger") {
            return "ROOOOARRRR!";
        } else if (species == "Kangaroo") {
            return "GRRRUUUUUNNNTT!";
        } else {
            return "AWWWOUUUUUUUU!";
        }
    }

    protected String animalState() {
        if (isEndangered == true) {
            return "I am a " + maxWeight + "lb " + species + " that lives in the " + habitat + ". I am an endangered species";
        } else {
            return "I am a " + maxWeight + "lb " + species + " that lives in the " + habitat + ". I am NOT an endangered species";
        }
    }
}
