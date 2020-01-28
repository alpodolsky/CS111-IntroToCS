public class BuyingApples{
  public static void main(String[] args){
    System.out.print("Enter cost per LB: ");
    double appleCost = IO.readDouble();

    System.out.print("Enter number of pounds: ");
    double poundAmount = IO.readDouble();
    double totalAmount = 0;

    if (appleCost < 0 || poundAmount < 0 || (appleCost < 0 && poundAmount < 0)){
      System.out.print("User entered bad input");
    }
    else {
      totalAmount = appleCost*poundAmount;
      IO.outputDoubleAnswer(totalAmount);
    }
  }
}
