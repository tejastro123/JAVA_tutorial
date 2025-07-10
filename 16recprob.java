import java.util.*;

class tower_of_hanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        solveHanoi(n, 'A', 'C', 'B');
        sc.close();
    }

    static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, destination, source);
    }
}

  
class string_reverse {

    public static String revString(String str) {

        if(str.length() == 1) {
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = revString(str.substring(1));
        return nextString + currChar;
    }
     
    public static void main(String args[]) {

        String str = "abcd";
        String reversed = revString(str);
        System.out.println(reversed);
    }
}


class first_last_occurence {

    public static int first = -1;
    public static int last = -1;
    
    public static void getIndices(String str, char el, int idx) {
        if(idx == str.length()) {
            return;
        }
        if(str.charAt(idx) == el) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        getIndices(str, el, idx+1);
    }

    public static void main(String args[]) {
        String str = "tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First occurence : " + first);
        System.out.println("Last occurence : " + last);
    }

}


class checksorted {
    public static boolean checkIfIncreasing(int arr[], int idx) {

        if(idx == arr.length-1) {
            return true;
        }
        if(!checkIfIncreasing(arr, idx+1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

    public static void main(String args[]) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 6, 3, 4, 5};
        if(checkIfIncreasing(arr1, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}


class push_x_end {
    //to add all 'x' to the end of the string
    public static String addX(int count) {
        String newStr = "x";
        for(int i=1;i<count; i++) {
            newStr += 'x';
        }
        return newStr;
    }
    
    public static String moveAllX(String str, int idx, int count) {
        if(idx == str.length()) {
            return addX(count);
        }
        if(str.charAt(idx) == 'x') {
            return moveAllX(str, idx+1, count+1);
        } else {
            String nextStr = moveAllX(str, idx+1, count);
            return str.charAt(idx) + nextStr;
        }
    }
    public static void main(String args[]) {
        String str = "axbcd";
        int count = 0; 
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }

}


class rev_dup {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        if(idx == str.length()) {
            return "";
        }
        char curr = str.charAt(idx);
        if(present[curr-'a']) {
            return removeDuplicates(str, idx+1, present);
        } else {
            present[curr-'a'] = true;
            return curr + removeDuplicates(str, idx+1, present);
        }
    }

    public static void main(String args[]) {
        String str = "abcadbcefghabi";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicates(str, 0, present));
    }

}


class subseq {
    public static void printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
            System.out.println(res);
            return;
        }
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx));
        //don't choose
        printSubseq(str, idx+1, res);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str2, 0, ""); 
    }
}


class unique_subseq {
    public static void printSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
        if(idx == str.length()) {
            if(allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
        //don't choose
        printSubseq(str, idx+1, res, allSubseq);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str2, 0, "", allSubseq); 
    }
}


class keypad {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
                                    "tu", "vwx", "yz"};
    public static void printKeypadCombination(String number, int idx, String res) {
        if(idx == number.length()) {
            System.out.println(res);
            return;
        }

        for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
            char curr = keypad[number.charAt(idx)-'0'].charAt(i);
            printKeypadCombination(number, idx+1, res+curr);
        }
    }
    
    public static void main(String args[]) {
        String number = "123";
        printKeypadCombination(number, 0, "");
    }
}