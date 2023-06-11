// 12S21035 - Silviana Siagian
// 12S21042 - Samuel Siagian
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] totalHarga = new double[3];
        double totalHrgOutput;
        
        totalHrgOutput = 0;
        banyakBuku(totalHarga, totalHrgOutput);
        outputHarga(totalHarga, totalHrgOutput);
    }
    
    public static void banyakBuku(double[] totalHarga, double totalHrgOutput) {
        String[] isbn = new String[3];
        double[] hargaBuku = new double[3];
        
        hargaBuku[0] = 0;
        hargaBuku[1] = 0;
        hargaBuku[2] = 0;
        int[] jumlah = new int[3];
        
        jumlah[0] = 0;
        jumlah[1] = 0;
        jumlah[2] = 0;
        totalHarga[0] = 0;
        totalHarga[1] = 0;
        totalHarga[2] = 0;
        int a, banyakBuku0, banyakBuku1, banyakBuku2;
        
        a = 0;
        banyakBuku0 = 0;
        banyakBuku1 = 0;
        banyakBuku2 = 0;
        String y0, y1, y2;
        
        y0 = "bagus";
        y1 = "bagus";
        y2 = "bagus";
        int k, l, m;
        
        k = 0;
        l = 1;
        m = 2;
        while (a < 3) {
            isbn[a] = input.nextLine();
            if (isbn[a].equals("---")) {
                a = 3;
            } else {
                if (isbn[a].equals(isbn[0])) {
                    if (k == 0) {
                        y0 = isbn[a];
                    }
                    if (isbn[0].equals(y0)) {
                        a = 0;
                        hargaBuku[a] = Double.parseDouble(input.nextLine());
                        jumlah[a] = Integer.parseInt(input.nextLine());
                        banyakBuku0 = banyakBuku0 + jumlah[a];
                        k = 3;
                        a = a + 1;
                    } else {
                        if (l == 1) {
                            y1 = isbn[a];
                        }
                        if (isbn[0].equals(y1)) {
                            a = 1;
                            hargaBuku[a] = Double.parseDouble(input.nextLine());
                            jumlah[a] = Integer.parseInt(input.nextLine());
                            banyakBuku1 = banyakBuku1 + jumlah[a];
                            k = 3;
                            a = a + 1;
                        } else {
                            a = 2;
                            hargaBuku[a] = Double.parseDouble(input.nextLine());
                            jumlah[a] = Integer.parseInt(input.nextLine());
                            banyakBuku2 = banyakBuku2 + jumlah[a];
                            k = 3;
                            a = 0;
                        }
                    }
                } else {
                    if (isbn[a].equals(isbn[1])) {
                        if (l == 1) {
                            y1 = isbn[a];
                        }
                        if (isbn[1].equals(y1)) {
                            a = 1;
                            hargaBuku[a] = Double.parseDouble(input.nextLine());
                            jumlah[a] = Integer.parseInt(input.nextLine());
                            banyakBuku1 = banyakBuku1 + jumlah[a];
                            l = 3;
                            a = a + 1;
                        } else {
                            a = 2;
                            hargaBuku[a] = Double.parseDouble(input.nextLine());
                            jumlah[a] = Integer.parseInt(input.nextLine());
                            banyakBuku2 = banyakBuku2 + jumlah[a];
                            l = 3;
                            a = 0;
                        }
                    } else {
                        if (isbn[a].equals(isbn[2])) {
                            if (m == 2) {
                                y2 = isbn[a];
                            }
                            if (isbn[2].equals(y2)) {
                                a = 2;
                                hargaBuku[a] = Double.parseDouble(input.nextLine());
                                jumlah[a] = Integer.parseInt(input.nextLine());
                                banyakBuku2 = banyakBuku2 + jumlah[a];
                                m = 3;
                                a = 0;
                            }
                        }
                    }
                }
            }
        }
        if (banyakBuku0 >= 20) {
            hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 0.12;
        } else {
            if (banyakBuku0 >= 10) {
                hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 0.05;
            } else {
                if (banyakBuku0 >= 5) {
                    hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 0.02;
                }
            }
        }
        totalHarga[0] = hargaBuku[0] * banyakBuku0;
        if (banyakBuku1 >= 20) {
            hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 0.12;
        } else {
            if (banyakBuku1 >= 10) {
                hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 0.05;
            } else {
                if (banyakBuku1 >= 5) {
                    hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 0.02;
                }
            }
        }
        totalHarga[1] = hargaBuku[1] * banyakBuku1;
        if (banyakBuku2 >= 20) {
            hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 0.12;
        } else {
            if (banyakBuku2 >= 10) {
                hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 0.05;
            } else {
                if (banyakBuku2 >= 5) {
                    hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 0.02;
                }
            }
        }
        totalHarga[2] = hargaBuku[2] * banyakBuku2;
    }
    
    public static double outputHarga(double[] totalHarga, double totalHrgOutput) {
        totalHrgOutput = totalHarga[0] + totalHarga[1] + totalHarga[2];
        System.out.println(toFixed(totalHrgOutput,2));
        
        return totalHrgOutput;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
