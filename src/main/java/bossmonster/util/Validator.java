package bossmonster.util;

public class Validator {
    public static final String SEPARATOR = ",";

    public static String validatePointFormat(String points) {
        if (points.startsWith(SEPARATOR) || points.endsWith(SEPARATOR)) {
            throw new IllegalArgumentException("[ERROR] " + SEPARATOR + "로 시작하거나 끝낼 수 없습니다.");
        }
        return points;
    }
}
