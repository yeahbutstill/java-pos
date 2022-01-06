package intro;

public class ConstructorCallConstructorTest {
  public ConstructorCallConstructorTest() {
    this("constructor memanggil constructor");
    // kode lain di sini, tidak bisa diletakkan di atas keyword this
  }

  public ConstructorCallConstructorTest(String text) {
    methodSederhana(text);
  }

  public static void main(String[] args) {
      ConstructorCallConstructorTest
  }

  public void methodSederhana(String text) {
    System.out.println("method sederhana dipanggil dengan text : " + text);
  }
}
