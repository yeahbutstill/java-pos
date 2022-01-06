package intro;

import java.io.IOException;

public class SecondMain {

  public void main(String[] args) {}

  public String methodReturnString() {
    return "ini string";
  }

  private void methodBerparameter(String parameter1, Integer parameter2) {}

  public void methodThrowException() throws IOException {}

  protected String protectedMethod(String parameter1, Integer parameter2) throws IOException {
    return "ini string";
  }

  public void methodBerbeda() {}

  public void methodBerbeda(String parameter1) {}

  public void methodBerbeda(String parameter1, Integer parameter2) {}

  public void methodBerbeda(Integer parameter1, String parameter2) {}

  public void methodBerbeda(Double parameter1, Double parameter2) {}
}
