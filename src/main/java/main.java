import java.util.Scanner;
// Калькулятор
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float res;

        System.out.print("Введите первое число: ");
        float num1 = scan.nextFloat();

        System.out.print("Введите второе число: ");
        float num2 = scan.nextFloat();

        System.out.print("Введите действие: ");
        String action = scan.nextLine();
        action = scan.nextLine(); // для исключения невидимого символа из предыдущего скана.

        switch (action) {
            case "+" :
                res = num1 + num2;
                System.out.println("результат равен: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("результат равен: " + res);
                break;
            case "/":
            if (num2 == 0) {
                System.out.println("Делить на ноль нельзя");
            }
            else {
                res = num1 / num2;
                System.out.println("результат равен: " + res);
            }
            break;
            case "*":
                res = num1 * num2;
                System.out.println("результат равен: " + res);
                break;
            default:
                System.out.println("некорректный ввод!");

        }
    }
}
