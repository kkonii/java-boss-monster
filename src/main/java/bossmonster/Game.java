package bossmonster;

import bossmonster.domain.Boss;
import bossmonster.view.InputView;

public class Game {
    private final InputView inputView;

    public Game(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        Boss bossMonster = createBossMonster();
    }

    public Boss createBossMonster() {
        int bossHP = inputView.requestBossHP();
        return new Boss(bossHP);
    }
}
