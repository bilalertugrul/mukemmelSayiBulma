import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    /*
    Bir sayının kendisi hariç pozitif tam sayı çarpanları
    (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
     */
        int number, sum=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir Sayı Giriniz : ");
            number = input.nextInt();

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " Mükemmel bir sayıdır.");
            } else {
                System.out.println(number + " Mükemmel bir sayı değildir.");
            }
        }while(number>0);

    }
}