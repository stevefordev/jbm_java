package oop;

/*
 * 인터페이스는 구현(implements)
 * 
 * 다중구현 가능 (다중 상속은 불가)
 */
public class C implements A, B {

  @Override
  public void test() {
    System.out.println("구현해야 함!");

  }

  public void test2() {
    System.out.println("후후");
  }

  public static void main(String[] args) {

    A c = new C();
    c.test();
  }

}
