package intro;

public class Person {

  private Long id; // instance variable
  private String nama; // instance variable

  public static void main(String[] args) {
    Person dani; // local variable/reference variable dani
    dani = new Person(); // object Person diinstansiasi
    dani.setId(17L);
    dani.setNama("Dani Setiawan");

    Person klonenganDani = dani; // local variable yang menunjuk ke object
    klonenganDani.setNama("klonengan ifnu"); // yang sama

    System.out.println(dani.getNama());
    System.out.println(klonenganDani.getNama());
  }

  public Long getId3() {
    return id;
  }

  public void setId(Long id) { // local variable id
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) { // local variable nama
    this.nama = nama;
  }
}
