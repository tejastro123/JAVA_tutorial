import java.util.*;

@SuppressWarnings("unused")
class Strings {
    //strings declaration
    String name1 = "tejas";
    String name2 = "mellimpudi";

    // input method
    public static void main(String args[]) {
        
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();

        // concatenation
        String name = firstname + " " + lastname;
        System.out.println("Hello " + name + "!");

        // string length
        System.out.println("Length of your name is: " + name.length());

        // accessing each characters
        System.out.println("Characters in your name:");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        
        // string comparison
        System.out.println("\n\nEnter two names to compare:");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // substring
        System.out.println("\nEnter a string to find its substring:");
        String str = sc.nextLine();
        System.out.println("Enter the starting index:");
        int stidx = sc.nextInt();
        System.out.println("Enter the ending index:");
        int endidx = sc.nextInt();
        String substring = str.substring(stidx, endidx);
        System.out.println("Substring from index " + stidx + " to " + endidx + " is: " + substring);

        // parsing integers from strings
        System.out.println("\nEnter a number in string format:");
        sc.nextLine(); // consume the newline character
        String numberStr = sc.nextLine();
        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }

        // tostring method
        int number = sc.nextInt();
        String numstr = Integer.toString(number);
        System.out.println("String representation of the number is: " + numstr);



    }
}

// homework problems

// 1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

@SuppressWarnings("unused")
class Strings1 {
    public static void main(String args[]) {

        System.out.println("Enter the number of strings:");
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);
   }
}

// 2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

@SuppressWarnings("unused")
class Strings2 {
    public static void main(String args[]) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
            result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

// 3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

@SuppressWarnings("unused")
class Strings3 {
    public static void main(String args[]) {
        System.out.println("Enter your email:");
        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String userName = "";

        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
   }
}
