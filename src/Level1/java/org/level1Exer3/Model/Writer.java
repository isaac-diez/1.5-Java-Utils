package org.level1Exer3.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {

        private final String filename;

        public Writer(String filename) {
            this.filename = filename;
        }

        public void writeToFile(ArrayList<String> tree) {
            try (FileWriter myWriter = new FileWriter(filename, false)) {
                for (String item : tree) {
                    myWriter.write(item + "\n");
                }
                System.out.println("Successfully saved to file");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

