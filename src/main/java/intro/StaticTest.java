package intro;

public class StaticTest {
  public static void main(String[] args) {
    // static method memanggil static method lain dalam class yang sama
    contohMethodStatic();
    // method static juga bisa dipanggil dari nama class nya
    StaticTest.contohMethodStatic();
  }

  private static void contohMethodStatic() {
    System.out.println("method static dipanggil");
  }
}
