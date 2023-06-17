package src.strategy;

import java.util.ArrayList;
import java.util.List;

public class CommaStrategy implements IStrategy {
    @Override
    public List<String> execute(String expression, List<String> eligibleOptions) {
        List<String> result = new ArrayList<>();
        String[] parts = expression.split(",");

        for (int i = 0; i < parts.length; ++i) {
            if (eligibleOptions.contains(parts[i]))
                result.add(parts[i]);
        }
        return result;
    }
}
