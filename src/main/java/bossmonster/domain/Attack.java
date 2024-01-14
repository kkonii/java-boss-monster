package bossmonster.domain;

import java.util.Arrays;
import java.util.function.Predicate;

public enum Attack {
    PHYSICS(number -> number == 1, 10, 10),
    MAGIC(number -> number == 2, 20, -30);

    private final Predicate<Integer> numberCondition;
    private final int damage;
    private final int mp;

    Attack(Predicate<Integer> numberCondition, int damage, int mp) {
        this.numberCondition = numberCondition;
        this.damage = damage;
        this.mp = mp;
    }

    public static Attack findAttack(int number) {
        return Arrays.stream(Attack.values())
                .filter(attack -> attack.numberCondition.test(number))
                .findFirst()
                .get();
    }

    public int getDamageValue() {
        return damage;
    }

    public int getMpValue() {
        return mp;
    }
}
