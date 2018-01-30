package ex2;

public class Exe6_3 {
  static int a = 5;

  private Exe6_3(int a) {
    a += a;
  }

  private static void test(Exe6_3 a) {
    System.out.println(a.a);
  }

  public static void main(String[] args) {
    test(new Exe6_3(a));
  }
}
