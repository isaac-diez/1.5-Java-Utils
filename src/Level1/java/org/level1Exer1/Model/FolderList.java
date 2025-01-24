package org.level1Exer1.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FolderList {

    public void getFolderTree(Path directory) {

        try (Stream<Path> stream = Files.list(directory)) {
            System.out.println("Running through directory...");
            stream
                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Failed at running through the directory: " + e.getMessage());
        }

    }

}
