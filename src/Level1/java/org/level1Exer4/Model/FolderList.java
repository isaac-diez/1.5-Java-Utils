package org.level1Exer4.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FolderList {

    public ArrayList<String> getFolderTree(Path directory) {

        ArrayList<String> tree = new ArrayList<>();

        try (Stream<Path> stream = Files.walk(directory)) {
            System.out.println("Running through directory...");
            stream
                    .sorted()
                    .forEach(path ->{
                        try {
                            if (Files.isDirectory(path)) {
                                tree.add(path + " (D) " + Files.getLastModifiedTime(path));
                            } else {
                                tree.add(path + " (F) " + Files.getLastModifiedTime(path));
                            }
                        }catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
        } catch (IOException e) {
            System.err.println("Failed at running through the directory: " + e.getMessage());
        }

        return tree;
    }

}