package bossmonster.domain;

public class Player {

    private final String name;


    public Player(String name) {
        this.name = name;
        validatePlayerLength(name);
    }

    public void validatePlayerLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 플레이어의 이름은 5자 이하여야 합니다.");
        }
    }
}
