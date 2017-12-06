public class Monster extends Character{

  public Monster(){
    health = 150;
    strength = (int)(Math.random() * 45 + 20);
    defense = 20;
    attackRating = 1;
  }
  
  public String toString() {
      return "health: " + health + System.lineSeparator()
           + "strength: " + strength + System.lineSeparator()
           + "defense: " + defense + System.lineSeparator()
           + "attack rating: " + attackRating + System.lineSeparator();
  }
}
