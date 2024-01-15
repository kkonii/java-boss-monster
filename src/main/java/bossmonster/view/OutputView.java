package bossmonster.view;

import bossmonster.domain.Attack;
import bossmonster.domain.Player;

public class OutputView {
    public void printBeginning() {
        System.out.println();
        System.out.println("보스 레이드를 시작합니다!");
    }

    public void printPlayerAttack(Attack attack) {
        System.out.println();
        System.out.print(attack.getAttackName() + "을 했습니다. ");
        System.out.println("(입힌 데미지: " + attack.getDamageValue() + ")");
    }

    public void printBossAttack(int damageValue) {
        System.out.print("보스가 공격 했습니다.");
        System.out.println("(입힌 데미지: " + damageValue + ")");
    }

    public void printPlayerWin(Player player, int tryCount) {
        System.out.println(player.getName() + "님이 " + tryCount + "번의 전투 끝에 보스 몬스터를 잡았습니다.");
    }

    public void printPlayerLose(Player player) {
        System.out.println(player.getName() + "님의 HP가 " + player.getHpValue() + "이 되었습니다.");
        System.out.println("보스 레이드에 실패했습니다.");
    }
}
