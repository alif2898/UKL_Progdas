 import java.util.Scanner;
 class MudahSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai awal");
        int nilai_awal = input.nextInt();

        
        System.out.println("Masukkan Nilai Akhir");
        int nilai_akhir = input.nextInt();

    
        for(int i = nilai_awal; i <= nilai_akhir; i++){
            if (i % 2 == 0) {
                System.out.println( i + " adalah bilangan genap ");
        } else {
            System.out.println( i + " adalah bilangan ganjil ");
        }

    }
} 
 }     