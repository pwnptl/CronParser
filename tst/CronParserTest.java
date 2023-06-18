package tst;


import org.junit.Before;
import org.junit.Test;
import src.CronParserFacade;

import java.util.List;

public class CronParserTest {

    private CronParserFacade parser;

    @Before
    public void initParser() {
        parser = new CronParserFacade();
    }

    @Test
    public void parse_asterisks() {
        String toParse = "* * * * * command";
        List<List<String>> actualResult = parser.parse(toParse);

//        System.out.println(toParse);
//        System.out.println(actualResult);
//        System.out.println();

        String result = "[[Minute of the Hour (0-59): , 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59], [Hour of the Day (0-23): , 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23], [Day of Month (1-31): , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31], [Month of the Year (1-12): , 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): , 0, 1, 2, 3, 4, 5, 6]]";
        assert result.equals(actualResult.toString());
    }

    @Test
    public void parse_numeric() {
        String toParse = "1 2 3 4 5 command";
        List<List<String>> actualResult = parser.parse(toParse);

//        System.out.println(toParse);
//        System.out.println(actualResult);
//        System.out.println();

        String result = "[[Minute of the Hour (0-59): , 1], [Hour of the Day (0-23): , 2], [Day of Month (1-31): , 3], [Month of the Year (1-12): , 4], [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): , 5]]";
        assert result.equals(actualResult.toString());
    }
    @Test
    public void parse_hyphen() {
        String toParse = "1 2-10 3 4 5 command";
        List<List<String>> actualResult = parser.parse(toParse);

//        System.out.println(toParse);
//        System.out.println(actualResult);
//        System.out.println();

        String result = "[[Minute of the Hour (0-59): , 1], [Hour of the Day (0-23): , 2, 3, 4, 5, 6, 7, 8, 9, 10], [Day of Month (1-31): , 3], [Month of the Year (1-12): , 4], [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): , 5]]";
        assert result.equals(actualResult.toString());
    }

    @Test
    public void parse_comma() {
        String toParse = "1 2,10 3 4 5 command";
        List<List<String>> actualResult = parser.parse(toParse);

//        System.out.println(toParse);
//        System.out.println(actualResult);
//        System.out.println();

        String result = "[[Minute of the Hour (0-59): , 1], [Hour of the Day (0-23): , 2, 10], [Day of Month (1-31): , 3], [Month of the Year (1-12): , 4], [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): , 5]]";
        assert result.equals(actualResult.toString());
    }


    @Test
    public void parse_division() {
        String toParse = "1 */10 3 4 5 command";
        List<List<String>> actualResult = parser.parse(toParse);

//        System.out.println(toParse);
//        System.out.println(actualResult);
//        System.out.println();

        String result = "[[Minute of the Hour (0-59): , 1], [Hour of the Day (0-23): , 0, 10, 20], [Day of Month (1-31): , 3], [Month of the Year (1-12): , 4], [Weekday(s) of the Day (0 SUNDAY- 6 SATURDAY): , 5]]";
        assert result.equals(actualResult.toString());
    }

}