public class Cyclops extends Monster{
  public class cyclops(){
    super();
    health += 50;
  }
  public String toString() {
    return "monster type: " + this.getClass().getSimpleName(); + System.lineSeparator()
         + super.toString();
  }
}
