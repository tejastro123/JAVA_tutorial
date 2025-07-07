// conditional statements

import java.util.*;

class conditions {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {

            int age = sc.nextInt();
            if(age>18){
                System.err.println("Adult");
            } else{
                System.err.println("Child");
            }

            int x = sc.nextInt();
            if(x%2==0){
                System.err.println("EVEN");
            } else{
                System.err.println("ODD");
            }

            int button = sc.nextInt();
            switch (button) {
                case 1 : System.out.println("Monday");
                break;
                case 2 : System.out.println("Tuesday");
                break;
                case 3 : System.out.println("Wednesday");
                break;
                case 4 : System.out.println("Thursday");
                break;
                case 5 :  System.out.println("Friday");
                break;
                case 6 : System.out.println("Saturday");
                break;
                default: System.out.println("Sunday");
            }
        }
    }
}