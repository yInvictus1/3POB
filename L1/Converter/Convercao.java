package L1.Converter;
import java.util.Scanner;

public class Convercao {

    public static void main(String[] args) {
        double Fah,celsius;
        Scanner temp = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        celsius=temp.nextDouble();

        Fah=(celsius*9/5)+32;

        System.out.println("A temperatura Convertida: " + Fah);

        temp.close();
    }
}
