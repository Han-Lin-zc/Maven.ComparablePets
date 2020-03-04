package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


public class DogTest {

    @Test
    public void constructorTest() {
        String givenName = "Brian Griffin";

        Dog dog = new Dog(givenName);

        Assert.assertEquals(givenName, dog.getName());
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog("Brian Griffin");

        String expected = "I'm not drunk!";

        Assert.assertEquals(expected, dog.speak());
    }
}