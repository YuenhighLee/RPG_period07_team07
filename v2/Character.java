public class Character{
  protected int health;
  protected int strength;
  protected int defense;
  protected double attackRating;

  public boolean isAlive(){
    return (health > 0);
  }

  public int getDefense(){
    return defense;
  }

  public void lowerHP(int dmg){
    this.health = this.health - dmg;
  }

  public int attack(Character bob){
    int damage;
    damage = (int) (strength * attackRating - bob.getDefense());
    if (damage > 0) {
        bob.lowerHP(damage);
        return damage;
    }
    return 0;
  }
}
