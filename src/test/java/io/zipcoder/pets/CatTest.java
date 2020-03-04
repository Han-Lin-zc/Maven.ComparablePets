package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {

    @Test
    public void constructorTest() {
        String name = "Hello Kitty";

        Cat cat = new Cat(name);

        Assert.assertEquals(name, cat.getName());
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat("Hello Kitty");

        String expected = "I don't have a mouth.";

        Assert.assertEquals(expected, cat.speak());
    }

}