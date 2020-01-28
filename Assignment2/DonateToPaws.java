/**
@Author:Alex Podolsky
@Date:10/25/18
**/
public class DonateToPaws{
  public static void main(String[] args){
    System.out.print("Please Enter Donation: $");
    double donationAmount = IO.readDouble();
    IO.outputDoubleAnswer(donationFee(donationAmount));
  }
  public static double donationFee(double donationAmount){
    double donationfee = 0;
    if (donationAmount <= 150){//donations of up to and including 150
      donationfee= 3;
    }
    if (donationAmount> 150 && donationAmount < 1500){//donations between 150 and 1500
      if (donationAmount*.04 < 8){//if donationfee is less than 8
        donationfee = 8;
      }
      else {
        donationfee = donationAmount*.04;
      }
    }
    if (donationAmount >=1500 && donationAmount < 15000){//donations between 1500 and 15000
      if(donationAmount*.01< 20){//donationfee less than 20
        donationfee = 20;
      }
      else {
        donationfee = donationAmount*.01;
      }
    }
    if (donationAmount >=15000){//donations up to and including 15000
      if (donationAmount - 19000 > 0){//checks if third set of fees applies
        donationfee = 15000*.01+4000*.02+((donationAmount - 19000)*.03);//applies all 3 fees
      }
      else{//applies only first 2 fees
        donationfee = (15000*.01)+((donationAmount - 15000)*.02);
      }
    }
    return donationfee;
  }
}
