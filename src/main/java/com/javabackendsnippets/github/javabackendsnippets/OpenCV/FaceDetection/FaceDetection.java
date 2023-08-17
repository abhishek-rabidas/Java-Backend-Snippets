package com.javabackendsnippets.github.javabackendsnippets.OpenCV.FaceDetection;

import org.opencv.objdetect.CascadeClassifier;

public class FaceDetection {

    public void storeFacesFromImage(String imageURL) {

        CascadeClassifier classifier = new CascadeClassifier("src/main/resources/model/haarcascade_frontalface_default.xml");
    }
}
