import java.util.*;

class Convert {
    String[] units = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
            "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
    String[] tens = {"","", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

    Convert(int num) {
        
         if (num < 1 || num > 999) {
            System.out.println("Out Of Range.");
            num %= 1000;

            // num = num % 1000;
        }

        if (num >= 100) {
            System.out.print(units[num / 100] + " HUNDRED ");
            num %= 100;
        }

        if (num >= 20) {
            System.out.print(tens[num / 10] + " ");
            num %= 10;
        }

        if (num > 0) {
            System.out.print(units[num]);
        }
    }
}

class NumberToWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a natural number less than 1000: ");
            int num = scanner.nextInt();
        new Convert(num);
            System.out.println();
        }
    }
}
