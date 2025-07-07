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
    // The Tower of Hanoi is a classic problem in recursion. The goal is to move a stack of disks from one peg to another, using a third peg as an auxiliary.
    // The rules are:
    // 1. Only one disk can be moved at a time.
    // 2. Each move consists of taking the upper disk from one of the stacks and
    //    placing it on top of another stack or on an empty peg.
    // 3. No larger disk may be placed on top of a smaller disk.
    // The recursive solution works as follows:
    // 1. Move the top n-1 disks from the source peg to the auxiliary peg, using the destination peg as auxiliary.
    // 2. Move the nth disk (the largest disk) from the source peg to the destination peg.
    // 3. Move the n-1 disks from the auxiliary peg to the destination peg, using the source peg as auxiliary.
    // This process is repeated recursively until all disks are moved to the destination peg.
    // The base case is when there is only one disk, which can be moved directly from the source peg to the destination peg.
    // The function `solveHanoi` takes four parameters:
    // - `n`: the number of disks to move.
    // - `source`: the peg from which disks are moved.
    // - `destination`: the peg to which disks are moved.
    // - `auxiliary`: the peg used as a temporary holding area.
    // The function prints the sequence of moves required to solve the Tower of Hanoi problem for `n` disks.
    // The recursive calls break down the problem into smaller subproblems until the base case is reached.
    // The function is called with the initial parameters: `n` disks, source peg 'A', destination peg 'C', and auxiliary peg 'B'.
    // The output will show the sequence of moves required to transfer all disks from the source peg to the destination peg.
    // The time complexity of this algorithm is O(2^n) because each disk requires
    // a series of moves that doubles with each additional disk. The space complexity is O(n) due to the recursive call stack.
    // The recursive nature of the algorithm allows it to efficiently solve the problem by breaking it down into smaller subproblems.

}