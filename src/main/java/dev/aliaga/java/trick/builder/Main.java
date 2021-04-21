package dev.aliaga.java.trick.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person
                .Builder("Mario", "Aliaga")
                .address("Cartagena, Chile")
                .email("mario@aliaga.dev")
                .build();

        System.out.println(person);
    }
}
