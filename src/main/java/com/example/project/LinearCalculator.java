package com.example.project;


public class LinearCalculator {
    // Instance variables
    int x1;
    int x2;
    int y1;
    int y2;


    // Constructor
    public LinearCalculator(String point1, String point2) {
        this.x1 = Integer.parseInt(point1.substring(1, point1.indexOf(',')));
        this.y1 = Integer.parseInt(point1.substring(point1.indexOf(',') + 1, point1.length() - 1));
        this.x2 = Integer.parseInt(point2.substring(1, point2.indexOf(',')));
        this.y2 = Integer.parseInt(point2.substring(point2.indexOf(',') + 1, point2.length() - 1));
    }


    // Getters and setters (similar to previous versions)


    // Methods for calculating slope, y-intercept, distance, etc.
    // As per the previous implementation


    // findSymmetry method to determine if the points are symmetric
    public String findSymmetry() {
        if (y1 == -y2 && x1 == x2) {
            return "Symmetric about the x-axis";
        } else if (x1 == -x2 && y1 == y2) {
            return "Symmetric about the y-axis";
        } else if (x1 == -x2 && y1 == -y2) {
            return "Symmetric about the origin";
        } else {
            return "No symmetry";
        }
    }


    // Midpoint method to calculate the midpoint between two points
    public String Midpoint() {
        double midX = (x1 + x2) / 2.0;
        double midY = (y1 + y2) / 2.0;
        return "The midpoint of this line is: (" + roundedToHundredth(midX) + "," + roundedToHundredth(midY) + ")";
    }


    // Utility method to round a double to the nearest hundredth
    public double roundedToHundredth(double value) {
        return Math.round(value * 100.0) / 100.0;
    }


    // Updated printInfo method
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("The two points are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
        info.append("\nThe equation of the line between these points is: " + equation());
        info.append("\nThe slope of this line is: " + slope());
        info.append("\nThe y-intercept of the line is: " + yInt());
        info.append("\nThe distance between


