package com.javabackendsnippets.github.javabackendsnippets.OpenCV.FaceDetection;

import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.springframework.stereotype.Service;

@Service
public class FaceDetection {

    public void storeFacesFromImage(String imageURL) {

        CascadeClassifier classifier = new CascadeClassifier("src/main/resources/model/haarcascade_frontalface_default.xml");

        Mat image = Imgcodecs.imread(imageURL);

        if (image.empty()) {
            System.out.println("Empty image");
            return;
        }

        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);

        MatOfRect faces = new MatOfRect();
        classifier.detectMultiScale(grayImage, faces);

        if (faces.empty()) {
            System.out.println("Faces not found");
            return;
        }

        int padding = 20, i = 0;

        for (Rect rect : faces.toArray()) {
            int x = Math.max(rect.x - padding, 0);
            int y = Math.max(rect.y - padding, 0);
            int width = Math.min(rect.width + 2 * padding, image.cols() - x);
            int height = Math.min(rect.height + 2 * padding, image.rows() - y);

            Mat faceROI = new Mat(image, new Rect(x, y, width, height));

            Imgcodecs.imwrite("face_" + (++i) + ".jpg", faceROI);
        }
    }
}
