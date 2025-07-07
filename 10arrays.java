//Arrays

import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        for(int i=0; i<size; i++) {
            marks[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            System.out.print(marks[i]+" ");
        }  
    }
}

class A1 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String names[] = new String[size];

      //input
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}

class A2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];

      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }

       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}


class A3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}