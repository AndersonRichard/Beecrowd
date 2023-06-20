package iniciante;

import java.util.Scanner;

public class Questao1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sale = scanner.nextDouble();
        double total = (sale * 0.15) + salary;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
