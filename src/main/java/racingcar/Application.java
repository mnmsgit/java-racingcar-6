package racingcar;

import racingcar.controller.RacingGameController;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController= new RacingGameController();
        racingGameController.gameInit();
        racingGameController.gameStart();
        racingGameController.gameEnd();
        // TODO: 프로그램 구현
    }
}
