import java.util.*;
public class calctry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Invalid");
                } else {
                    System.out.println(a / b);
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Invalid");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Inavlid Operator");
        }
    }
}
