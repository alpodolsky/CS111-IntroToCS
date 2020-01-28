/**
@Author: Alex Podolsky
@Date: 10/25/2018
**/
public class TwoLargest {
  public static void main(String[] args) {
    double num;
    //Terminating number
    System.out.print("Enter a terminating value: ");
    double term = IO.readDouble();
    //First number
    System.out.print("Enter number: ");
    double large = IO.readDouble();
    while (large == term){//makes sure first value after term is not term
      IO.reportBadInput();
      System.out.print("Must enter two numbers before term value. Enter number: ");
      large = IO.readDouble();
    }
    //second number
    System.out.print("Enter number: ");
    double secLarge = IO.readDouble();
    while (secLarge == term){//makes sure second value after term is not term
      IO.reportBadInput();
      System.out.print("Must enter two numbers before term value. Enter number: ");
      secLarge = IO.readDouble();
    }
    if (large < secLarge){//check to make sure large is greater
      num = large;
      large = secLarge;
      secLarge = num;
    }
    System.out.print("Enter number: ");
    num = IO.readDouble();
    while(num != term){//loop to check if the next number, and following, are term or not
      if(num > large && num>secLarge){//rearranges both
          secLarge = large;
          large = num;
          System.out.print("Enter number1: ");
          num = IO.readDouble();
        }
      else if(num <= large && num >= secLarge){//replaces just secLarge
          secLarge = num;
          System.out.print("Enter number2: ");
          num = IO.readDouble();
        }
      else if (num < large && num < secLarge){//asks for more inputs
          System.out.print("Enter number3: ");
          num = IO.readDouble();
        }
    }
    System.out.print("Largest: ");
    IO.outputDoubleAnswer(large);
    System.out.print("Second Large: ");
    IO.outputDoubleAnswer(secLarge);
  }
}
