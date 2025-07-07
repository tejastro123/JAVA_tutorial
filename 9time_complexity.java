// time complexity

import java.util.Scanner;

class L9 { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("hello");
            }
        }
    }
} // tc=O(n^2)

class a1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("hello");
            }
        }
    }
} // tc=O(n*m)

class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("hello");
        }
            
        for(int j=0; j<n; j++){
            System.out.println("hello");
        }
        
    }
} // tc=O(n+m)



// space complexity

class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            System.out.println("hello");
        }
    }
} // sc=O(n)

