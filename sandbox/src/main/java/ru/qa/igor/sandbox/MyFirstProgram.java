package ru.qa.igor.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
      hello("everybody");
      Square s = new Square(5);
      String y = "Площадь квадрата со стороной ";
      System.out.println(y  + s.l + " = " + s.area());
      Rectangle r = new Rectangle(4, 6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
      Point p = new Point(5, 2, 7, 4);
      System.out.println("Расстояние между точками с координатами  " +
              "(x1 = "  + p.x1 + " y1= " + p.y1 + " и x2 = " + p.x2 + " y2 = " + p.y2 + ")" + " = " + p.distance());
  }
      public static void hello(String smt) {
          System.out.println("Hello, " + smt);
      }

 }
