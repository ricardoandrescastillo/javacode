package com.practice.java11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FilesApp {

    public static void main (String ... args) throws IOException {
        useFile();
    }

    private static void useFile() throws IOException {
        Path path = Paths.get("src/main/resources/example.txt");
        Files.writeString(path, "Hello, World!");
        String content = Files.readString(path);
        System.out.println(content); // "Hello, World!"
        if (Files.notExists(path)) {
            System.out.println("File does not exist");
        }
    }
}
