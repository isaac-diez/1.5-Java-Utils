package org.level1Exer4.Model;

import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {

    public void readFromFile(String filename) {

        try (
                Scanner scanner = new Scanner(Paths.get(filename))) {

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();
                System.out.println(row);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}