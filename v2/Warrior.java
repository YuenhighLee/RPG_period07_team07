public class Warrior extends Protagonist{
  public Warrior(String name){
      super(name);
      strength += 20;
      defense += 10;
  }
  public String toString() {
    return "protagonist type: " + this.getClass().getSimpleName() + System.lineSeparator()
         + super.toString();
  }
}
