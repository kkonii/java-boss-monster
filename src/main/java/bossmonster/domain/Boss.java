package bossmonster.domain;

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
            throw new IllegalArgumentException("보스 몬스터 초기 HP는 " + HP_MINIMUM_RANGE + "이상 " + HP_MINIMUM_RANGE + "입니다.");
        }
    }

    public void damage(Attack attack) {
        hp -= attack.getDamageValue();
    }
}