package org.level1Exer4.Main;

import org.level1Exer3.Model.FolderList;
import org.level1Exer3.Model.Writer;
import org.level1Exer4.Model.Reader;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FolderList tree = new FolderList();

        Path directory = Paths.get("myFilesFolderTest");

        ArrayList<String> treeList;

        Writer myWriter = new Writer("myFilesFolderTest/documents/tree.txt");

        Reader myReader = new Reader();

        treeList = tree.getFolderTree(directory);

        myWriter.writeToFile(treeList);

        myReader.readFromFile("myFilesFolderTest/documents/provinces.txt");





    }
}