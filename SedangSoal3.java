import java.util.Random;
import java.util.Scanner;

class SedangSoal3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

    while (lanjut) {
        // Angka acak untuk bilangan pertama dan bilangan kedua
           int bilanganPertama = rand.nextInt(100) + 1; // Angka acak antara 1 hingga 100
           int bilanganKedua = rand.nextInt(100) + 1;  // Angka acak antara 1 hingga 100

            // Operator acak
            char[] operator = {'*', '/', '%', '+', '-'};
            char operatorAcak = operator[rand.nextInt(operator.length)];

            // Menampilkan pertanyaan kuis
            System.out.print(bilanganPertama + " " + operatorAcak + " " + bilanganKedua + " = ");
            int jawabanUser = input.nextInt();

            // Menghitung jawaban yang benar
            int jawabanBenar = 0;
            switch (operatorAcak) {
                case '*':
                    jawabanBenar = bilanganPertama * bilanganKedua;
                    break;
                case '/':
                    jawabanBenar = bilanganPertama / bilanganKedua;
                    break;
                case '%':
                    jawabanBenar = bilanganPertama % bilanganKedua;
                    break;
                case '+':
                    jawabanBenar = bilanganPertama + bilanganKedua;
                    break;
                case '-':
                    jawabanBenar = bilanganPertama - bilanganKedua;
                    break;
            }

            // Mengecek jawaban user
            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah " + jawabanBenar);
            }

            // Menanyakan user apakah ingin lanjut atau berhenti
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            char pilihan = input.next().charAt(0);
            if (pilihan == 'n' || pilihan == 'N') {
                lanjut = false;
            }
        }
        
        System.out.println("Terima kasih telah bermain!");
    }
}    