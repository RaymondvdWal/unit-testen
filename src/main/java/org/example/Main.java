package org.example;

public class Main {
    public static void main(String[] args) {
        Person raymond = new Person("Raymond","van der Wal",'M',35);
        Person denise = new Person("Denise", "Brugman", 'V', 35);
        Person zoe = new Person("Zoe","van der Wal",'V',4);
        Person joann = new Person("Joann", "van der Wal", 'V',1);
        Pet hond = new Pet("Elza",4,"dog",raymond);

        zoe.addParents(denise,raymond,zoe);
        System.out.println(zoe.getMother().getFirstName());
        System.out.println(zoe.getFather().getFirstName());
        System.out.println(raymond.getChildren().get(0).getFirstName());
        System.out.println(denise.getChildren().get(0).getFirstName());

        joann.addChildToChildren(joann,raymond);
        System.out.println(raymond.getChildren().get(1).getFirstName());

        zoe.addSiblings(zoe,joann);
        joann.addSiblings(joann,zoe);
        System.out.println(joann.getSiblings().get(0).getFirstName());

    }


}