package calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********** Welcome to the calculator *********************\n");
        Calculator calculator = new Calculator(10,4);
        System.out.printf("The values using operand1: %d and operand2: %d %n", calculator.getOperand1(), calculator.getOperand2());
        System.out.println("The result of the sum is: "+ calculator.add());
        System.out.println("The result of the subtract is: " + calculator.subtract());
        calculator.setOperand1(5);
        calculator.setOperand2(6);
        System.out.printf("The new values using operand1: %d and operand2: %d %n", calculator.getOperand1(), calculator.getOperand2());
        System.out.println("The result of the sum is: "+ calculator.add());
        System.out.println("The result of the subtract is: " + calculator.subtract());

    }
}
