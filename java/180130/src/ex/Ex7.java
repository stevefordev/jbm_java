package ex;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Ex7 {

  public static void main(String[] args) {
    // 크기가 3인 String 배열을 선언하고 생성
    String[] names = new String[3];

    // 사람이름을 3번 반복하여 입력받고 그 이름을
    // 배열 0,1,2번지에 저장합니다.
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < names.length; i++) {
      names[i] = scan.nextLine();
    }

    // 그리고 이름을 출력합니다.
    // 친구의 이름은 XXX, YYY, ZZ입니다.
    StringBuilder nameBuilder = new StringBuilder("친구의 이름은 ");
    for (int i = 0; i < names.length; i++) {
      nameBuilder.append(names[i]);
      if (i != names.length - 1) {
        nameBuilder.append(",");
      }
    }

    nameBuilder.append(" 입니다");

    System.out.println(nameBuilder.toString());


  }// main() end
}// Ex7 end
