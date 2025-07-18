// functions and methods\

import java.util.Scanner;

class L7 {
   //A METHOD to calculate sum of 2 numbers - a & b
    public static int sum(int a, int b) {
       return a + b;
    }

    public static int multiply(int a, int b) {
       return a*b;
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void printFactorial(int n) {
        if(n < 0) {
           System.out.println("Invalid Number");
           return;
        }
        int factorial = 1;
        
        for(int i=n; i>=1; i--) {
           factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }


    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b); 
        int mul = multiply(a, b);

        System.out.println(sum);
        System.out.println(mul);

        int n = sc.nextInt();
        printFactorial(n);

    }
}

