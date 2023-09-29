import java.util.Random;
import java.util.Scanner;

public class Dicegame3 {
            
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Velkommen til terningespillet!");


        System.out.print("Indtast spiller 1's navn: ");
        String player1Name = scanner.nextLine();
        System.out.print("Indtast spiller 2's navn: ");
        String player2Name = scanner.nextLine();

        
        int player1Score = 0;
        int player2Score = 0;
        int turn = 0;
        int player1Win = 0;
        int player2Win = 0;
        while (player1Win < 2 && player2Win < 2) {

            
            if (turn == 0) {
                System.out.println(player1Name + "'s tur. Tryk Enter for at rulle med terningerne.");
                scanner.nextLine();
                int dice1 = rollDice(random);
                int dice2 = rollDice(random);
                int sum1 = dice1 + dice2;
                System.out.println(player1Name + " rullede: " + dice1 + " og " + dice2);

                if (player1Win == 1 && dice1 == 1 && dice2 == 1) {
                    player1Score = 0;

                    } else if (player1Win == 1 && dice1 == dice2) {
                        System.out.println(player1Name + " vinder!!!!");
                        player1Win = 1;
                        break;             
                    }

            
             
                if (dice1 == 1 && dice2 == 1) {
                    System.out.println("Ups du rullede to 1'ere");
                    player1Score = 0;
                    player1Win = 0;
                } else {
                    player1Score += sum1;
                }
            
                System.out.println(player1Name + "'s point: " + (player1Score));
            
                if (player1Win == 0 && dice1 == dice2){
                    System.out.println(player1Name + "'s Får et ekstra slag for at slå to ens!");
                    turn = 0;
                } else {
                    turn = 1;
                }

                

            if (player1Score >= 40) {
                System.out.println(player1Name + " skal nu slå 2 ens for at vinde!");
                player1Win = 1;
            }
            
        } else {
            System.out.println(player2Name + "'s tur. Tryk Enter for at rulle med terningerne.");
            scanner.nextLine();
            int dice3 = rollDice(random);
            int dice4 = rollDice(random);
            int sum2 = dice3 + dice4;

            System.out.println(player2Name + " rullede: " + dice3 + " og " + dice4);

            if (player2Win == 1 && dice3 == 1 && dice4 == 1) {
                player2Score = 0;

                } else if (player2Win == 1 && dice3 == dice4) {
                    System.out.println(player2Name + " vinder!!!!");
                    player2Win = 1;
                    break;             
                }
                    if (dice3 == 1 && dice4 == 1) {
                System.out.println("ups du rullede to 1'ere");
                    player2Score = 0;
                    player2Win = 0;
                } else {
                    player2Score += sum2;
                }
            
                System.out.println(player2Name + "'s point: " + (player2Score));


                if (player2Win == 0 && dice3 == dice4){
                    System.out.println(player2Name + "'s Får et ekstra slag for at slå to ens!");
                    turn = 1;
                } else {
                    turn = 0;
                }

            if (player2Score >= 40) {
                System.out.println(player2Name + " skal nu slå 2 ens for at vinde!");
                player2Win = 1;
                
                
                
                 
            }
            
            
        }
        
    }
    scanner.close();
}
    
    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
    
}
