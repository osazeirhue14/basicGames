import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String [] options={"rock", "paper", "scissors"};
   Random Rand = new Random();
   String playAgain ="yes";
   do{
       System.out.print("What are you choosing Rock, Paper or Scissors? ");
   String pc = sc.nextLine();
   System.out.println();
   String cc = options[Rand.nextInt(3)];
   System.out.println("Computer Chooses: "+cc);
   
   if(pc.equals(cc)){
       System.out.println("It's a draw");
   }else if((pc.equals("rock")&&cc.equals("scissors"))||(pc.equals("paper")&&cc.equals("rock"))||(pc.equals("scissors")&&cc.equals("paper"))){
           System.out.println("You Win!");
       }
       else{
           System.out.println("You Lose!");
       }
       System.out.println("Do you want to play again? ");
       playAgain=sc.nextLine();
       
   }while(playAgain.equals("yes"));
   System.out.println("Thank you for playing!");
   sc.close();
   
   

  }
   
}
