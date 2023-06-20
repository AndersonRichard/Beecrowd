package iniciante;

import java.util.Scanner;

public class Questao1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        float valor = scanner.nextFloat();
        float salary = hours * valor;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
