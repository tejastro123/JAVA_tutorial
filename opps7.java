// Static Keyword 

class Student {
   static String school;
   String name;   

   public void changeSchool(String newSchool) {
      school = newSchool;
   }
}


public class opps7 {
   public static void main(String args[]) {
      Student.school = "SCS";
      Student s1 = new Student(); 
      Student s2 = new Student();

      s1.name = "Meena";
      s2.name = "Beena";

      System.out.println(s1.school);
      System.out.println(s2.school);

      s1.changeSchool("SCS High School");
      System.out.println(s1.school);
      System.out.println(s2.school);
   }
}
