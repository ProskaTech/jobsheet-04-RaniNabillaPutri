/**
 *
 * created by 21343034_Rani Nabilla Putri
 */
public class Tugas2Job4 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int nilaiTertinggi;

        nilaiTertinggi = (number2>=number1)? number2: number1;
        nilaiTertinggi = (number3>=nilaiTertinggi)? number3: nilaiTertinggi;

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + nilaiTertinggi);
    }
}
