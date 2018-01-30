package ex2;

public class Ex5 {
  public static void main(String[] args) {

    StringBuilder s = new StringBuilder();
    // 1,4,7,10,13
    for (int i = 1; i < 14; i += 3) {
      s.append(i + ",");
    }
    System.out.println(s.substring(0, s.length() - 1));


    for (int i = 1; i < 14; i += 3) {
      System.out.print(i);
      if (i != 13) {
        System.out.print(",");
      }
    }
  }
}
