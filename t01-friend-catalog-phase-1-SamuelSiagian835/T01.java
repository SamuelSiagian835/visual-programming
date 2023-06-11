// 12S21042 - Samuel Siagian
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM, namaLengkap, prodi, usernameGitHub, noTelepon;
        
        nIM = input.nextLine();
        namaLengkap = input.nextLine();
        prodi = input.nextLine();
        noTelepon = input.nextLine();
        usernameGitHub = input.nextLine();
        System.out.println(nIM + "#" + namaLengkap + "#" + prodi + "#" + noTelepon + "#" + usernameGitHub);
    }
}
