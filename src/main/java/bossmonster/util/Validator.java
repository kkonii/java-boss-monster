package bossmonster.util;

public class Validator {
    public static final String SEPARATOR = ",";
    private static final String WRONG_POINT_FORMAT = "\\w+[^" + SEPARATOR + "]\\w+";

    public static String validatePointFormat(String points) {
        if (points.startsWith(SEPARATOR) || points.endsWith(SEPARATOR)) {
            throw new IllegalArgumentException("[ERROR] " + SEPARATOR + "로 시작하거나 끝낼 수 없습니다.");
        }
        return points;
    }

    public static String validateRegex(String points) {
        if (points.matches(WRONG_POINT_FORMAT)) {
            throw new IllegalArgumentException("[ERROR] " + SEPARATOR + "로 구분하여 입력해 주세요.");
        }
        return points;
    }

    public static String validateWhiteSpace(String point) {
        if (point.strip().isBlank()) {
            throw new IllegalArgumentException("[ERROR] 공백은 입력할 수 없습니다.");
        }
        return point;
    }
}
