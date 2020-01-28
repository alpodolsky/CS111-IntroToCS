/**
@Author: Alex Podolsky
@Date: 11/06/2018
**/
public class Compress{
  public static void main(String[] args){
    System.out.print("Enter letters:");
    String phrase=IO.readString();
    IO.outputStringAnswer(compress(phrase));
  }
  public static String compress(String original){
    if (original.length()<= 1) return original;//base case
    int counter =1;//keeps track of how many times one character comes up
    while (counter < original.length() && original.charAt(0)==original.charAt(counter)){/**checks to see if end of string has been reached,
      and also if the current new character is equal to the character at the index of the counter**/
      counter++;
    }
    String wordsappend = counter > 1 ? String.valueOf(counter) : "";/**checks to see if the counter is larger than one,
    if it is it prints the value as a string,
    if not it remains blank**/
    return wordsappend + original.substring(0,1) + compress(original.substring(counter));
  }
}
