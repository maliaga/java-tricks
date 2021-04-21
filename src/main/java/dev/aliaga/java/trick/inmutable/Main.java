package dev.aliaga.java.trick.inmutable;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Address", "7", "Cartagena");
        Employe employe = new Employe(121323, "Mario", address);

        System.out.println("The address is " + employe.getAddress());

        Address newAddress = employe.getAddress();
        newAddress.setNumber("8");

        System.out.println("The address is " + employe.getAddress());
    }
}
