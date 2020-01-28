/**
@Author: Alex Podolsky
@Date: 10/27/2018
**/
public class AppendRec{
  public static void main(String[] args){
    System.out.print("Enter phrase: ");//asks user for the phrase
    String original = IO.readString();
    System.out.print("Enter number: ");//asks user for number
    int n = IO.readInt();
    IO.outputStringAnswer(appendNTimes(original, n));//calls the method recusrively
  }
  public static String appendNTimes ( String original, int n ){
    if(n>0){return original+ appendNTimes(original, n-1);}//recursively prints the phrase as long as n > 0
    return original;//returns just the string if user enters 0
  }
}
