package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name ="";
    private int age = Integer.MAX_VALUE ;
    private int height = Integer.MAX_VALUE;
    private int weight = Integer.MAX_VALUE;
    private String lastName = "";
    private String favColor = "";

    public Person() {
    }
    public Person(String name, int age, int height, int weight, String lastName, String favColor){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.lastName = lastName;
        this.favColor = favColor;
    }


    public Person(int age) {
        this.age=age;
    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavColor() {
        return favColor;
    }
}
