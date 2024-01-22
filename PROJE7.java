import java.util.Scanner;

public class PROJE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam50veUstu = 0;
        int toplamKucuk50 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz (0-100 arasında): ");
            int sayi = scanner.nextInt();

            if (sayi >= 0 && sayi <= 100) {
                if (sayi >= 50) {
                    toplam50veUstu += sayi;
                } else {
                    toplamKucuk50 += sayi;
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen 0-100 arasında bir sayı giriniz.");
                i--;
            }
        }

        if (toplamKucuk50 != 0) {
            double oran = (double) toplam50veUstu / toplamKucuk50;
            System.out.println("50 ve üstü olanların toplamı / 50'den küçük olanların toplamı oranı: " + oran);
        } else {
            System.out.println("50'den küçük olan sayıların toplamı sıfır olduğu için oran hesaplanamaz.");
        }

        scanner.close();
    }
}
