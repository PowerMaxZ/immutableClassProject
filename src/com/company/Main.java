package com.company;

public class Main {

    public static void main(String[] args) {
	    Address address = new Address("Kyiv", "Ukraine");
	    Student Max = new Student("Max", 1, address);

	    System.out.println("Student's id: " + Max.getId());
        System.out.println("Student's name: " + Max.getName());
        System.out.println("Student's city: " + Max.getAddress().getCity());
        System.out.println("Student's country: " + Max.getAddress().getCountry());

        address.setCountry("Poland");
        address.setCity("Krakow");

        System.out.println("\n Address changed?\n");

        System.out.println("Student's id: " + Max.getId());
        System.out.println("Student's name: " + Max.getName());
        System.out.println("Student's city: " + Max.getAddress().getCity());
        System.out.println("Student's country: " + Max.getAddress().getCountry());
    }
}
