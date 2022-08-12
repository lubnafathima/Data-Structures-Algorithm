//DISCLAIMER: if you get error remove the comments and run again
//Calculate Electricity Bill
// For loop is used here

//Then given integer is denoted as unit -> the amount of KWh units of electricity consumed,
// the task is to calculate the electricity bill with the given charges:
//
//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit

//Examples:
//
//Input: unit = 250
//Output: 3500
//Explanation:
//Charge for the first 100 units – 10*100 = 1000
//Charge for the 100 to 200 units – 15*100 = 1500
//Charge for the 200 to 250 units – 20*50 = 1000
//Total Electricity Bill = 1000 + 1500 + 1000 = 3500

//Input: unit = 95
//Output: 950
//Explanation:
//Charge for the first 100 units – 10*95 = 950
//Total Electricity Bill = 950

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Electricity consumed in KWh units: ");
        int n = in.nextInt();
        int charges = 10; //charge for 1st 100 unit
        int count = n/100; // 'count' is to determine the length of for loop
//        eg: n=250, then count=250/100=2.5, since we are taking int: count will be 2
        int sum=0; // initializing final answer
        int num; // initializing the temporary var, which will hold the answer for each loop
        if (count > 3) { // for more than 300 units of electricity, apply same calculation used for 300 units
            count = 3;
        }
        for (int i = 0; i < count ; i++) { //this loop as applicable of all units beyond 100units
            num = 100 * charges;
            sum = sum+num;
            charges += 5;
        }
        if (n < 100) { // for units lesser than 100
            sum = n * 10;
        } else { //if the units are between 100's eg: from 101-199 and so on...
            sum = sum + ((n - (count * 100)) * charges);
        }
        System.out.print("Total Electricity Bill is " + sum);
    }
}