package bossmonster.view;

import bossmonster.util.ParsingUtil;
import java.util.Scanner;

public class InputView {
    private static final Scanner READER = new Scanner(System.in);

    public int requestBossHP() {
        System.out.println("보스 몬스터의 HP를 입력해주세요.");
        return ParsingUtil.parseToInt(READER.nextLine());
    }

    public String requestPlayerName() {
        System.out.println("플레이어의 이름을 입력해주세요.");
        return READER.nextLine();
    }

    public String requestPlayerStatus() {
        System.out.println("플레이어의 HP와 MP를 입력해주세요.(,로 구분)");
        return READER.nextLine();
    }
}