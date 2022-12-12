import javax.print.DocFlavor;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat currency=NumberFormat.getCurrencyInstance();

//        Item apple = new Item("apple", 01,10,25);
//        Item orange = new Item("orange", 02,15,20);
//        Item banana = new Item("banana", 03,25,30);
//        Item mango = new Item("mango",04,5,35);
////        System.out.println(apple.name);

//        Item [] items = {apple, orange, banana, mango};

//        System.out.println(Arrays.toString(items));
        String [] fruits = { "Bananas", "apple", "Oranges", "mango"};
        int[] prices={5, 10, 15, 20};
        int [] quantity={10, 20, 30, 20};

        while (Arrays.stream(quantity).max().getAsInt()!=0) {
            System.out.println("our items: " + Arrays.toString(fruits));
            System.out.println("prices: " + Arrays.toString(prices));
            System.out.println("quantity: " + Arrays.toString(quantity));
            System.out.println("how many items do you need sir");
            while(true) {
                int order = sc.nextInt();
                order--;
                int q = sc.nextInt();

                while (q > quantity[order]) {
                    System.out.println("please enter a valid quantity");
                    q = sc.nextInt();
                }
                System.out.println("total price=" + prices[order] * q);

                quantity[order] -= q;
                System.out.println("anything else sir?");
                String userResponse=  sc.next();
                System.out.println(userResponse);
                if (userResponse=="yes"){
                    continue;
                }
                else {
                    System.out.println("Next customer please");
                    break;
                }
            }

        }
        System.out.println("sorry we closed");

    }
}


