package bossmonster.util;

public class InputValidator {
    private static final int MAXIMUM_NAME_LENGTH = 5;
    private static final int INIT_POINTS_SUMMARY = 200;
    public static final String SEPARATOR = ",";
    private static final String WRONG_POINT_FORMAT = "\\w+[^" + SEPARATOR + "]\\w+";

    /**
     * Boss 입력값 관련
     */
    public static String validateNameLength(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 " + MAXIMUM_NAME_LENGTH + "자 까지만 입력해주세요.");
        }
        return name;
    }


    /**
     * Player 입력값 관련
     */
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

    /**
     * 공통
     */
    public static String validateWhiteSpace(String point) {
        if (point.strip().isBlank()) {
            throw new IllegalArgumentException("[ERROR] 공백은 입력할 수 없습니다.");
        }
        return point;
    }
}
