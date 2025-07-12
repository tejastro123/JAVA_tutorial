

class printnumbers{

    public static void printnum(int n) {
        if (n==6) {
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }


    public static void main(String[] args) {
        int n = 1 ;
        System.out.println("Printing numbers from 1 to 5:");
        printnum(n);
    }
}

class printsum {

    public static void printSum(int n, int sum) {
        if (n == 0) {
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
            return;
        }
        sum += n;
        printSum(n - 1, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Calculating the sum of first " + n + " natural numbers:");
        int sum = 0;
        printSum(n, sum);
    }
}

class printfactorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Calculating the factorial of " + n + ":");
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

class printfibonacci {
    public static void printFibonacci(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibonacci(n - 1, b, a + b);
    }
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        System.out.println("Printing first " + n + " Fibonacci numbers:");
        printFibonacci(n, 0, 1);
    }
}

class power_stackheight_n {
    public static int printpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * printpower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println("Calculating " + x + " raised to the power of " + n + ":");
        int result = printpower(x, n);
        System.out.println(x + "^" + n + " is: " + result);
    }
}

class power_stackheight_logn {
    public static int printpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printpower(x, n/2) * printpower(x, n/2);
        } else {
            return x * printpower(x, n/2) * printpower(x, n/2);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println("Calculating " + x + " raised to the power of " + n + " using log(n) method:");
        int result = printpower(x, n);
        System.out.println(x + "^" + n + " is: " + result);
    }
}