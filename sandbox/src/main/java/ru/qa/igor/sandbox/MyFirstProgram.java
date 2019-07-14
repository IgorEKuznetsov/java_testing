package ru.qa.igor.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
      hello("world!");
      hello("Igor");
      hello("Everybody");

      double a = 8;
      String y = "Площадь квадрата со стороной ";
      System.out.println(("Площадь квадрата со стороной ")+ a + " = " + area(a));

      System.out.println(y  + a + " = " + area(a));
      

  }
      public static void hello(String smt) {
          System.out.println("Hello, " + smt);
      }




      public static double area(double a){
      return a * a;
      }
 }
