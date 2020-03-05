package io.zipcoder.pets;

public abstract class Pet implements PetSpeak, Comparable<Pet> {

    String name;

    public Pet(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }



    @Override
    public int compareTo(Pet o) {

        if (this.getName().equals(o.getName())) {
            return this.getClass().getName().compareTo(o.getClass().getName());

        } else if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        return 0;
    }
}
