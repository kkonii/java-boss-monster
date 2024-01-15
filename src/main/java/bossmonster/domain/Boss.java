package bossmonster.domain;

import bossmonster.util.DamageGenerator;

public class Boss {
    private static final int HP_MINIMUM_RANGE = 100;
    private static final int HP_MAXIMUM_RANGE = 300;

    private final String name = "BOSS";
    private int hp;

    public Boss(int hp) {
        validateHPRange(hp);
        this.hp = hp;
    }

    private void validateHPRange(int hp) {
        if (hp < HP_MINIMUM_RANGE || hp > HP_MAXIMUM_RANGE) {
            throw new IllegalArgumentException(
                    "보스 몬스터 초기 HP는 " + HP_MINIMUM_RANGE + "이상 " + HP_MAXIMUM_RANGE + "이하 입니다.");
        }
    }

    public void damage(Attack attack) {
        hp -= attack.getDamageValue();
    }

    public void attack(Player player) {
        int randomDamage = DamageGenerator.generate();
        player.damage(randomDamage);
    }

    public boolean isFailed() {
        return hp <= 0;
    }
}