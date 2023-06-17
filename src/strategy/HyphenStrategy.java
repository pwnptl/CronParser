package src.strategy;

import java.util.ArrayList;
import java.util.List;

public class HyphenStrategy implements IStrategy {
    @Override
    public List<String> execute(String expression, List<String> eligibleOptions) {
        List<String> result = new ArrayList<>();
        String[] parts = expression.split("-");

        assert parts.length == 2;
        assert eligibleOptions.contains(parts[0]);
        assert eligibleOptions.contains(parts[1]);

        int from = Integer.parseInt(parts[0]);
        int to = Integer.parseInt(parts[1]);

        assert from <= to;

        int fromIndex = eligibleOptions.indexOf(parts[0]);
        int toIndex = eligibleOptions.indexOf(parts[1]);

        for (int i = fromIndex; i <= toIndex; ++i) {
            result.add(eligibleOptions.get(i));
        }
        return result;
    }

    ;
}
