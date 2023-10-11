package bossmonster.controller;

import bossmonster.domain.BossMonster;
import bossmonster.domain.Player;
import bossmonster.domain.PlayerStatus;
import bossmonster.view.InputView;

public class BossMonsterController {

    public void startGame(){
        inputBossMosterHp();
        inputPlayerName();
        inputPlayerStatus();
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

    public PlayerStatus inputPlayerStatus() {
        String inputPlayerStatus = InputView.readPlayerStatus();
        String[] playerValues = inputPlayerStatus.split(",");
        int playerHp = Integer.parseInt(playerValues[0]);
        int playerMp = Integer.parseInt(playerValues[1]);
        PlayerStatus playerStatus = new PlayerStatus(playerHp, playerMp);
        return playerStatus;
    }
}
