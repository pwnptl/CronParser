package src.strategy;

public class StrategyFactory {

    public IStrategy findStrategy(String expression) {
        assert expression != null;

        if ("*".equals(expression))
            return new AsteriskStrategy();
        else if (expression.startsWith("*/") && expression.split("/").length == 2)
            return new DivisionStrategy();
        else if (expression.contains(","))
            return new CommaStrategy();
        else if (expression.contains("-"))
            return new HyphenStrategy();
        else if(isNumeric(expression))
            return new NumericStrategy();
        throw new RuntimeException("couldn't find strategy for given expression " + expression);
    }

    private boolean isNumeric(String s){
        String pattern= "^[0-9]*$";
        return s.matches(pattern);
    }
}
