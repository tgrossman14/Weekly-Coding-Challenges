public class CreditCardValidator {

    static boolean cardValidator(String cardNo)
    {
        int digits = cardNo.length();
        if (digits < 14 | digits > 19){
            return false;
        }
        int nSum = 0;
        boolean isSecond = false;
        for (int i = digits - 1; i >= 0; i--)
        {
            int d = cardNo.charAt(i) - '0';
            if (isSecond) {
                d = d * 2;
            }
            nSum += d / 10;
            nSum += d % 10;
            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }
}
