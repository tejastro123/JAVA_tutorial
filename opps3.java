// inheritance 

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }
}

class EquilateralTriangle extends Triangle {
   public void area(int side) {
         System.out.println((Math.sqrt(3)/4) * side * side);
    }
}


public class opps3 {
    
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(5, 6);
        Circle c = new Circle();
        c.area(5);
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(5);
        Shape s = new Shape();
        s.area();
    }
}
