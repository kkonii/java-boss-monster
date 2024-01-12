package bossmonster.domain;

public class Player {
    private static final int MAXIMUM_NAME_LENGTH = 5;
    private static final int INIT_POINTS_SUMMARY = 200;

    private final String name;
    private int hp;
    private int mp;

    //for user
    public Player(String name, int hp, int mp) {
        validateNameLength(name);
        validateBlank(name);
        validatePointsSum(hp, mp);
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    private void validateNameLength(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 " + MAXIMUM_NAME_LENGTH + "자 까지만 입력해주세요.");
        }
    }

    private void validateBlank(String name) {
        if (name.isBlank() || name.contains(" ")) {
            throw new IllegalArgumentException("[ERROR] 공백은 이름에 입력할 수 없습니다.");
        }
    }

    private void validatePointsSum(int hp, int mp) {
        if (hp + mp != INIT_POINTS_SUMMARY) {
            throw new IllegalArgumentException("[ERROR] 플레이어의 초기 hp와 mp의 합은 " + INIT_POINTS_SUMMARY + "가 되어야 합니다.");
        }
    }
}
