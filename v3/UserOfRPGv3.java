public class UserOfRPGv3{
  private String name = "";
  private Protagonist tank = new Tank( name );
  private Protagonist warrior = new Warrior( name );
  private Protagonist assassin = new Assassin( name );
  private Monster cyclops = new Cyclops();
  private Monster skeleton = new Skeleton();
  private Monster hellHound = new HellHound();
  Character[] agents = new Character[]{ tank, warrior, assassin, cyclops, skeleton, hellHound};

  // public static void main(String[] args){
  //   int counter= 0;
  //   while (counter < agents.length){
  //     System.out.println(agents[counter]);
  //     counter += 1;
  //   }
  // }
}
