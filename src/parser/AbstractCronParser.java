package src.parser;

import lombok.Getter;
import src.strategy.IStrategy;
import src.strategy.StrategyFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCronParser {

    @Getter
    private List<String> eligibleOptions;

    @Getter
    private IStrategy strategy;

    protected String prefixString;

    protected abstract void setEligibleOptions();

    protected abstract void setPrefixString();

    public AbstractCronParser(String expression) {
        this.strategy = new StrategyFactory().findStrategy(expression);
        this.eligibleOptions = new ArrayList<>();
        this.setEligibleOptions();
        this.setPrefixString();
    }

    public List<String> parse(String expression) {
        List<String> parsedResult = new ArrayList<>();
        parsedResult.add(prefixString);  // add a prefixed string.
        parsedResult.addAll(strategy.execute(expression, getEligibleOptions()));
        return parsedResult;
    }
}
