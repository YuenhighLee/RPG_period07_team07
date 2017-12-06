public class Protagonist extends Character{
  private String name;

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
}
