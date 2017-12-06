public class Assasin extends Protagonist{
  private String name;

  public Assasin(String name){
    super(name);
    attackRating += 0.5;
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
