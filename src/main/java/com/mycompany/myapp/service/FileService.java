package com.mycompany.myapp.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    public void createFile(String filePath) throws IOException {
        Files.createFile(Path.of(filePath));
    }

    public void writeToFile(String filePath, String content) throws IOException {
        Files.write(Path.of(filePath), content.getBytes(), StandardOpenOption.APPEND);
    }

    public List<String> readFromFile(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }
}
