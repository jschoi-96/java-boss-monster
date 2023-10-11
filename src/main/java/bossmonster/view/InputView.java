package bossmonster.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String readPlayerName() {
        String playerName = scanner.nextLine();
        validateBlankName(playerName);
        return playerName;
    }

    public static void validateBlankName(String playerName){
        if (playerName.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 플레이어 이름이 공백일 수 없습니다.");
        }
    }
}
