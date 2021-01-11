class Square{
  /*
  *makes a square
  */

  //instance variables
  private double side;

  //constant (public)
  public final int MAX_SIDE_LENGTH = 10;

  //constructors
  public Square(double sideLength){
    side = sideLength;
  } 

  public Square(){
    side = 1.0;
  }

  //methods

  public double getSide(){
    return side;
  }

  public void setSide(double theSide){
    if(theSide > MAX_SIDE_LENGTH || theSide < 0){
      return;
    } 
    side = theSide;
  }

  public String toString(){
    return "Square with side length = " + side;
  }

  public double area(){
    return side * side;
  }

  public double diagonal(){
    return Math.sqrt(2.0) * side;
  }

}
