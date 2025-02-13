import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Калькулятор принимает число от 1 до 10. Введите выражение (например, 1 + 2): ");
        String expression = scanner.nextLine();


        if (!expression.matches("\\d+ [\\+\\-\\*/] \\d+")) {
            throw new IllegalArgumentException("Ошибка: Некорректный формат выражения. Используйте формат: a + b");
        }

        String[] parts = expression.split(" ");
        int a = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Ошибка: Числа должны быть от 1 до 10 включительно");
        }

        int result;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else {
            result = a / b;
        }

        System.out.println(result);
        scanner.close();
    }
}