import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cardNo = sc.nextLine();
        System.out.println(CreditCardValidator.cardValidator(cardNo));
    }
}
