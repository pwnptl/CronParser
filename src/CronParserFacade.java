package src;

import lombok.NonNull;
import src.parser.*;
import src.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class CronParserFacade {

    private final List<String> parsers;

    public CronParserFacade() {
        this.parsers = new ArrayList<>();
        this.parsers.add(Constants.ParserType.MINUTE);
        this.parsers.add(Constants.ParserType.HOUR);
        this.parsers.add(Constants.ParserType.DAY);
        this.parsers.add(Constants.ParserType.MONTH);
        this.parsers.add(Constants.ParserType.DAY_OF_WEEK);
    }


    public List<List<String>> parse(@NonNull String input) {

        String[] parts = input.split(" ");
        return parse(parts);
    }

    public List<List<String>> parse(@NonNull String[] parts) {
        ParserFactory parserFactory = new ParserFactory();
        List<List<String>> result = new ArrayList<>();


        for (int i = 0; i < parts.length && i < parsers.size(); ++i) {
            AbstractCronParser parser = parserFactory.getParserByType(parsers.get(i), parts[i]);
            List<String> partResult = parser.parse(parts[i]);
            result.add(partResult);
        }
        return result;
    }

}
