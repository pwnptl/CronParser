package src.strategy;

import java.util.ArrayList;
import java.util.List;

public interface IStrategy {
    default List<String> execute(String expression, List<String> eligibleOptions) {
        throw new RuntimeException("not implemented");
    }
}
