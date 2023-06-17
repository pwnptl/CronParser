package src.strategy;

import java.util.ArrayList;
import java.util.List;

public class NumericStrategy implements IStrategy {
    @Override
    public List<String> execute(String expression, List<String> eligibleOptions) {
        List<String> result = new ArrayList<>();
        if(eligibleOptions.contains(expression))
            result.add(expression);
        return result;
    };
}
