package src.strategy;

import java.util.List;

public class AsteriskStrategy implements IStrategy {
    @Override
    public List<String> execute(String expression, List<String> eligibleOptions) {
        return eligibleOptions;
    }

}
