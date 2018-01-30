package vo;

public class Idol {

  private String name, group;// 이름 //그룹명

  private int height, weight;// 키, 몸무게

  public Idol() {

  }

  public Idol(String name, String group, int height, int weight) {
    this.name = name;
    this.group = group;
    this.height = height;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {

    return "이름 : " + this.name + " / 키 :" + this.height + " / 무게 :" + this.weight + " / 그룹 :"
        + this.group;
  }

  @Override
  public boolean equals(Object obj) {

    // 같은 레퍼런스를 참조한다면
    // 당연히 멤버필드의 값들을 전부 같을 겁니다.
    if (this == obj) {
      System.out.println("같은 레퍼런스");
      return true;
    }

    // instanceof 를 이용해서
    if (!(obj instanceof Idol)) {
      return false;
    }

    Idol idol = (Idol) obj;
    if (this.toString().equals(idol.toString())) {
      return true;
    }

    return false;
  }
}
