package bossmonster.view;

import bossmonster.domain.Attack;

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
}
