import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int pozitiv = 0;
        int negativ = 0;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
         int g =  scanner.nextInt();
         if (g == 0) {
             System.out.println("Exit");
             break;
         }

         if (g > 0) {
             pozitiv++;
             System.out.println("Numarul introdus la consola este: " + g +  " care e pozitiv");
         } else {
             negativ++;
             System.out.println("Numarul introdus la consola este: " + g +  " care e negativ");
         }

         suma = suma + g;

       }

        System.out.println("Suma este: " + suma);
        System.out.println("Numere pozitive sunt: " + pozitiv);
        System.out.println("Numere negative sunt: " + negativ);

    }
}