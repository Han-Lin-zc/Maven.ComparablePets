package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;


public class PetTest {

    @Test
    public void dogInheritanceTest() {
        Pet p = new Dog("Brian Griffin");
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void catInheritanceTest() {
        Pet p = new Cat("Hello Kitty");
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void compareToTest() {

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
        expected.add(panda4);
        expected.add(panda3);
        expected.add(panda1);
        expected.add(panda2);
        expected.add(dog2);
        expected.add(dog1);

        Collections.sort(pets);
        Assert.assertEquals(expected,pets);
    }
}