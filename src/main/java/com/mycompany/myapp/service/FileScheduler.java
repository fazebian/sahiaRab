package com.mycompany.myapp.service;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FileScheduler {

    private final FileService fileService;
    private static final Logger logger = LoggerFactory.getLogger(FileScheduler.class);

    public FileScheduler(FileService fileService) {
        this.fileService = fileService;
    }

    @Scheduled(fixedRate = 60000)
    public void writeToLogFile() {
        try {
            String content = "Données à écrire dans le fichier";
            fileService.writeToFile("chemin/vers/votre/fichier.txt", content);
        } catch (IOException e) {
            logger.error("Erreur lors de l'écriture dans le fichier", e);
        }
    }
}
