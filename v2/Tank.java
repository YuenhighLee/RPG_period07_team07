public class Tank extends Protagonist{
  public Tank(String name){
    super(name);
    health +=50;
  }
  public String toString() {
    return "protagonist type: " + this.getClass().getSimpleName() + System.lineSeparator()
         + super.toString();
  }
}
