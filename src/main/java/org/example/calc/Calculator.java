package org.example.calc;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(int operand1,String operator,int operand2) {
       return arithmeticOperator.stream()
               .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
               .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
               .findFirst()
               .orElseThrow(()-> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }


//    public static int calculate(int operand1,String operator,int operand2) {
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
//    }
//    public static int calculate(int a,String operator,int b) {
//        int result = 0;
//
//        if(operator.equals("+")) {
//            result =  a + b;
//        } else if (operator.equals("-")) {
//            result =  a - b;
//        } else if (operator.equals("*")) {
//            result =  a * b;
//        } else if (operator.equals("/")) {
//            result =  a / b;
//        }
//
//        return result;
//    }
}
