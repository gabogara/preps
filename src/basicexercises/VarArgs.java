package basicexercises;

public class VarArgs {
    public static void main(String[] args) {
        printParameters(1,2,3,4,5);
    }

    private static void printParameters(int... numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

}
