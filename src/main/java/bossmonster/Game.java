package bossmonster;

import bossmonster.domain.Boss;
import bossmonster.domain.Player;
import bossmonster.view.InputView;

public class Game {
    private final InputView inputView;

    public Game(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        Boss bossMonster = createBossMonster();
        Player player = createPlayer();
    }

    public Boss createBossMonster() {
        int bossHP = inputView.requestBossHP();
        return new Boss(bossHP);
    }

    public Player createPlayer() {
        String name = inputView.requestPlayerName();
        return new Player(name, 0, 0);
    }
}
