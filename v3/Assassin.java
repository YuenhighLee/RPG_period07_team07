public class Assassin extends Protagonist{
  public Assassin(String name){
    super(name);
    attackRating += 0.5;
  }
  public String toString() {
    return "protagonist type: " + this.getClass().getSimpleName() + System.lineSeparator()
         + super.toString();
  }
}
