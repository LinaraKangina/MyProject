package impl;

import api.Registrator;
import api.User;
import java.util.Scanner;

public class RegistratorImpl implements Registrator {

    @Override
    public User registerUser() {
        String name;
            do {
                System.out.print("Привет, представься: ");
                Scanner scanner = new Scanner(System.in);
                name = scanner.nextLine();
            } while (name.length() == 0 || !name.chars().allMatch(Character::isLetter));
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        //System.out.println(name);

        // TODO Добавить проверку имени и спрашивать его до тех пор, пока не введут корректно
        //  Валидность имени: состоит только из букв и из одного слова
        //  Если пользователь вводит имя с маленькой буквы - перевести её в верхний регистр
        return new UserImpl(name);
    }
}
