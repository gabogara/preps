import java.util.Random;

public class randomClass {
    public static void main(String[] args) {
        Random random = new Random();
        /* Lets generate aleatory number between 0 and 9 */
        int numZeroToNine = random.nextInt(10);
        System.out.println("numZeroToNine is = " + numZeroToNine);
        /* Lets generate a random number between 4 and 8 */
        int numFourToEight = random.nextInt(8 - 4 + 1)+4 ;
        System.out.println("numFourToEight is = " + numFourToEight);
        
        // Generate aleatory number between 0.0 and 1.0
        double zeroToOne = random.nextDouble();
        System.out.println("zeroToOne = " + zeroToOne);
    }
}
