package ex2;

class A1 {
  int c = 1;
}


class B1 extends A1 {
  int b = 4;
}


class C1 extends B1 {
  int a = 7;
}


public class Ex1 extends C1 {
  int d = 4;

  public static void main(String[] args) {
    Object o = new C1();
    Ex1 e = new Ex1();
    A1 a = (A1) o;
    B1 b = e;
    C1 c = (C1) a;
    // e = c;
    o = "TEST";

    System.out.println(a == b);
    System.out.println(b == c);
    System.out.println(c == e);
    System.out.println(e == o);
    System.out.println(o.equals(a));
    System.out.println(b.equals(e));
    System.out.println(c.equals(o));


  }
}
