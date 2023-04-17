import java.util.Scanner;

public class customer {
    Scanner input = new Scanner(System.in);


    public void menu(){



        String[] s = new String[] { "idly Sambar", "Wada Samber", "dosa   ", "Poori Bhaji", "Paratha",
                "Vada Pao", "Misal   ", "tea   ", "coffee"};
        int[] rate = new int[] { 30, 35, 40, 30, 25, 15, 100, 10, 15};
        int[] qt = new int[9];
        boolean quit = true;
        int sum = 0;


        do {
            System.out.println("ITEM" + "\t\t\tPRICE");
            for (int i = 0; i < 9; i++)
                System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);

            quit = order(qt,s);

        } while (quit);

        generateBill(s,qt,rate,sum);

    }

    public boolean order(int[]qt, String[]s) {

        System.out.println("Entre item number: ");
        int ch = input.nextInt();
        if (ch > 0 && ch <= 9) {
            System.out.println("enter the no of quantites of " + s[ch - 1]);
            int q = input.nextInt();
            qt[ch - 1] += q;
            return true;

        } else {
            return false;
        }

    }

    public void generateBill(String[]s,int[]qt,int[]rate,int sum)
    {
        System.out.println("Your Orders are:\n");
        for (int i = 0; i < 9; i++) {
            if (qt[i] != 0) {
                sum += qt[i] * rate[i];
                System.out.println(s[i] + " * " + qt[i] + " = " + qt[i] * rate[i] + " Rs");
            }
        }

        System.out.println("Your total bill = " + sum + " Rs");

        System.out.println("Thank you !! ");
    }
}



