package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person raymond;
    Person denise;
    Person zoe;
    Person joann;
    Pet hond;
    ArrayList<Person> children;
    ArrayList<Person> siblings;
    ArrayList<Pet> pet;
    @BeforeEach
    void setUp() {
        raymond = new Person("Raymond", "van der Wal", 'M', 35);
        denise = new Person("Denise", "Brugman", 'V', 35);
        zoe = new Person("Zoe", "van der Wal", 'V', 4);
        joann = new Person("Joann", "van der Wal", 'V',1);
        hond = new Pet("Elza",4,"dog",raymond);
        children = new ArrayList<>();
        children.add(zoe);
        siblings = new ArrayList<>();
        siblings.add(joann);
        pet = new ArrayList<>();
        pet.add(hond);
    }

    @Test
    void setChildren() {

        //Arrange

        //Act
        raymond.setChildren(children);

        //Assert
        assertEquals("Zoe", raymond.getChildren().get(0).getFirstName());
        assertEquals(1,raymond.getChildren().size());
    }


    @Test
    void getMother() {

        //Arrange
        zoe.setMother(denise);

        //Act
        zoe.getMother();

        //Assert
        assertEquals("Denise",zoe.getMother().getFirstName());
    }

    @Test
    void setMother() {

        //Arrange

        //Act
        zoe.setMother(denise);

        //Assert
        assertEquals("Denise",zoe.getMother().getFirstName());
    }

    @Test
    void getFather() {

        //Arrange
        zoe.setFather(raymond);
        //Act
        zoe.getFather();

        //Assert
        assertEquals("Raymond",zoe.getFather().getFirstName());
    }

    @Test
    void setFather() {

        //Arrange

        //Act
        zoe.setFather(raymond);

        //Assert
        assertEquals("Raymond",zoe.getFather().getFirstName());
    }

    @Test
    void getSiblings() {

        //Arrange
        zoe.setSiblings(siblings);
        //Act
        zoe.getSiblings().get(0);
        //Assert
        assertEquals("Joann",zoe.getSiblings().get(0).getFirstName());
    }

    @Test
    void setSiblings() {

        //Arrange

        //Act
        zoe.setSiblings(siblings);

        //Assert
        assertEquals("Joann",zoe.getSiblings().get(0).getFirstName());
    }

    @Test
    void getChildren() {

        //Arrange
        raymond.setChildren(children);
        //Act
        raymond.getChildren().get(0);
        //Assert
        assertEquals("Zoe",raymond.getChildren().get(0).getFirstName());
    }

    @Test
    void SetChildren() {

        //Arrange

        //Act
        raymond.setChildren(children);
        //Assert
        assertEquals("Zoe",raymond.getChildren().get(0).getFirstName());
    }

    @Test
    void getPet() {

        //Arrange
        raymond.setPet(pet);
        //Act
        raymond.getPet().get(0);
        //Assert
        assertEquals("Elza",raymond.getPet().get(0).getName());
    }

    @Test
    void setPet() {

        //Arrange

        //Act
        raymond.setPet(pet);
        //Assert
        assertEquals("Elza",raymond.getPet().get(0).getName());
    }

    @Test
    void getFirstName() {

        //Arrange

        //Act
        String name = raymond.getFirstName();
        //Assert
        assertEquals("Raymond",name);
    }

    @Test
    void setFirstName() {

        //Arrange

        //Act
        raymond.setFirstName("Jan");

        //Assert
        assertEquals("Jan",raymond.getFirstName());
    }

    @Test
    void getMiddleName() {

        //Arrange
        raymond.setMiddleName("Piet");
        //Act
        String middleName = raymond.getMiddleName();

        //Assert
        assertEquals("Piet",middleName);
    }

    @Test
    void setMiddleName() {

        //Arrange

        //Act
        raymond.setMiddleName("Klaas");

        //Assert
        assertEquals("Klaas", raymond.getMiddleName());
    }

    @Test
    void getLastName() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void setLastName() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void getSex() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void setSex() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void getAge() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void setAge() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    void addParents() {
        //Arrange


        //Act
        zoe.addParents(denise,raymond,zoe);

        //Assert
        assertEquals("Denise",zoe.getMother().getFirstName());
    }

    @Test
    void addChildToChildren() {

        //Arrange

        //Act
        joann.addChildToChildren(joann,raymond);

        //Assert
        assertEquals("Joann",raymond.getChildren().get(0).getFirstName());
    }

    @Test
    void addSiblings() {

        //Arrange

        //Act
        zoe.addSiblings(zoe,joann);

        //Assert
        assertEquals("Joann",zoe.getSiblings().get(0).getFirstName());
    }

    @Test
    void addPet() {

        //Arrange

        //Act
        raymond.addPet(raymond,hond);

        //Assert
        assertEquals("Elza",raymond.getPet().get(0).getName());
    }
}