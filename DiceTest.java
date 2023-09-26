import java.util.Random;

public class DiceTest {
    public static void main(String[] args) {
        Random random = new Random();
        int numThrows = 1000;
        int pairs = 0;
        int[] sumCounts = new int[11];

        for (int i = 0; i < numThrows; i++) {
            int dice1 = rollDice(random);
            int dice2 = rollDice(random);
            int sum = dice1 + dice2;
            if (dice1 == dice2) {
                pairs += 1;
            }
            sumCounts[sum - 2]++;
        }
        System.out.println("Sum\tFrequency");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + sumCounts[i - 2]);
           
        }
         System.out.println("pairs\t" + pairs);
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}