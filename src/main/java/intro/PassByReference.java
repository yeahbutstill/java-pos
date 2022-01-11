package intro;

public class PassByReference {
  public static void ubahNama(String[] nama) {
    nama[0] = "maya";
    System.out.println("nama baru di dalam method: " + nama[0]);
  }

  public static void main(String[] arg) {
    String[] nama = new String[1];
    nama[0] = "dani";
    System.out.println("nilai lama dari method main: " + nama[0]);
    ubahNama(nama);
    System.out.println("nilai lama dari method main: " + nama[0]);
  }
}
