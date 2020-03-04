package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


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


}