package dev.aliaga.java.trick.builder;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private String email;

    public Person(Builder builder) {
        name = builder.name;
        lastName = builder.lastName;
        address = builder.address;
        email = builder.email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String lastName;
        private String address;
        private String email;

        public Builder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Person build() {
            return new Person(this);
        }

        public Builder name(String valor) {
            name = valor;
            return this;
        }

        public Builder lastName(String valor) {
            lastName = valor;
            return this;
        }

        public Builder address(String valor) {
            address = valor;
            return this;
        }

        public Builder email(String valor) {
            email = valor;
            return this;
        }
    }
}
