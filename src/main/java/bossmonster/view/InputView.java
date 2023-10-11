package bossmonster.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static int readBossHp() {
        String bossHp = scanner.nextLine();
        validateBlankBossHp(bossHp);
        return Integer.parseInt(bossHp);
    }
    public static String readPlayerName() {
        String playerName = scanner.nextLine();
        validateBlankName(playerName);
        return playerName;
    }

    public static void validateBlankBossHp(String bossHp) {
        // isBlank() 라는 메서드를 사용하기 위해서 입력받을 때 int type보다 string으로 받았는데 원래 이렇게 하는지?
        if (bossHp.isBlank()){
            throw new IllegalArgumentException("[ERROR] 보스 HP는 공백일 수 없습니다.");
        }
    }

    public static void validateBlankName(String playerName){
        if (playerName.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 플레이어 이름이 공백일 수 없습니다.");
        }
    }
}
