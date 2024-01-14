package bossmonster.domain;

public class Player {
    private static final int INIT_POINTS_SUMMARY = 200;

    private final String name;
    private int hp;
    private int mp;

    //for user
    public Player(String name, int hp, int mp) {
        validatePointsSum(hp, mp);
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    private void validatePointsSum(int hp, int mp) {
        if (hp + mp != INIT_POINTS_SUMMARY) {
            throw new IllegalArgumentException("[ERROR] 플레이어의 초기 hp와 mp의 합은 " + INIT_POINTS_SUMMARY + "가 되어야 합니다.");
        }
    }

    public void attack(Boss boss, Attack attack) {
        boss.damage(attack);
        mp += attack.getMpValue();
    }
}
