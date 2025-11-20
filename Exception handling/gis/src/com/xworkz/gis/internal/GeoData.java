package com.xworkz.gis.internal;

import com.xworkz.gis.event.*;

public class GeoData {
   
    public double validateCoordinate(double latitude, double longitude) {
        if (latitude < -90.0 || latitude > 90.0 || longitude < -180.0 || longitude > 180.0) {
            try {
                throw new InvalidCoordinateException();
            } catch (InvalidCoordinateException e) {
                e.printStackTrace();
                System.out.println("Handled: Coordinate is outside the valid range (Latitude: " + latitude + ").");
            }
        } else {
            System.out.println("Coordinate (" + latitude + ", " + longitude + ") is valid.");
        }
        return latitude;
    }


    public String checkDataFormat(String fileExtension) {
        if (!fileExtension.equals("GeoJSON")) {
            try {
                throw new DataFormatMissingException();
            } catch (DataFormatMissingException e) {
                e.printStackTrace();
                System.out.println("Handled: Required data format (GeoJSON) is missing. Received: " + fileExtension + ".");
            }
        } else {
            System.out.println("Data format (" + fileExtension + ") is correct for processing.");
        }
        return fileExtension;
    }

    public String checkProjection(String crs) {
        if (!crs.equals("EPSG:3857")) {
            try {
                throw new ProjectionMismatchException();
            } catch (ProjectionMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: Projection mismatch. Expected EPSG:3857, received " + crs + ".");
            }
        } else {
            System.out.println("Projection (" + crs + ") matches the project requirement.");
        }
        return crs;
    }


    public int checkStudyAreaContainment(int featureCount) {
        if (featureCount == 0) {
            try {
                throw new FeatureOutsideStudyAreaException();
            } catch (FeatureOutsideStudyAreaException e) {
                e.printStackTrace();
                System.out.println("Handled: No features found in the study area. Feature likely outside the defined boundary.");
            }
        } else {
            System.out.println("Feature containment check passed. " + featureCount + " features found.");
        }
        return featureCount;
    }


    public int checkConnectionSpeed(int timeSeconds) {
        if (timeSeconds > 60) {
            try {
                throw new ConnectionTimeoutException();
            } catch (ConnectionTimeoutException e) {
                e.printStackTrace();
                System.out.println("Handled: Data connection or processing timed out after " + timeSeconds + " seconds.");
            }
        } else {
            System.out.println("Processing speed is acceptable (" + timeSeconds + " seconds).");
        }
        return timeSeconds;
    }
}
