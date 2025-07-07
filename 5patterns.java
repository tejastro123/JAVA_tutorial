//patterns

class p1 {
    public static void main(String args[]) {
        int m = 5;
        int n = 4;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class p2 {
    public static void main(String args[]) {
        int m = 5;
        int n = 4;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class p3 {
    public static void main(String args[]) {
        int n = 4;
      
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

class p4 {
    public static void main(String args[]) {
        int n = 4;
      
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

class p5 {
    public static void main(String args[]) {
        int n = 4;
      
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class p6 {
    public static void main(String args[]) {
        int n = 5;
      
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
   }
}

class p7 {
    public static void main(String args[]) {
        int n = 5;
      
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
   }
}

class p8 {
    public static void main(String args[]) {
        int n = 5;
        int number = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
   }
}

class p9 {
    public static void main(String args[]) {
        int n = 5;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
   }
}
