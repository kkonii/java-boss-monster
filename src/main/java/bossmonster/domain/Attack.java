package bossmonster.domain;

import java.util.Arrays;

public enum Attack {
    PHYSICS(1, "물리 공격", 10, 10),
    MAGIC(2, "마법 공격", 20, -30);

    private final int number;
    private final String name;
    private final int damage;
    private final int mp;

    Attack(int number, String name, int damage, int mp) {
        this.number = number;
        this.name = name;
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

    public String getAttackName() {
        return name;
    }

    public int getDamageValue() {
        return damage;
    }

    public int getMpValue() {
        return mp;
    }
}
