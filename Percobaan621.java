import java.util.Scanner;

public class Percobaan621{
    static int hitungLuas(int pjg, int lb){ //Fungsi hitungLuas
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b){ //Fungsi hitungVolume
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }
    public static void main(String[] args) { //Fungsi main
        Scanner input = new Scanner (System.in);
        int p,l,t,L,vol;
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi panjang adalah "+L);

        vol=p*l*t;
        System.out.println("Volume balok adalah "+vol);
    }
}