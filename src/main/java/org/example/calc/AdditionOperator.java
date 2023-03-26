package org.example.calc;

public class AdditionOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return operator.equals("+");
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
