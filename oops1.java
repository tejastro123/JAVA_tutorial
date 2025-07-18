 
class Student { //class is a blueprint for creating objects
    String name;
    int age;
  
    public void printInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }

    Student(String name, int age) { //parameterized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    
}

public class oops1 {
    public static void main(String args[]) {
        Student s1 = new Student("tejas", 19); // creating an object of Student class
        s1.printInfo();

        Student s2 = new Student(s1); // copy constructor
        s2.name = "sahil";
        s2.age = 20;
        s2.printInfo();
    }
}

