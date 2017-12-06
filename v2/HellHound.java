public class HellHound extends Monster{
  public HellHound(){
    super();
    attackRating += 0.3;
  }
  public String toString() {
    return "monster type: " + this.getClass().getSimpleName() + System.lineSeparator()
         + super.toString();
  }
}
