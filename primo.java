import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        int valor;
        int divisor;
        int nDivisores;

        Scanner in = new Scanner(System.in);

        System.out.print("Insira um Número inteiro: ");
        valor = in.nextInt();

        nDivisores = 0;
        divisor = 1;

        while (divisor <= valor) {
            if ((valor % divisor) == 0) {
                nDivisores++;
            }

            divisor++;

        }

        if (nDivisores == 2)
            System.out.println("O valor: " + valor + " é Primo");
        else
            System.out.println("O valor: " + valor + " não é Primo");
    }
}