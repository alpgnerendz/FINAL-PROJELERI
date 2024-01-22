import java.util.Scanner;

public class PROJE9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalık sayı giriniz: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);

        System.out.println("İkilik karşılığı: " + binaryNumber);
    }

    private static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        if (binary.length() == 0) {
            binary.append("0");
        }

        return binary.toString();
    }
}

