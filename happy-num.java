import java.util.Scanner;
 class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter a number");
    int num = in.nextInt();
     if(isHappy(num))
      System.out.println("true");
    else
      System.out.println("false");
  }

  private static boolean isHappy(int num){
    if(num == 1)
      return true;
    if(num == 4)
      return false;
     //recall the function with sum value
    return isHappy(sumOfDigits(num));
  }

   //Function to return sum of square of digits
  private static int sumOfDigits(int num){
    int sum = 0;
    while(num>0){
      sum += Math.pow(num%10, 2);
      num = num/10;
    }
    return sum;
  }
}

