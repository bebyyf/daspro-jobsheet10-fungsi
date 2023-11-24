public class programKu {
    public static void TampilhinggaKei(int i){
        for (int j=1; j <= i; j++){
            System.out.print(j);
        }
    }
    public static int Jumlah (int bil1, int bil2){
        return(bil1+bil2);
    }
    public static void Tampiljumlah (int bil1, int bil2){
        TampilhinggaKei(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        Tampiljumlah(temp, 5);
    }
}
