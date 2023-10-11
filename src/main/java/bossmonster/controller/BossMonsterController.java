package bossmonster.controller;

import bossmonster.domain.Player;
import bossmonster.view.InputView;

public class BossMonsterController {

    public void startGame(){
        inputPlayerName();
    }

    public Player inputPlayerName() {
        String playerName = InputView.readPlayerName();
        Player player = new Player(playerName);
        return player;
    }
}
