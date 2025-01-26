package org.level2Exer1.Model;

public class App {

    private String directoryPath;
    private String filePath;
    private String fileName;

    public App(ConfigLoader config) {

        this.directoryPath = config.getProperty("directory.path");
        this.filePath = config.getProperty("file.path");
        this.fileName = config.getProperty("file.name");

    }

    public void getDirectoryInfo() {

        System.out.println("Directory path: " + this.directoryPath);

    }

    public void getFileInfo() {

        System.out.println("File path: " + this.filePath);
        System.out.println("File name: " + this.fileName);

    }

}
