package co.tiagoaguiar.chatfirebase;

/**
 * Julho, 18 2019
 *
 * @author suporte@moonjava.com.br (Tiago Aguiar).
 */
public class Notification extends Message {

  private String fromName;

  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

}
