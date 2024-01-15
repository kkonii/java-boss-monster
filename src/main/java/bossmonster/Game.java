package bossmonster;

import bossmonster.domain.Attack;
import bossmonster.domain.Boss;
import bossmonster.domain.Player;
import bossmonster.util.ParsingUtil;
import bossmonster.view.InputView;
import bossmonster.view.OutputView;

public class Game {
    private static int tryCount = 0;
    private final InputView inputView;
    private final OutputView outputView;

    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        initializeTryCount();
        Boss bossMonster = createBossMonster();
        Player player = createPlayer();
        outputView.printBeginning();
        fight(player, bossMonster);
    }

    private Boss createBossMonster() {
        return InputHandler.handle(() -> {
            int bossHP = inputView.requestBossHP();
            return new Boss(bossHP);
        });
    }

    private Player createPlayer() {
        String name = InputHandler.handle(inputView::requestPlayerName);
        return InputHandler.handle(() -> {
            String points = inputView.requestPlayerPoints();
            return ParsingUtil.parseToPlayer(name, points);
        });
    }

    private void fight(Player player, Boss boss) {
        do {
            turnPlayer(player, boss);
            if (boss.isFailed()) {
                break;
            }
            turnBoss(player, boss);
        } while (!boss.isFailed() || !player.isFailed());
    }

    private void initializeTryCount() {
        tryCount = 0;
    }

    private void turnPlayer(Player player, Boss boss) {
        Attack attack = ParsingUtil.parseToAttack(inputView.requestAttack());
        player.attack(boss, attack);
        outputView.printPlayerAttack(attack);
        tryCount++;
    }

    private void turnBoss(Player player, Boss boss) {
        int bossDamage = boss.attack(player);
        outputView.printBossAttack(bossDamage);
    }
}
