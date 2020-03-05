package io.zipcoder.utilities;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class ComparePets implements Comparator<Pet> {


    @Override
    public int compare(Pet pet1, Pet pet2) {

        if (pet1.getClass().getName().equals(pet2.getClass().getName())) {
            return pet1.getName().compareTo(pet2.getName());

        } else if (!pet1.getClass().getName().equals(pet2.getClass().getName())) {
            return pet1.getClass().getName().compareTo(pet2.getClass().getName());
        }
        return 0;
    }
}
