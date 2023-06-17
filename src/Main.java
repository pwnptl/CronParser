package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CronParserFacade cronParser = new CronParserFacade();
        String toParse = null;
        List<List<String>> parsedData = null;
        if (args.length == 0) {
            toParse = "*/4 */3 * * *";
            parsedData = cronParser.parse(toParse);
            printData(parsedData);

        } else if (args.length == 6) {
            parsedData = cronParser.parse(args);
            printData(parsedData);
        }
    }

    private static void printData(List<List<String>> parsedData) {
        for (List<String> parsedPart : parsedData) {
            System.out.println(parsedPart);
        }
    }
}