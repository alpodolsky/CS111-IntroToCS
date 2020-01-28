public class Gas {
  public static void main (String[] args){
    double gasPrice;
    double gasAmount;
    boolean paymentType;
    double totalAmount = 0;
    System.out.print("Enter cost of gallon of gas:");
    gasPrice = IO.readDouble();
    System.out.print("Enter number of gallons: ");
    gasAmount = IO.readDouble();
    System.out.print("Is customer paying with a credit card? ");
    paymentType = IO.readBoolean();
    if (gasPrice < 0 || gasAmount < 0 || (gasPrice < 0 && gasAmount < 0)){
      System.out.print("User entered bad input.");
    }
    else if(paymentType == true){
      totalAmount = (gasPrice * gasAmount)*1.1;
      IO.outputDoubleAnswer(totalAmount);
    }
    else if (paymentType == false){
      totalAmount = (gasPrice * gasAmount);
      IO.outputDoubleAnswer(totalAmount);
    }
    else{
      System.out.print("Error");
    }
  }
}
