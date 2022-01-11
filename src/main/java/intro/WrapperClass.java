package intro;

public class WrapperClass {
  public static void main(String[] args) {
    Integer x = new Integer(10);
    int i = x.intValue();
    long l = 100L;
    Long y = Long.valueOf(l);
    int i1 = Integer.parseInt("100");

    System.out.println(i);
    System.out.println(l);
    System.out.println(y);
    System.out.println(i1);
  }
}
