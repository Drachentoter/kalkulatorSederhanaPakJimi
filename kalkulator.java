import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        double num1, num2, result;

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("Operasi yang dapat dilakukan: +, -, *, /");

        while (true) {
            System.out.print("Masukkan angka pertama: ");
            num1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operator tidak valid");
                    continue; // Melanjutkan loop tanpa menampilkan hasil
            }

            System.out.println("Hasil: " + result);

            System.out.print("Apakah Anda ingin melakukan operasi lain? (ya/tidak): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("ya")) {
                System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana!");
                break;
            }
        }

        scanner.close();
    }
}
