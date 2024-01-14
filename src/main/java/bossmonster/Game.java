package bossmonster;

import bossmonster.domain.Boss;
import bossmonster.domain.Player;
import bossmonster.util.ParsingUtil;
import bossmonster.view.InputView;
import bossmonster.view.OutputView;

public class Game {
    private final InputView inputView;
    private final OutputView outputView;

    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Boss bossMonster = createBossMonster();
        Player player = createPlayer();
        outputView.printBeginning();
        int attack = inputView.requestAttack();
    }

    public Boss createBossMonster() {
        int bossHP = inputView.requestBossHP();
        return new Boss(bossHP);
    }

    public Player createPlayer() {
        String name = inputView.requestPlayerName();
        String points = inputView.requestPlayerPoints();
        return ParsingUtil.parseToPlayer(name, points);
    }
}
