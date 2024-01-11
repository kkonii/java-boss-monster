package bossmonster.util;

public class ParsingUtil {
    public static int parseToInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자 이외에는 입력할 수 없습니다.");
        }
    }
}
