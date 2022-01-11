package intro;

import java.util.Arrays;

public class AnonymousArray {
  public static void printArray(String[] data) {
    System.out.println(Arrays.toString(data));
    System.out.println("panjang data : " + data.length);
  }

  public static void main(String[] args) {
    printArray(new String[] {"satu", "dua", "tiga"});
  }
}
