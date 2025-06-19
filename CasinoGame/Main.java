import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int balance=100;;
  int bet;
  int payout;
  
  
  System.out.println("Welcome to Osaze's Casino!");
  System.out.println("Your balance is currently $"+balance);
 
  
  while(balance>0){
  
     
      System.out.print("How much would you like to bet? $");
      bet = sc.nextInt();
      System.out.println();
      if(bet>balance){
          System.out.println("Insufficient funds!");
          continue;
      }else if(bet<=0){
          System.out.println("Your bet must be greater than 0!");
          continue;
      }else{
          balance=balance-bet;
          System.out.println("Your new balance is $"+balance);
      }
      int c=spinRow(bet);
      if(c > 0){
       System.out.println("You win $"+c);
       balance=balance+c;
       System.out.println("Your new balance is $"+(balance));
      }else{
          System.out.println("You Lose");
          System.out.println("your new balance is $"+balance);
      }
  }
  if(balance ==0){
      System.out.println("You've lost all your funds head to the cashier desk to deposit more, Thank you for playing!");
  }
  }
  static int spinRow(int bet){
      System.out.println("Currently Rolling.....");
      Random rand = new Random();
  
  int x = rand.nextInt(5)+1;
  int y = rand.nextInt(5)+1;
  int z = rand.nextInt(5)+1;
  
  int [] row = {x,y,z};
  int reward;
  
 for (int i = 0; i < row.length; i++) {
    System.out.print(row[i] + " ");
}
   System.out.println();
  
  if(x==(y)&&y==(z)){
      reward = bet*3;
      return reward;
  }
  else if(x==(y)&& !(y==(z))|| y==(z)&& !(z==(x)) || z==(x) &&!(x==(y))){
      reward=bet*2;
      return reward;
  }else{
      reward=0;
      return reward;
  }
      
  }
   
}
