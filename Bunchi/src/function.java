import java.util.*;
public class function {
   // public static int calcmult(int a, int b) {
//
  //      return a * b;
    //}
    //public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
//
//
  //      System.out.println("Product of two numbers is " + calcmult(a, b));
  public static void printFactorial(int n) {
      if (n < 0) {
          System.out.println("Invalid");
      }
       int factorial = 1;
       for (int i = n; i >= 1; i--) {
           factorial = factorial * i;
       }
      System.out.println(factorial);
       return;
  }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printFactorial(n);
   }
}


