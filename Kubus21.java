import java.util.Scanner;

public class Kubus21 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volumeKubus = hitungVolume(sisi);
        int luasPermukaanKubus = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus: " + volumeKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus);
    }
}
