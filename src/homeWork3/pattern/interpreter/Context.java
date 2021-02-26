package homeWork3.pattern.interpreter;

public class Context {
    private final String expression;

    public Context(String expression) {
        this.expression = expression;
    }
    public void findResult(){
        System.out.println(calculate(expression).interpret());
    }
    private Expression calculate(String expression){
        int position = expression.length()-1;

        while (position > 0){
            if (Character.isDigit(expression.charAt(position))){
                position--;
            }
            else {
                Expression leftExpression = calculate(expression.substring(0,position));
                Expression rightExpression = new Number(Integer.parseInt(expression.substring(position+1)));
                switch (expression.charAt(position)){
                    case '+' : return new PlusExpression(leftExpression,rightExpression);
                    case '-' : return new MinusExpression(leftExpression,rightExpression);
                }

            }
        }
        return new Number(Integer.parseInt(expression));
    }
}
