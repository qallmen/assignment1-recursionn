import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Task 1
    System.out.println(" Enter a number:");
    int num1 = scan.nextInt();
    f1(num1);

    // Task 2
    System.out.println("Enter A NUMBER:");
    int n2 = scan.nextInt();
    if (n2 > 0) {
      double totalSum = f2(scan, n2);
      System.out.println("Average: " + (totalSum / n2));
    }

    // Task 3
    System.out.println("Enter a number:");
    int n3 = scan.nextInt();
    System.out.println(f3(n3, 2));

    // Task 4
    System.out.println("Enter number:");
    int n4 = scan.nextInt();
    System.out.println(f4(n4));

    // Task 5
    System.out.println("Enter a number");
    int n5 = scan.nextInt();
    System.out.println(f5(n5));

    // Task 6
    System.out.println("Enter a number");
    int a6 = scan.nextInt();
    int n6 = scan.nextInt();
    System.out.println(f6(a6, n6));

    // Task 8
    System.out.println("Enter string:");
    String s8 = scan.next();
    System.out.println(f8(s8, 0));

    // Task 9
    System.out.println("Enter string:");
    String s9 = scan.next();
    System.out.println(f9(s9));
  }

  // Task 1
  public static void f1(int n) {
    if (n < 10) {
      System.out.println(n);
    } else {
      f1(n / 10);
      System.out.println(n % 10);
    }
  }

  // Task 2
  public static double f2(Scanner scan, int count) {
    if (count == 0) return 0;
    return scan.nextInt() + f2(scan, count - 1);
  }

  // Task 3
  public static String f3(int n, int d) {
    if (n <= 1) return "Composite";
    if (n == 2) return "Prime";
    if (n % d == 0) return "Composite";
    if (d * d > n) return "Prime";
    return f3(n, d + 1);
  }

  // Task 4
  public static int f4(int n) {
    if (n <= 1) return 1;
    return n * f4(n - 1);
  }

  // Task 5
  public static int f5(int n) {
    if (n == 0) return 0; // Base case [cite: 61]
    if (n == 1) return 1; // Base case [cite: 61]
    return f5(n - 1) + f5(n - 2); // Formula: Fn = Fn-1 + Fn-2 [cite: 60]
  }

  // Task 6
  public static int f6(int a, int n) {
    if (n == 0) return 1;
    return a * f6(a, n - 1);
  }

  // Task 8
  public static String f8(String s, int i) {
    if (i == s.length()) return "Yes";
    if (!Character.isDigit(s.charAt(i))) return "No";
    return f8(s, i + 1);
  }

  // Task 9
  public static int f9(String s) {
    if (s.isEmpty()) return 0;
    return 1 + f9(s.substring(1));
  }
}