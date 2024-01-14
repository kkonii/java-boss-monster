package bossmonster;

import bossmonster.view.InputView;
import bossmonster.view.OutputView;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new InputView(), new OutputView());
        game.run();
    }
}
