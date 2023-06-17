package src.parser;

public class WeekdayParser extends AbstractCronParser {

    public WeekdayParser(String expression) {
        super(expression);
    }

    @Override
    protected void setEligibleOptions() {
        for(int i=0;i<7;++i)
        {
            getEligibleOptions().add(String.valueOf(i));
        }
    }

    @Override
    protected void setPrefixString() {
        this.prefixString = "Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): ";
    }
}
