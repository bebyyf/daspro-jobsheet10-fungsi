import java.util.Scanner;

public class ArrayFungsi {
    public static  int JUMLAH_MAHASISWA = 5;
    public static  int JUMLAH_MINGGU = 7;
    public static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    public static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];

    static void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        JUMLAH_MAHASISWA = input.nextInt();

        System.out.print("Masukkan jumlah tugas per minggu: ");
        JUMLAH_MINGGU = input.nextInt();

        namaMahasiswa = new String[JUMLAH_MAHASISWA];
        nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();

            System.out.println("Masukkan nilai tugas untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanNilai() {
        System.out.println("Nilai Mahasiswa:");
        System.out.println("Nama\t\tMinggu 1\tMinggu 2\tMinggu 3\tMinggu 4\tMinggu 5\tMinggu 6\tMinggu 7");

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print(namaMahasiswa[i] + "\t\t");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    } 
    static void cariHariNilaiTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    hariTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nNilai tertinggi ditemukan pada minggu ke-" + hariTertinggi);
    }

    static void tampilkanMahasiswaTertinggi() {
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + namaMahasiswa[mahasiswaTertinggi]);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi + " (Minggu ke-" + mingguTertinggi + ")");
    }

    public static void main(String[] args) {
        inputData();
        tampilkanNilai();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaTertinggi();
    }

    
}


