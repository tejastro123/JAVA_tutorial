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
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                default -> System.out.println("Sunday");
            }
        }
    }
}