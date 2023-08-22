package com.javabackendsnippets.github.javabackendsnippets.OpenCV;

import jakarta.annotation.PostConstruct;
import nu.pattern.OpenCV;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadOpenCV {

    @PostConstruct
    public void loadOpenCV() {
        try {
            OpenCV.loadLocally();
        } catch (Exception e) {
            System.out.println("Failed loading OpenCV");
        }

    }
}
