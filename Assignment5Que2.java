import java.util.*;

class Customer {
    String name, address, acc_no;
    int age;

    public Customer(String name, String address, String acc_no, int age) {
        this.name = name;
        this.address = address;
        this.acc_no = acc_no;
        this.age = age;
    }
}

class Account {
    String acc_type, branch;

    public Account(String acc_type, String branch) {
        this.acc_type = acc_type;
        this.branch = branch;
    }
}

class RBI { // Base class
    int min_bal, max_withdraw;
    double min_r;

    public RBI() {
        min_bal = 1000;
        max_withdraw = 1000000;
        min_r = 4.0;
    }

    public void set_minRate(double min_r) {
        if (min_r >= this.min_r) {
            this.min_r = min_r;
        } else {
            System.out.println("Minimum rate should be: " + this.min_r + " as per RBI guidelines");
        }
    }

    public void set_minBal(int min_bal) {
        if (min_bal >= this.min_bal) {
            this.min_bal = min_bal;
        } else {
            System.out.println("Minimum balance amount should be atleast " + this.min_bal + " as per RBI guidelines");
        }
    }

    public void set_max_wl(int max_withdraw) {
        if (max_withdraw > this.max_withdraw) {
            this.max_withdraw = max_withdraw;
        } else {
            System.out.println(
                    "Maximum withdrawal limit should be atleast " + this.max_withdraw + " as per RBI guidelines");
        }
    }

    public void printInfo() {
        System.out.println("\nUpdated Minimum Balance: " + min_bal);
        System.out.println("Updated Minimum Interest Rate: " + min_r);
        System.out.println("Updated Maximum Withraw Limit: " + min_bal);
    }
}

class SBI extends RBI { // Child class1
    public SBI(int min_bal, int max_withdraw, double min_r) {
        set_minRate(min_r);
        set_minBal(min_bal);
        set_max_wl(max_withdraw);
    }

    public void printInfo() {
        System.out.println("\nFinal Minimum Balance: " + min_bal);
        System.out.println("Final Minimum Interest Rate: " + min_r);
        System.out.println("Final Maximum Withraw Limit: " + min_bal);
    }
}

class ICICI extends RBI { // Child class2
    public ICICI(int min_bal, int max_withdraw, double min_r) {
        set_minRate(min_r);
        set_minBal(min_bal);
        set_max_wl(max_withdraw);
    }

    public void printInfo() {
        System.out.println("\nFinal Minimum Balance: " + min_bal);
        System.out.println("Final Minimum Interest Rate: " + min_r);
        System.out.println("Final Maximum Withraw Limit: " + min_bal);
    }
}

class PNB extends RBI { // Child class2
    public PNB(int min_bal, int max_withdraw, double min_r) {
        set_minRate(min_r);
        set_minBal(min_bal);
        set_max_wl(max_withdraw);
    }

    public void printInfo() {
        System.out.println("\nFinal Minimum Balance: " + min_bal);
        System.out.println("Final Minimum Interest Rate: " + min_r);
        System.out.println("Final Maximum Withraw Limit: " + min_bal);
    }
}

public class Assignment5Que2 { // Tester code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your choice to update the details");
        System.out.println("1: SBI\n2: ICICI\n3: PNB");
        x = sc.nextInt();

        System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");
        int a, b;
        double c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        RBI bank;
        sc.close();
        switch (x) {
            case 1:
                bank = new SBI(a, b, c);
                bank.printInfo();
                break;
            case 2:
                bank = new ICICI(a, b, c);
                bank.printInfo();
                break;
            case 3:
                bank = new PNB(a, b, c);
                bank.printInfo();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
