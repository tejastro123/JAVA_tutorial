//polymorphism in java

//1. Method Overloading (Compile-time polymorphism or static polymorphism)

class Student{
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }


   public void displayInfo(int age) {
       System.out.println(age);
   }


   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}

//2. Method Overriding (Runtime polymorphism or dynamic polymorphism)
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
