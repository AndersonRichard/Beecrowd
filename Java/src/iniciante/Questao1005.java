package iniciante;

import java.util.Scanner;

public class Questao1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float media = ((a * 3.5F) + (b * 7.5F))/11;

        System.out.printf("MEDIA = %.5f%n", media);

    }
}
