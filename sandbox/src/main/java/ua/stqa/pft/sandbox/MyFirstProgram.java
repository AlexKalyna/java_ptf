package ua.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
       hello("world");
        hello("User");
        hello("Alex");
        double l = 5;
      System.out.println("Square area with " + l + " = " + area(l));

      double a = 4;
      double b = 6;
      System.out.println("Square area of rectangle with " + a + " and " + b + " = " + area(a,b));


    }

    public static void hello (String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double len){
      return len * len;
    }

    public static double area (double a, double b){
      return a * b;
    }
}