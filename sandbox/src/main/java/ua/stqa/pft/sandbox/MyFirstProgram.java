package ua.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
       hello("world");
        hello("User");
        hello("Alex");

        Square s = new Square(5);
      System.out.println("Square area with " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4,6);

      System.out.println("Square area of rectangle with " + r.a + " and " + r.b + " = " + r.area());


    }

    public static void hello (String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

}