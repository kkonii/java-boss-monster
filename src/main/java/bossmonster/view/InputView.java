package bossmonster.view;

import bossmonster.domain.Attack;
import bossmonster.util.InputValidator;
import bossmonster.util.ParsingUtil;
import java.util.Scanner;

public class InputView {
    private static final Scanner READER = new Scanner(System.in);

    public int requestBossHP() {
        System.out.println("보스 몬스터의 HP를 입력해주세요.");
        return ParsingUtil.parseToInt(READER.nextLine());
    }

    public String requestPlayerName() {
        System.out.println();
        System.out.println("플레이어의 이름을 입력해주세요.");
        return InputValidator.validateNameLength(READER.nextLine());
    }

    public String requestPlayerPoints() {
        System.out.println();
        System.out.println("플레이어의 HP와 MP를 입력해주세요.(" + InputValidator.SEPARATOR + "로 구분)");
        return InputValidator.validatePointFormat(READER.nextLine());
    }

    public int requestAttack() {
        System.out.println();
        System.out.println("어떤 공격을 하시겠습니까?");
        System.out.println(Attack.PHYSICS.getAttackNumber() + ". " + Attack.PHYSICS.getAttackName());
        System.out.println(Attack.MAGIC.getAttackNumber() + ". " + Attack.MAGIC.getAttackName());
        return ParsingUtil.parseToInt(READER.nextLine());
    }
}
