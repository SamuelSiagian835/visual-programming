// 12S21035 - Silviana Siagian
// 12S21042 - Samuel Siagian
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        String isbn;
        int bMPL;
        int diskon;
        int b;
        
        n = 3;
        String[] arrIsbn = new String[n];
        double[] arrHargaBuku = new double[n];
        String[] arrJumlah = new String[n];
        double totalHargaBuku;
        
        totalHargaBuku = 0;
        do {
            isbn = input.nextLine();
            if (!isbn.equals("---")) {
                String pengurangan;
                String penambahan;
                double hargaBuku;
                int jumlah;
                
                hargaBuku = Double.parseDouble(input.nextLine());
                jumlah = Integer.parseInt(input.nextLine());
                bMPL = Integer.parseInt(input.nextLine());
                if (bMPL > 1) {
                    b = Integer.parseInt(input.nextLine());
                    pengurangan = "Jumlah-b";
                } else {
                    b = Integer.parseInt(input.nextLine());
                    penambahan = "Jumlah+b";
                }
                totalHargaBuku = totalHargaBuku + hargaBuku * jumlah;
                if (jumlah >= 5) {
                    diskon = 2;
                } else {
                    if (jumlah >= 10) {
                        diskon = 5;
                    } else {
                        diskon = 12;
                    }
                }
                totalHargaBuku = totalHargaBuku + hargaBuku * jumlah;
            } else {
                System.out.println(toFixed(totalHargaBuku,2));
            }
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
