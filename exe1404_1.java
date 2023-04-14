import java.util.*;
import java.lang.Math;
import java.io.FileWriter;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);
    private static FileWriter writer;

    public static void main(String[] args) {
        int a, b;
        
        System.out.println("Informe os Mb's");
        a = input.nextInt();
        if (a > 100) {
            b= (a - 100) * 2 + 40;
            writer.write("Valor a ser pago: R$b" + "\n");
        } else {
            writer.write("Valor a pagar: R$40" + "\n");
        }
    }
}
