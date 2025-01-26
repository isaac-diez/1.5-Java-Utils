package org.level2Exer1.Main;

import org.level2Exer1.Model.App;
import org.level2Exer1.Model.ConfigLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            ConfigLoader config = new ConfigLoader("config.properties");
            App app = new App(config);

            app.getDirectoryInfo();
            app.getFileInfo();
        } catch (IOException e) {
            System.out.println("Failed retrieving config" + e.getMessage());
        }

    }

}
