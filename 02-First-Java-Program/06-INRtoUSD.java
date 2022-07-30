import java.util.Scanner;

public INRtoUSD {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        //-------------------------------
        System.out.print("Enter Currency in Rupees: ");
        Scanner rupeesIp = new Scanner(System.in);
        int rupees = rupeesIp.nextInt();
        float usd = (float) (rupees/45.2);
        System.out.print(rupees + " Rupees will be " + usd + " USD");
        //actual USD is in double, but I thought float would be appropriate
    }
}