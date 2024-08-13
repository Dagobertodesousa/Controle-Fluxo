import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("valor 1: ");
        int menor = scan.nextInt();
        System.out.println("valor 2: ");
        int maior = scan.nextInt();

        try {
            contar(menor, maior);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.toString());
        }
        scan.close();
    }
    static void contar(int value01, int value02) throws ParametrosInvalidosException{
        int range = value02 - value01;
        if (range > 0) {
            for (int i = 1; i <= range; i++){
                System.out.println("Imprimindo o valor " + i);
            }
        } else {} throw new ParametrosInvalidosException();
    }
}
