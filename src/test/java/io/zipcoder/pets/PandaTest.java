package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


public class PandaTest {

    @Test
    public void constructorTest() {
        String name = "Yun Zi";

        Panda panda = new Panda(name);

        Assert.assertEquals(name, panda.getName());
    }

    @Test
    public void speak() {
        Panda panda = new Panda("Yun Zi");

        String expected = "Meow!";

        Assert.assertEquals(expected, panda.speak());
    }
}