package bossmonster.domain;

public class Boss {
    private final int HP_MINIMUM_RANGE = 100;
    private final int HP_MAXIMUM_RANGE = 300;

    private final String name = "BOSS";
    private int hp;

    public Boss(int hp) {
        validateHPRange(hp);
        this.hp = hp;
    }

    private void validateHPRange(int hp) {
        if (hp < HP_MINIMUM_RANGE || hp > HP_MAXIMUM_RANGE) {
            throw new IllegalArgumentException();
        }
    }
}
