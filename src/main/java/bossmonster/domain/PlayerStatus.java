package bossmonster.domain;

public class PlayerStatus {

    private int playerHp;
    private int playerMp;

    public PlayerStatus(int playerHp, int playerMp) {
        this.playerHp = playerHp;
        this.playerMp = playerMp;
        validatePlayerSum(playerHp,playerMp);
    }

    public static void validatePlayerSum(int hp, int mp){
        if (hp + mp != 200){
            throw new IllegalArgumentException("[ERROR] 플레이어의 초기 HP와 MP 합이 200이 아닙니다");
        }
    }
}
