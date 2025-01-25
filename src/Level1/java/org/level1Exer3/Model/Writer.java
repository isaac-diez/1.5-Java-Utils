package org.level1Exer3.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {

    private FileWriter myWriter;

    public Writer(String filename) {
        try {
            this.myWriter = new FileWriter(filename, false);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void writeToFile(ArrayList<String> tree ) {

        try{
            for (String item : tree){
                this.myWriter.write(item + "\n");
            }
            this.myWriter.close();
            System.out.println("Successfully saved to file");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        }

    }

}