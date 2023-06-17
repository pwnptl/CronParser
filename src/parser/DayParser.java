package src.parser;

public class DayParser extends AbstractCronParser {

    public DayParser(String expression) {
        super(expression);
    }

    @Override
    protected void setEligibleOptions() {
        for (int i = 1; i <= 31; ++i) {
            getEligibleOptions().add(String.valueOf(i));
        }
    }

    @Override
    protected void setPrefixString() {
        this.prefixString = "Day of Month (1-31): ";
    }
}
