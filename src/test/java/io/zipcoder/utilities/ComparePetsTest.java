package io.zipcoder.utilities;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Panda;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;


public class ComparePetsTest {

    @Test
    public void compareTest() {
        Panda panda1 = new Panda("Jungkook");
        Panda panda2 = new Panda("RapMon");
        Panda panda3 = new Panda("Jin");
        Panda panda4 = new Panda("Jimin");
        Dog dog1 = new Dog("V");
        Dog dog2 = new Dog("SUGA");
        Cat cat = new Cat("J-Hope");

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(panda1);
        pets.add(dog1);
        pets.add(cat);
        pets.add(panda2);
        pets.add(panda3);
        pets.add(panda4);
        pets.add(dog2);

        ArrayList<Pet> expected = new ArrayList<>();
        expected.add(cat);
        expected.add(dog2);
        expected.add(dog1);
        expected.add(panda4);
        expected.add(panda3);
        expected.add(panda1);
        expected.add(panda2);

        ComparePets comparePets = new ComparePets();
        Collections.sort(pets, comparePets);

        Assert.assertEquals(expected,pets);
    }
}