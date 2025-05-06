import java.util.Scanner;

public class UserInputHandler {

    private Scanner scanner;
    //Конструктор ініціалізує Scanner для читання з System.in
    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    //Метод для отримання рядкового вводу з підказкою
    public String getInput(String prompt) {
        System.out.print(prompt);        //Виводимо підказку користувачу
        return scanner.nextLine();       //Зчитуємо введення користувача як рядок
    }

    //Метод для отримання числового вводу з підказкою
    public double getInputDouble(String prompt) {
        System.out.print(prompt);        //Виводимо підказку
        return scanner.nextDouble();     //Зчитуємо введене число
    }

    //Метод для закриття Scanner (наприклад, при завершенні програми)
    public void close() {
        scanner.close();
    }
}
