package org.level1Exer2.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FolderList {

    public void getFolderTree(Path directory) {

        try (Stream<Path> stream = Files.walk(directory)) {
            System.out.println("Running through directory...");
            stream
                    .sorted()
                    .forEach(path ->{
                        try {
                            if (Files.isDirectory(path)) {
                                System.out.println(path + " (D) " + Files.getLastModifiedTime(path));
                            } else {
                                System.out.println(path + " (F) " + Files.getLastModifiedTime(path));
                            }
                        }catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
        } catch (IOException e) {
            System.err.println("Failed at running through the directory: " + e.getMessage());
        }

    }

}