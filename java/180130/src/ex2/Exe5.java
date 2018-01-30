package ex2;

public class Exe5 {
  private static int a;

  public static int test(int a) {
    return a = 10;
  }

  private static void test() {
    int b = test(20);
    a = b;
  }

  public static void main(String[] args) {


  }
}
