package intro;

public class TipeDataPrimitif {

  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i1 = 26; // decimal
    int i2 = 032; // octal sama dengan 26 decimal
    int i3 = 0x1a; // hexadecimal sama dengan 26 decimal
    long l = 100L;
    float f = 100.0f;
    double d1 = 100.0;
    double d2 = 1.00e2;
    boolean bo = true;
    char c = 'c';

    System.out.println(b);
    System.out.println(s);
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(bo);
    System.out.println(c);
    System.out.println("-------------bo----------------------");

    byte b1 = 100;
    int i = b1;

    int i4 = 100;
    byte b3 = (byte) i4;

    int i5 = 1000;
    byte b4 = (byte) i5;

    System.out.println(i);
    System.out.println(b3);
    System.out.println(b4);
  }
}
