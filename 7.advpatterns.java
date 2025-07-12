//advanced patterns

@SuppressWarnings("unused")
class p1 {
   public static void main(String args[]) {
       int n = 4;


       //upper part
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }


           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }


           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


       //lower part
       for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }


           int spaces = 2 * (n-i);
           for(int j=1; j<=spaces; j++) {
               System.out.print(" ");
           }


           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}

@SuppressWarnings("unused")
class p2 {
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //stars
           for(int j=1; j<=n; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}

@SuppressWarnings("unused")
class p3 {
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //numbers
           for(int j=1; j<=i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }
   }   
}

@SuppressWarnings("unused")
class p4 {
   public static void main(String args[]) {
       int n = 5;
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //first part
           for(int j=i; j>=1; j--) {
               System.out.print(j);
           }


           //second part
           for(int j=2; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
   }   
}

@SuppressWarnings("unused")
class p5 {
   public static void main(String args[]) {
       int n = 5;


       //upper part
       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


       //lower part
       for(int i=n; i>=1; i--) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}
