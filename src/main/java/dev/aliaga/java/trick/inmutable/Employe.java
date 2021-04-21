package dev.aliaga.java.trick.inmutable;

public class Employe {
    private final int id;
    private final String name;
    private final Address address;

    public Employe(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = new Address(address.getStreet(), address.getNumber(), address.getCity());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getStreet(), address.getNumber(), address.getCity());
    }

    public Employe changeName(String newName){
        return new Employe(id, newName, address);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
