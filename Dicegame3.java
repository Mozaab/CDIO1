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
        while (player1Score < 40 && player2Score < 40) {

            
            if (turn == 0) {
                System.out.println(player1Name + "'s tur. Tryk Enter for at rulle med terningerne.");
                scanner.nextLine();
                int dice1 = rollDice(random);
                int dice2 = rollDice(random);
                int sum1 = dice1 + dice2;
                System.out.println(player1Name + " rullede: " + dice1 + " og " + dice2);

                if (dice1 == 1 && dice2 == 1) {
                    System.out.println("ups du rullede to 1'ere");
                    player1Score = 0;
                } else {
                    player1Score += sum1;
                }
            
                System.out.println(player1Name + "'s point: " + (player1Score));
            

<<<<<<< HEAD
            //Hvis player1 rammer 2 6'ere

            if (dice1==6 && dice2==6){
                System.out.println(player1Name + "har slået to 6'ere! " +player1Name + " vinder!!!!");
                break;
            }

            System.out.println(player1Name + " rullede: " + dice1 + " og " + dice2);
            System.out.println(player1Name + "'s point: " + (player1Score += sum1));
=======
>>>>>>> Development

            if (player1Score >= 40) {
                System.out.println(player1Name +  "vinder!!!!");
                break;
            }
            turn = 1;
        } else {
            System.out.println(player2Name + "'s tur. Tryk Enter for at rulle med terningerne.");
            scanner.nextLine();
            int dice3 = rollDice(random);
            int dice4 = rollDice(random);
            int sum2 = dice3 + dice4;

            
            //Hvis player2 slår to 6'ere
            if (dice3 == 6 && dice4 == 6){
                System.out.println(player2Name + "har slået to 6'ere! " +player2Name + " vinder!!!!");
                break;

            }

            System.out.println(player2Name + " rullede: " + dice3 + " og " + dice4);

            if (dice3 == 1 && dice4 == 1) {
                System.out.println("ups du rullede to 1'ere");
                    player2Score = 0;
                } else {
                    player2Score += sum2;
                }
            
                System.out.println(player2Name + "'s point: " + (player2Score));


            if (player2Score >= 40) {
                System.out.println(player2Name + " vinder!!!!");
                break;
            }
<<<<<<< HEAD

        }
=======
            turn = 0;

        }
    }
>>>>>>> Development
        scanner.close();




    }
    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
    
    

    
}