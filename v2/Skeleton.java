public class Skeleton extends Monster{
  public class skeleton(){
    super();
    strength += 10;
    defense += 5;
  }
  public String toString() {
    return "monster type: " + this.getClass().getSimpleName(); + System.lineSeparator()
         + super.toString();
  }
}
