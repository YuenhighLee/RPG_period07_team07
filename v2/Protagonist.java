public class Protagonist extends Character{
  protected String name;

  public Protagonist(String word){
    name = word;
    health = 125;
    strength = 100;
    defense = 40;
    attackRating = .4;
  }

  public String getName(){
    return name;
  }

  public void specialize(){
    defense = 20;
    attackRating = .8;
  }

  public void normalize(){
    defense = 40;
    attackRating = .4;
  }
  
  public String toString() {
      return "name: " + name + System.lineSeparator()
           + "health: " + health + System.lineSeparator()
           + "strength: " + strength + System.lineSeparator()
           + "defense: " + defense + System.lineSeparator()
           + "attack rating: " + attackRating + System.lineSeparator();
  }
}
