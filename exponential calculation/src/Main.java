import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,exponent,total=1;
        System.out.print("n: ");
        number = scanner.nextInt();
        System.out.print("exponent: ");
        exponent = scanner.nextInt();

        if(exponent >= 0) {
            for (int i = 1; i <= exponent; i++) {
                total *= number;
            }
            System.out.println(number + " ^ " + exponent + " = " + total);
        }
        else{
            for(int i= 1; i<=-(exponent); i++) {
                total *= number;
            }
            System.out.println(number + " ^ " + exponent + " = "+ "1/" +total);
        }
    }
}
