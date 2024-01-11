package bossmonster.domain;

public class Player {
    private static final int MAXIMUM_NAME_LENGTH = 5;

    private final String name;
    private int mp;
    private int hp;

    //for user
    public Player(String name, int mp, int hp) {
        validateNameLength(name);
        validateBlank(name);
        this.name = name;
        this.mp = mp;
        this.hp = hp;
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
}
