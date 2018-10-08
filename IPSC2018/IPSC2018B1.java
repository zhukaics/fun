import java.util.Scanner;

public class IPSC2018B1 {
  private static String sides = "TRBL";

  private static void solve(Scanner sc) {
    sc.nextInt();

    String folds = sc.next();
    String cuts = sc.next();

    int cut1 = sides.indexOf(cuts.charAt(0));
    int cut2 = sides.indexOf(cuts.charAt(1));

    if (cut1 % 2 == cut2 % 2) {
      int effectiveCut = 0;
      for (int i = 0; i < folds.length(); i++) {
        int fold = sides.indexOf(folds.charAt(i));
        if (fold % 2 != cut1 % 2) {
          effectiveCut++;
        }
      }

      long result = 1;

      long MOD = 1000000007L;

      for (int i = 0; i < effectiveCut; i++) {
        result = result * 2 % MOD;
      }

      System.out.println((result + 1) % MOD);
    } else {
      throw new RuntimeException("Does not support.");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      solve(sc);
    }
  }
}
