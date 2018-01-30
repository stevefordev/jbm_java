package ex2;

public class Exe7 {

  public static void main(String[] args) {
    int[] d = new int[5];
    
    String s = "한효주".substring(0, 2);
    s.substring(s.length());
    System.out.println(s.length()); //2
    System.out.println(s);
    
    System.out.println(new String("한효").equals(s));
  }
}
