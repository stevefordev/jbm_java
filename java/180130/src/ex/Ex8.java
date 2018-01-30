package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GirlGroup {

  private String group;
  private List<Member> memberList;
  private int count;

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public List<Member> getMemberList() {
    return memberList;
  }

  public void setMemberList(List<Member> memberList) {
    this.memberList = memberList;
  }

  @Override
  public String toString() {

    StringBuilder s = new StringBuilder("당신이 좋아하는 그룹은 " + this.getGroup() + "이고 ");
    for (Member member : memberList) {
      s.append(member.getName() + ", ");
    }

    s.append("입니다");
    return s.toString();
  }
}


class Member {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}


public class Ex8 {

  public static void main(String[] args) {

    GirlGroup girlGroup = new GirlGroup();

    Scanner scan = new Scanner(System.in);

    System.out.println("당신이 좋아하는 아이돌 그룹이름은?");

    // 그룹 이름 세팅
    girlGroup.setGroup(scan.nextLine());

    System.out.println("인원은 몇명입니까?");
    int count = Integer.parseInt(scan.nextLine());
    // 그룹 인원 셋팅
    girlGroup.setCount(count);

    List<Member> memberList = new ArrayList();

    // 멤버수만큼 이름을 입력받고
    for (int i = 0; i < count; i++) {
      System.out.println("멤버 이름 한명을 입력하세요");
      String n = scan.nextLine();
      Member member = new Member();
      member.setName(n);
      memberList.add(member);
    }
    // 멤버 리스트를 세팅
    girlGroup.setMemberList(memberList);
    System.out.println(girlGroup.toString());
  }
}
