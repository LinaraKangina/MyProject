package impl;

import api.Game;
import api.GameChooser;
import api.User;
import java.util.Scanner;

public class GameChooserImpl implements GameChooser {

    @Override
    public Game chooseGame(User user) {
        // TODO Добавить проверку, что название игры выбрано из списка,
        //  иначе сказать, что название игры должно быть из списка и попросить ввести снова,
        //  пока пользователь не введет название игры корректно
        System.out.print("Выберете игру:\n * Угадать число\n * Загадать число\nВаш вариант: ");
        String gameName;
        do {
            Scanner scanner = new Scanner(System.in);
            gameName = scanner.nextLine();
            if (gameName.equals("Угадать число")) {
                return new GuessNumberGame(user);
            } else if (gameName.equals("Загадать число")) {
                return new ThinkOfNumberGame(user);
            } else {
                System.out.println("Название игры должно быть из списка. Введите корректное название игры: ");
                gameName = scanner.nextLine();
                if (gameName.equals("Угадать число")) {
                    return new GuessNumberGame(user);
                } else if (gameName.equals("Загадать число")) {
                    return new ThinkOfNumberGame(user);
                }
             }
        } while (!gameName.equals("Угадать число") && !gameName.equals("Загадать число"));
            // TODO Возвращается null, если введено некорректное название игры,
            //  а должна спрашивать название, пока не будет введено корректное.
            //  Возврат значения null происходить не должен
        //  System.out.println("Введено некорректное название игры");
        return null;
    }
}
