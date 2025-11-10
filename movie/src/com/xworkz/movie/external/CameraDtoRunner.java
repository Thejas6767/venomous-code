package com.xworkz.movie.external;


import com.xworkz.movie.dto.CameraDto;

public class CameraDtoRunner {
    public static void main(String[] args) {
        CameraDto camera1 = new CameraDto();
        camera1.setCameraID(601);
        camera1.setShutterCount(50000L);
        camera1.setIsDigital(true);
        camera1.setFormat('F');
        camera1.setRentalPricePerDay(1500.0);
        camera1.setSensorSize(35.0f);
        camera1.setBrand("Arri");
        camera1.setModel("Alexa Mini");
        camera1.setMaxFPS(120);
        camera1.setAssetTag(10012023L);
        camera1.setResolutionMP(4.5);
        camera1.setWeightKg(2.3f);
        camera1.setIsAvailable(true);

        System.out.println("---- CAMERA DETAILS ----");
        System.out.println(camera1);
    }
}