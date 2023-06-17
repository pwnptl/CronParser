package src.parser;

public class HourParser extends AbstractCronParser {

    public HourParser(String expression) {
        super(expression);
    }

    @Override
    protected void setEligibleOptions() {
        for (int i = 0; i < 24; ++i) {
            getEligibleOptions().add(String.valueOf(i));
        }
    }

    @Override
    protected void setPrefixString() {
        this.prefixString = "Hour of the Day (0-23): ";
    }

}
