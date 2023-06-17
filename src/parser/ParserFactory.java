package src.parser;

import src.util.Constants;

public class ParserFactory {
    public AbstractCronParser getParserByType(String parserType, String expression) {
        switch (parserType) {
            case Constants.ParserType.MINUTE:
                return new MinuteParser(expression);
            case Constants.ParserType.HOUR:
                return new HourParser(expression);
            case Constants.ParserType.DAY:
                return new DayParser(expression);
            case Constants.ParserType.MONTH:
                return new MonthParser(expression);
            case Constants.ParserType.DAY_OF_WEEK:
                return new WeekdayParser(expression);
            default:
                throw new RuntimeException("No Parser Found for type " + parserType);
        }
    }
}
