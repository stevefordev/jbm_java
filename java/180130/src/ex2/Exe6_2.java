package ex2;

public class Exe6_2 {

  int a = 7;

  private Exe6_2() {
    a = 4;
  }

  public static void main(String[] args) {
    Exe6_2 a = new Exe6_2();
    System.out.println(a.a);

  }

}
