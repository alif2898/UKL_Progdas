 import java.util.Scanner;
 class SedangSoal2 {
    static void hitung(int r, int t) {
        double phi = 3.14;
        double hasil = phi * r * r * t;
        System.out.println("Volume Tabung : " + hasil);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jari jari tabung");
        int j = input.nextInt();
        System.out.println("Masukkan tinggi tabung");
        int t = input.nextInt();
        hitung(j,t);

    
    }


}
    

