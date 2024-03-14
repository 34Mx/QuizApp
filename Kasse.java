public class Kasse {
  private int kontostand;
  
  public Kasse() {
    kontostand = 0;
  }
  
  public void add(int amount) {
    kontostand += amount;
  }
  
  public void remove(int amount) {
    if (kontostand - amount >= 0) kontostand -= amount;
  }
  
  public int getKontostand() {
    return kontostand;
  }
}