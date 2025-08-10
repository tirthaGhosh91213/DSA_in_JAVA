public class interfaces {
  public static void main(String[] args) {
    Queen q=new Queen();
    q.move();

    Human hu=new Human();
    hu.eatNonVag();
    hu.eatVeg();
  }
}
interface ChesBoard {
  void move();

}
class Queen implements ChesBoard {
  public void move(){
    System.out.println("Queen moves All direction ");
  }
}
class Hati implements ChesBoard {
  public void move(){
    System.out.println("Hati moves left,right,up,down direction ");
  }
}
class king implements ChesBoard {
  public void move(){
    System.out.println("king moves left,right,up,down (by one step) direction ");
  }
}


// multiple inheritance
interface veg{
  void eatVeg();
}
interface  nonVeg{
  void eatNonVag();
}
class Human implements veg,nonVeg{
  public void eatVeg(){
    System.out.println("Human eat veg ");
  }
  public void eatNonVag(){
    System.out.println("Human eats non veg also ");
  }
}