package com.company;

import java.io.Serializable;

public final class Student implements Serializable {
    private final String name;
    private final Address address;
    private final int id;
    public volatile transient int hashCode;

    public Student(String name, int id, Address address) {
        this.address = new Address(address.getCountry(), address.getCity());
        this.name = name;
        this.id = id;
    }

    public Address getAddress() { return new Address(address.getCountry(), address.getCity()); }

    public String getName() { return name; }

    public int getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student cp = (Student) o;
        return (cp.name.equals(name) && cp.id == id &&
                cp.address.getCity().equals(getAddress().getCity()) &&
                cp.address.getCountry().equals(getAddress().getCountry()));
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 15;
            result = 27 * result + id;
            result = 27 * result + Integer.parseInt(name);
            result = 27 * result + Integer.parseInt(address.getCity());
            result = 27 * result + Integer.parseInt(address.getCountry());
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("[Student %d: name=%s, country=%s, city=%s]", id, name, address.getCountry(), address.getCity());
    }
}
