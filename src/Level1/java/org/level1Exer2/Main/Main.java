package org.level1Exer2.Main;

import org.level1Exer2.Model.FolderList;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        FolderList tree = new FolderList();

        Path directory = Paths.get("myFilesFolderTest");

        tree.getFolderTree(directory);



    }

}