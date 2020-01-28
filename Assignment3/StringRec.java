/**
@Author:Alex Podolsky
@Date:11/8/2018
**/
public class StringRec{
  public static void main(String[] args){
    System.out.print("Enter letters:");
    String phrase=IO.readString();
    IO.outputStringAnswer(decompress(phrase));
  }

  public static String decompress(String compressedText){
    if(compressedText.length()<=1) return compressedText;//base case for empty and single input strings
    if (Character.isLetter(compressedText.charAt(0))==true){//if the first character is just a letter
      return compressedText.charAt(0)+decompress(compressedText.substring(1));//returns the letter and the rest of the string
    }
    if(Character.isDigit(compressedText.charAt(0))==true&&Character.getNumericValue(compressedText.charAt(0))>1){
      int value = compressedText.charAt(0)-'0';//turns the number in the string to an int
      int a = value-1;//decrements
      compressedText = a+compressedText.substring(1);
      return compressedText.charAt(1)+decompress(compressedText);//returns the letter and the decremented a
    }
    return decompress(compressedText.substring(1));//basically all other cases
  }
}
