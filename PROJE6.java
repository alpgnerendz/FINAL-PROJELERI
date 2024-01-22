import java.util.Scanner;

public class PROJE6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[10];
        int enBuyukSayi = Integer.MIN_VALUE;
        int enBuyukSayiIndex = -1;

        System.out.println("Lütfen 10 sayı giriniz:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();

            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
                enBuyukSayiIndex = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En büyük sayı " + (enBuyukSayiIndex + 1) + ". sırada girildi.");

        scanner.close();
    }
}