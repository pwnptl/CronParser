package src.strategy;

import java.util.ArrayList;
import java.util.List;

public class DivisionStrategy implements IStrategy {

    @Override
    public List<String> execute(String expression, List<String> eligibleOptions) {
        String[] expressions = expression.split("/");

        assert "*".equals(expressions[0]);

        int divisor = Integer.parseInt(expressions[1]);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < eligibleOptions.size(); ++i) {
            if ((i) % divisor == 0)
                result.add(eligibleOptions.get(i));
        }

        return result;
    }

}
