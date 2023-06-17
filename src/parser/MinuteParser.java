package src.parser;

public class MinuteParser extends AbstractCronParser {
    public MinuteParser(String expression) {
        super(expression);
    }

    @Override
    protected void setEligibleOptions() {
        for(int i=0;i<60;++i)
        {
            getEligibleOptions().add(String.valueOf(i));
        }
    }

    @Override
    protected void setPrefixString() {
        this.prefixString = "Minute of the Hour (0-59): ";
    }
}
