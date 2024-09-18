import java.util.Scanner;


public class RockPaper {
   

   public static void main(String[] args) {
      boolean var3 = false;
      Scanner var4 = new Scanner(System.in);

      while(true) {
         while(!var3) {
            System.out.println("Player 1, choose P,R, or S.");
            String var1 = var4.next().toLowerCase();
            System.out.println("Player 2, choose P,R, or S.");
            String var2 = var4.next().toLowerCase();
            if (var1.equals("p") && var2.equals("s")) {
               System.out.println("Scissors cuts paper, player 2 wins!");
               var3 = true;
            } else if (var1.equals("s") && var2.equals("p")) {
               System.out.println("Scissors cuts paper, player 1 wins!");
               var3 = true;
            } else if (var1.equals("p") && var2.equals("r")) {
               System.out.println("Paper covers rock, player 1 wins!");
               var3 = true;
            } else if (var1.equals("r") && var2.equals("p")) {
               System.out.println("Paper covers rock, player 2 wins!");
               var3 = true;
            } else if (var1.equals("r") && var2.equals("s")) {
               System.out.println("Rock breaks scissors, player 1 wins!");
               var3 = true;
            } else if (var1.equals("s") && var2.equals("r")) {
               System.out.println("Rock breaks scissors, player 2 wins!");
               var3 = true;
            } else {
               System.out.println("It is a tie!  We go again.");
            }
         }

         
      }
              }

}
