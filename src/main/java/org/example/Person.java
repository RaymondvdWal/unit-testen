package org.example;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    Person mother;
    Person father;
    ArrayList<Person> siblings;
    ArrayList<Person> children;
    ArrayList<Pet> pet;

    public Person(String firstName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public void setPet(ArrayList<Pet> pet) {
        this.pet = pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addParents(Person mother, Person father, Person child){
        child.setMother(mother);
        child.setFather(father);
        mother.addChildToChildren(child, mother);
        father.addChildToChildren(child, father);
    }

    public void addChildToChildren(Person child, Person parent){
        ArrayList<Person> kids = new ArrayList<>();
        if(parent.getChildren()!= null) {
            kids.addAll(parent.getChildren());
        }
        kids.add(child);
        parent.setChildren(kids);
    }


    public void addSiblings(Person person, Person sibling){
        ArrayList<Person> family = new ArrayList<>();
        if (person.getSiblings() != null) {
            family.addAll(person.getSiblings());
        }
        family.add(sibling);
        person.setSiblings(family);
    }

    public void addPet(Person person, Pet pet){
        ArrayList<Pet> pets = new ArrayList<>();
        if(person.getPet() != null){
            pets.addAll(person.getPet());
        }
        pets.add(pet);
        person.setPet(pets);
    }


}
