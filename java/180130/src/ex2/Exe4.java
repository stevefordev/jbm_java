package ex2;

public class Exe4 {
  private static int a;

  public static int test(int a) {
    return a = 100;
  }

  public static void main(String[] args) {
    a = test(20);
    System.out.println(a);
  }
}
