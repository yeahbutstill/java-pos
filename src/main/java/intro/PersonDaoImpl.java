package intro;

import java.io.Serializable;

public class PersonDaoImpl implements PersonDao, Serializable {

  @Override
  public void save(Person p) {
    System.out.println("Menyimpan person");
  }

  @Override
  public void delete(Person p) {
    System.out.println("Menghapus person");
  }

  @Override
  public Person getById(Long id) {
    Person p = new Person(); // instance dari class Person
    p.setId(id);
    p.setNama("Abc");
    return p;
  }
}
