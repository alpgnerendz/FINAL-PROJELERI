import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PROJE20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (GG.AA.YYYY) formatında giriniz: ");
        String dogumTarihiStr = scanner.nextLine();

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date dogumTarihi = sdf.parse(dogumTarihiStr);

            sdf.applyPattern("EEEE");
            String gunAdi = sdf.format(dogumTarihi);

            System.out.println("Doğduğunuz gün: " + gunAdi);

        } catch (ParseException e) {
            System.out.println("Geçersiz tarih formatı. Lütfen GG.AA.YYYY formatında giriniz.");
        }

        scanner.close();
    }
}
