package org.level1Exer5.Main;

import org.level1Exer5.Model.Person;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Isaac", 47);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser")) {

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            System.out.println("Serialized object \""+person+"\" and saved to person.ser");

        }   catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());

        }

        try (FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person = (Person) in.readObject();
            System.out.println("Object deserialized: \"" + person + "\"");

    } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
