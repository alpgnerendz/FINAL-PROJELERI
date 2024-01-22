import java.util.Scanner;

public class PROJE13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz:");
        System.out.print("Kenar 1: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Kenar 2: ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Kenar 3: ");
        double kenar3 = scanner.nextDouble();

        if (isUcgen(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulabilir.");

            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Bu üçgen bir eşkenar üçgendir.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Bu üçgen bir ikizkenar üçgendir.");
            }

            if (isDikUcgen(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen aynı zamanda bir dik üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunluklarıyla bir üçgen oluşturulamaz.");
        }

        scanner.close();
    }

    public static boolean isUcgen(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isDikUcgen(double a, double b, double c) {
        double[] kenarlar = { a, b, c };
        java.util.Arrays.sort(kenarlar);
        return (kenarlar[0] * kenarlar[0] + kenarlar[1] * kenarlar[1] == kenarlar[2] * kenarlar[2]);
    }
}


