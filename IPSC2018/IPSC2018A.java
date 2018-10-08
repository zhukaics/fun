import java.util.Scanner;

public class IPSC2018A {
  private static void solve(Scanner sc) {
    int n = sc.nextInt();

    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();

      if (k < 10 || i == n - 1) {
        result[i] = 1;
      } else if (k >= 10 && k < 100) {
        result[i] = 10;
      } else {
        result[i] = 100;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i != 0) System.out.print(" ");
      System.out.print(result[i]);
    }

    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      solve(sc);
    }
  }
}
