package bossmonster.util;

import bossmonster.domain.Attack;
import bossmonster.domain.Player;
import java.util.Arrays;
import java.util.List;

public class ParsingUtil {
    public static int parseToInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자 이외에는 입력할 수 없습니다.");
        }
    }

    public static Player parseToPlayer(String name, String points) {
        List<Integer> hpAndMp = splitPoints(InputValidator.validateRegex(points));
        return new Player(name, hpAndMp.get(0), hpAndMp.get(1));
    }

    private static List<Integer> splitPoints(String points) {
        return Arrays.stream(points.split(InputValidator.SEPARATOR))
                .map(InputValidator::validateWhiteSpace)
                .map(ParsingUtil::parseToInt)
                .toList();
    }

    public static Attack parseToAttack(int number) {
        return Attack.findAttack(number);
    }
}
