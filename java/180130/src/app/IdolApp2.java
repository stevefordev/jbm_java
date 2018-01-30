package app;

import vo.Idol;

public class IdolApp2 {

  public static void main(String[] args) {

    Idol i = new Idol("카이", "엑소", 180, 63);
    Idol i2 = new Idol("카이", "엑소", 180, 63);

    System.out.println(i.equals(i2));
  }
}
