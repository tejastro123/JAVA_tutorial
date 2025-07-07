// variables and data type

import java.util.*;
class variables {

   public static void main(String args[]){
    
      try (Scanner sc = new Scanner(System.in)) {
         int a  = sc.nextInt();
         int b = sc.nextInt();
         
         System.err.println(a+b);
         System.err.println(a*b);
         System.err.println(a-b);
         System.err.println(a/b);

         String name = sc.nextLine();
         System.out.println(name);
      }
   }
}

