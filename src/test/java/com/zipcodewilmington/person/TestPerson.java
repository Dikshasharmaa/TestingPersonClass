package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedHeight = Integer.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;
        String expectedLastName = "";
        String expectedFavColor = "";



        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualLastName = person.getLastName();
        String actualFavColor = person.getFavColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedFavColor, actualFavColor);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllValues() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedHeight = 5;
        Integer expectedWeight = 50;
        String expectedLastName = "Smith";
        String expectedFavColor = "Blue";

        // When
        Person person = new Person(expectedName,expectedAge,expectedHeight,expectedWeight,expectedLastName,expectedFavColor);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualLastName = person.getLastName();
        String actualFavColor = person.getFavColor();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedFavColor, actualFavColor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 50;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "Smith";

        // When
        person.setLastName(expected);
        String actual = person.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setFavColor(expected);
        String actual = person.getFavColor();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
