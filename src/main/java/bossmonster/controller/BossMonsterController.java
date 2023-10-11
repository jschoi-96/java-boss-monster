package bossmonster.controller;

import bossmonster.domain.BossMonster;
import bossmonster.domain.Player;
import bossmonster.view.InputView;

public class BossMonsterController {

    public void startGame(){
        inputBossMosterHp();
        inputPlayerName();
    }

    public BossMonster inputBossMosterHp(){
        int bossHp = InputView.readBossHp();
        BossMonster bossMonster = new BossMonster(bossHp);
        return bossMonster;

    }
    public Player inputPlayerName() {
        String playerName = InputView.readPlayerName();
        Player player = new Player(playerName);
        return player;
    }
}
