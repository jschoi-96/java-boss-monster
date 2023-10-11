package bossmonster.domain;

public class BossMonster {

    private int BossHp;

    public BossMonster(int BossHp) {
        this.BossHp = BossHp;
        validateHpRange(BossHp);
    }

    public void validateHpRange(int hp){
        if (hp < 100 || hp > 300) {
            throw new IllegalArgumentException("[ERROR] 보스의 HP는 100이상 300 이하여야 합니다.");
        }
    }
}
