package L1.Distancia;

import java.util.Scanner;

public class Distancis_EntrePontos {

    public static void main(String[] args) {
        double x1,x2,y1,y2,formula;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dois pontos do x e do y");
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        formula = Math.sqrt((x1*x1)-(x2*x2) + (y1*y1)-(y2*y2));

        System.out.println("A distancia entre dois pontos é de : " + formula);

        scanner.close();
    }
}
