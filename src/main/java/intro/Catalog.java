package intro;

public class Catalog {
  //  anonymous inner class
  private Runnable thread =
      new Runnable() {
        @Override
        public void run() {
          System.out.println("HelloWorld from Thread");
        }
      };
}

// protected class Coba{} // error
// private class CobaLagi{} // error
final class Coba3 {}

abstract class Coba4 {}
