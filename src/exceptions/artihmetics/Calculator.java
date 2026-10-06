package exceptions.artihmetics;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;

    public Calculator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double divide(double operand1, double operand2) {
        if(operand2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }

    @Override
    public String toString() {
        return "You created the calculator and want to implement: " + operand1 + " " + operator + " " + operand2;
    }
}
