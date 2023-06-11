// 12S21042 - Samuel Siagian
// 12S21035 - Silviana Siagian

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrISBN = new String[5];
        double[] arrHargaBuku = new double[5];
        int[] arrJumlahBuku = new int[5];
        int n, s;
        
        n = 0;
        boolean done;
        
        done = true;
        for (s = 0; s <= 4; s++) {
            defaultValue(arrISBN, arrHargaBuku, arrJumlahBuku, s);
        }
        katalog(arrISBN, arrHargaBuku, s, done);
        pesananBuku(arrISBN, arrJumlahBuku, n, s, done);
        totalHargaBuku(arrJumlahBuku, arrHargaBuku, s);
    }
    
    public static void defaultValue(String[] arrISBN, double[] arrHargaBuku, int[] arrJumlahBuku, int s) {
        arrISBN[s] = "";
        arrHargaBuku[s] = 0.0;
        arrJumlahBuku[s] = 0;
    }
    
    public static void katalog(String[] arrISBN, double[] arrHargaBuku, int s, boolean done) {
        double hargaBuku;
        String iSBN;
        
        for (s = 0; s <= 4; s++) {
            iSBN = input.nextLine();
            hargaBuku = Double.parseDouble(input.nextLine());
            arrISBN[s] = iSBN;
            arrHargaBuku[s] = hargaBuku;
        }
    }
    
    public static void pesananBuku(String[] arrISBN, int[] arrJumlahBuku, int n, int s, boolean done) {
        int jumlahBuku;
        String iSBN;
        
        s = 0;
        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                jumlahBuku = Integer.parseInt(input.nextLine());
                for (n = 0; n <= 4; n++) {
                    if (arrISBN[n].equals(iSBN)) {
                        arrJumlahBuku[n] = jumlahBuku;
                    }
                }
                s = s + 1;
            } else {
                done = false;
            }
        } while (done == true);
    }
    
    public static void totalHargaBuku(int[] arrJumlahBuku, double[] arrHargaBuku, int s) {
        double hargaBuku;
        double totalHargaBuku;
        
        totalHargaBuku = 0.0;
        for (s = 0; s <= 4; s++) {
            hargaBuku = arrHargaBuku[s] * arrJumlahBuku[s];
            totalHargaBuku = totalHargaBuku + hargaBuku;
        }
        System.out.println(toFixed(totalHargaBuku,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
