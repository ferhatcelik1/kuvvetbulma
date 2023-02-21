import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz:");
        n = input.nextInt();

        System.out.println(" 4ün kuvvetleri:");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);

        }
        
        System.out.println(" 5in kuvvetleri:");

        for (int k = 1; k <= n; k *= 5) {
            System.out.println(k);
        }
    }
}