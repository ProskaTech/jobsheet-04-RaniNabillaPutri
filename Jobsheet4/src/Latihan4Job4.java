/**
 *
 * created by 21343034_Rani Nabilla Putri
 */
public class Latihan4Job4 {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;

        //demonstrasi ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demonstrasi ||
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
