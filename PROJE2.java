import java.util.Scanner;

public class PROJE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " bir palindrom değildir.");
        }

        scanner.close();
    }
    public static boolean isPalindrom(String str) {

        str = str.toLowerCase();

        StringBuilder terstenOkunus = new StringBuilder(str);
        terstenOkunus.reverse();

        return str.equals(terstenOkunus.toString());
    }
}
