public class Zoo {
  public static void main (String[] args){
  System.out.print("Enter number of zoos: ");
  int numberOfZoo = IO.readInt();
  int giraffeTotal = 0;
  int lionTotal = 0;
  int snakesTotal = 0;
  int numZoo = 0;
  while (numberOfZoo > 0){
    numZoo++;
    System.out.print("Enter number of giraffes for zoo " + numZoo + ": ");
    giraffeTotal += IO.readInt();
    System.out.print("Enter number of lions for zoo " + numZoo + ": ");
    lionTotal += IO.readInt();
    System.out.print("Enter number of snakes for zoo " + numZoo + ": ");
    snakesTotal += IO.readInt();
    numberOfZoo--;
  }
  IO.outputIntAnswer(giraffeTotal);
  IO.outputIntAnswer(lionTotal);
  IO.outputIntAnswer(snakesTotal);
  }
}
