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
    // The time complexity of this algorithm is O(2^n) and the space complexity is O(n).

}