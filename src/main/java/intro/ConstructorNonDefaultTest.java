package intro;

public class ConstructorNonDefaultTest {
  public ConstructorNonDefaultTest(String text) {
    methodSederhana(text);
  }

  public static void main(String[] args) {
    // error pada waktu compile karena ada constructor yang dideklarasikan
    // sehingga dafault constructor menjadi wajib dideklarasikan
    // ConstructorNonDefaultTest nonDefaultTest = new ConstructorNonDefaultTest(); // error

    // constructor non default dengan satu parameter bertipe string
    ConstructorNonDefaultTest nonDefaultTest1 = new ConstructorNonDefaultTest("ini test");
  }

  public void methodSederhana(String text) {
    System.out.println("method sederhana dipanggil dengan text : " + text);
  }
}
