package src.parser;

public class MonthParser extends AbstractCronParser {

    public MonthParser(String expression) {
        super(expression);
    }

    @Override
    protected void setEligibleOptions() {
        for(int i=1;i<=12;++i)
        {
            getEligibleOptions().add(String.valueOf(i));
        }
    }

    @Override
    protected void setPrefixString() {
        this.prefixString = "Month of the Year (1-12): ";
    }
}
