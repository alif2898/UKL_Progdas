import java.util.Scanner;
class MudahSoal3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nomor untuk mulai : ");
        int mulai = scanner.nextInt();
        
        System.out.print("Masukan nomor untuk mengakhiri : ");
        int akhir = scanner.nextInt();
        
        for (int i = mulai; i >= akhir; i--) {
            if (i % 3 == 1) {
                 System.out.println(i + ". Saya anak Wikusama");
         } else if (i % 3 == 2) {
            System.out.println(i + ". Saya anak moklet");
        } else if (i % 3 == 0) {
            System.out.println(i + ". Saya angkatan 33");
     }
}
        System.out.println("1. Saya senang");
    
    
    }
}
        