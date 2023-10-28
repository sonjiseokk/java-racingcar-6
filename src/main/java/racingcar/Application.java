package racingcar;

import racingcar.core.GameManager;
import racingcar.core.Input;
import racingcar.core.Output;
import racingcar.domain.Car;
import racingcar.domain.CarFactory;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Input input = new Input();
        Output output = new Output();
        CarFactory factory = new CarFactory();
        GameManager gameManager = new GameManager(input,output,factory);

        gameManager.play();
    }
}
