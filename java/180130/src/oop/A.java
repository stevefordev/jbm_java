package oop;

public interface A {

  /*
   * 인터페이스는 클래스가 아님 
   * 객체로 만들어지지 않음 (메뉴판처럼 종잇장) 생성자 없음
   * 
   * 추상메서드, 상수만 가짐
   * 
   * 무조건 추상메서드만 가질 수 있기 때문에 
   * abstract 생략가능
   * 
   * 무조건 상수만 가질 수 있기 때문에
   * static final 생략 가능
   */

  public static final int A = 10;
  public int BB = 11;

  public void test();
}
