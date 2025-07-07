//functions practice

import java.util.*;

class s1 {
   public static void printSum(int n) {
       int sum = 0;

      for(int i=1; i<=n; i++) {
        if(i % 2 != 0) {
            sum = sum + i;
        }
      }
      System.out.println(sum);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printSum(n);
   }   
}

class s2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();


      int average = (a + b + c) / 3;
      System.out.println(average);
   }   
}

class s3 {
   public static int getGreater(int a, int b) {
      if(a > b) {
          return a;
      } else {
          return b;
      }
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(getGreater(a, b));
   }   
}

class s4 {
   public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Double r = sc.nextDouble();
      System.out.println(getCircumference(r));
   }   
}

class s5 {
   public static boolean isElligible(int age) {
       if(age > 18) {
           return true;
       }
       return false;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      System.out.println(isElligible(age));
   }   
}

class s6 {
   public static void main(String args[]) {
       int positive = 0, negative = 0, zeros = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();


       while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }


           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }


       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   
}

class s7 {
   public static void main(String args[]) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();


       int result = 1;
       //Please see that n is not too large or else result will exceed the size of int
       for(int i=0; i<n; i++) {
           result = result * x;
       }


       System.out.println("x to the power n is : "+ result);
   }   
}

class s8 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();


       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD is : "+ n2);
   }   
}

class s9 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
   }   
}
