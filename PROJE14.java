import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PROJE14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("İlk tarihi giriniz (yyyy-MM-dd): ");
        String ilkTarihStr = scanner.nextLine();
        LocalDate ilkTarih = LocalDate.parse(ilkTarihStr);


        System.out.print("İkinci tarihi giriniz (yyyy-MM-dd): ");
        String ikinciTarihStr = scanner.nextLine();
        LocalDate ikinciTarih = LocalDate.parse(ikinciTarihStr);

        Period fark = Period.between(ilkTarih, ikinciTarih);

        System.out.println("Tarih Farkı: " + fark.getYears() + " yıl, " + fark.getMonths() + " ay, " + fark.getDays() + " gün");

        scanner.close();
    }
}
