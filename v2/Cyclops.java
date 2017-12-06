public class Cyclops extends Monster{
  public Cyclops(){
    super();
    health += 50;
  }
  public String toString() {
    return "monster type: " + this.getClass().getSimpleName() + System.lineSeparator()
         + super.toString();
  }
}
