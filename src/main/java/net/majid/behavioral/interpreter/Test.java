package net.majid.behavioral.interpreter;

public class Test {
    public static void main(String[] args) {

        Expression expression = new AddExpression(
                new NumberExpression(10),
                new NumberExpression(5)
        );

        System.out.println(expression.interpret());

        Expression subExpression = new SubtractExpression(
                new NumberExpression(10),
                new NumberExpression(3)
        );

        System.out.println(subExpression.interpret());

    }
}
