// loops

import java.util.*;

class L4 {
    public static void main(String args[]){

        int n = 25;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
           }
        }

        try (Scanner sc = new Scanner(System.in)) {
            int input;


            do{
                int marks = sc.nextInt();
                if(marks >= 90 && marks <= 100) {
                   System.out.println("This is Good");
                }else if(marks >= 60 && marks <= 89) {
                   System.out.println("This is also Good");
                }else if(marks >= 0 && marks <= 59) {
                   System.out.println("This is Good as well");
                }else{
                   System.out.println("Invalid");
                }


                System.out.println("Want to continue ? (yes(1) or no(0))");
                input = sc.nextInt();
     
            } while(input==1);

            int x = sc.nextInt();
            boolean isPrime = true;

            for(int i=2; i<=x/2; i++) {
                if(x % i == 0) {
                    isPrime = false;
                    break;
                }     
            }

            if(isPrime) {
                if(x == 1){
                    System.out.println("This is neither prime not composite");
                } else{
                    System.out.println("This is a prime number");
                }
            } else{
                System.out.println("This is not a prime number");
            }

            int a = sc.nextInt();
            int sum = 0;
            for(int i=0; i<=a; i++){
                sum += i;
            }
            System.out.println(sum);

            int y = sc.nextInt();
            for(int i=0; i<11; i++){
                System.out.println(i*y);
            }
        }

    }
}
