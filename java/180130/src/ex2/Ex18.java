package ex2;

class A {

}

public class Ex18 {

  private static Object test(A a) {
    return a;
  }

  public static void main(String[] args) {

    // A a = test(null);

    Object[] o = {new A(), "3", 3, Integer.valueOf(3), (int) 3};
    System.out.println(o[1] == "3");

    System.out.println();

    Object a = 3;

    System.out.println(o[2] instanceof Integer);
    System.out.println(a == o[2]);
    System.out.println(a == o[3]);
    System.out.println(a == o[4]);
  }
}
