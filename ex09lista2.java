import java.util.Scanner;

public class ex09lista2 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite o primeiro número ");
        n1 = teclado.nextDouble();

        System.out.println(" Digite o segundo número ");
        n2 = teclado.nextDouble();

        System.out.println(" Digite o terceiro número ");
        n3 = teclado.nextDouble();

        teclado.close();

        if (n1 > n2 && n1 > n3 && n3 < n1 && n3 < n2) {
            System.out.println(" a ordem decrescente é " + n1 + n2 + n3);
        } else if (n1 > n2 && n1 > n3 && n2 < n1 && n2 < n3) {
            System.out.println(" a ordem decrescente é " + n1 + n3 + n2);
        } else if (n2 > n1 && n2 > n3 && n3 < n1 && n3 < n2) {
            System.out.println(" a ordem decrescente é " + n2 + n1 + n3);
        } else if (n2 > n1 && n2 > n3 && n2 < n1 && n2 < n3) {
            System.out.println(" a ordem decrescente é " + n2 + n3 + n1);
        } else if (n3 > n1 && n3 > n2 && n1 < n2 && n1 < n3) {
            System.out.println(" a ordem decrescente é " + n3 + n2 + n1);
        } else if (n3 > n1 && n3 > n2 && n2 < n1 && n2 < n3) {
            System.out.println(" a ordem decrescente é " + n3 + n1 + n2);
        }
    }
}
