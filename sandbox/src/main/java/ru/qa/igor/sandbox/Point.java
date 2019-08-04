package ru.qa.igor.sandbox;

public class Point {
    double x1;
    double y1;
    double x2;
    double y2;
    public Point(double x1, double y1, double x2, double y2){
       this.x1 = x1;
       this.x2 = x2;
       this.y1 = y1;
       this.y2 = y2;
    }
    public double distance(){
        double a = this.x2 - this.x1;
        double b = this.y2 - this.y1;
        return Math.sqrt(Math.pow(a, a) + Math.pow(b, b));

    }

}
