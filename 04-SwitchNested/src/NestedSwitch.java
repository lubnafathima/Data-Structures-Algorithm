import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();

        switch (empID) {
            case 1 -> System.out.println("Lubna");
            case 2 -> {
                String department = in.next();
                System.out.println("Emp 2");
                switch (department) {
                    case "IT" -> System.out.println("IT Dept");
                    case "CSE" -> System.out.println("CSE Dept");
                    default -> System.out.println("Enter valid Dept");
                }
            }
            default -> System.out.println("Enter correct Emp ID");
        }
    }
}
