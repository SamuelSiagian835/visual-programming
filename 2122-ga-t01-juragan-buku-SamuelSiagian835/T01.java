// 12S21042 - Samuel Siagian
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stockbuku;
        String iSBNbuku, judulbuku, penulisbuku, tahunTerbitbuku, penerbitbuku, formatbuku;
        double hargabuku, minMarginbuku, ratingbuku;
        
        iSBNbuku = input.nextLine();
        judulbuku = input.nextLine();
        penulisbuku = input.nextLine();
        tahunTerbitbuku = input.nextLine();
        penerbitbuku = input.nextLine();
        formatbuku = input.nextLine();
        hargabuku = input.nextDouble();
        minMarginbuku = input.nextDouble();
        stockbuku = input.nextInt();
        ratingbuku = input.nextDouble();
        System.out.println(iSBNbuku + "|" + judulbuku + "|" + penulisbuku + "|" + tahunTerbitbuku + "|" + penerbitbuku + "|" + formatbuku + "|" + hargabuku + "|" + minMarginbuku + "|" + stockbuku + "|" + ratingbuku);
    }
}
