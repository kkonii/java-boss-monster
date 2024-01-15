package bossmonster.domain;

import java.util.Arrays;

public enum Attack {
    PHYSICS(1, 10, 10),
    MAGIC(2, 20, -30);

    private final int number;
    private final int damage;
    private final int mp;

    Attack(int number, int damage, int mp) {
        this.number = number;
        this.damage = damage;
        this.mp = mp;
    }

    public static Attack findAttack(int number) {
        return Arrays.stream(Attack.values())
                .filter(attack -> attack.number == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "[ERROR]  공격하셔야 합니다. " + PHYSICS.number + " 또는 " + MAGIC.number + "를 입력해주세요."));
    }

    public int getAttackNumber() {
        return number;
    }

    public int getDamageValue() {
        return damage;
    }

    public int getMpValue() {
        return mp;
    }
}
