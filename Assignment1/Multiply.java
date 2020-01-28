/* Alex Podolsky
  September 26, 2018
  Find the multiple of two numbers
*/
public class Multiply {
  public static void main (String[] args){
    int numOne;//int because problem specified integer values
    int numTwo;
    int multiple = 0;
    System.out.print("Enter first number: ");
    numOne= IO.readInt();
    System.out.print("Enter second number: ");
    numTwo = IO.readInt();
    IO.outputIntAnswer(numOne*numTwo);
  }
}
