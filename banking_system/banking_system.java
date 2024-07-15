package banking_system;

import java.util.Scanner;

class BankDetails{
    private String Account_No;
    private String Name ;
    private String Account_type;
    private long Balance;
    Scanner sc = new Scanner(System.in);

    //Method to open Account
    public void OpenAccount(){
        System.out.print("Enter Account no : ");
        Account_No = sc.next();

        System.out.print("Enter Account Type : ");
        Account_type = sc.next();

        System.out.print("Enter Holder Name : ");
        Name = sc.next();

        System.out.print("Enter Balance : ");
        Balance = sc.nextLong();
    }// method open Account end here

    // Method to display Account Details
    public void ShowAccount(){
        System.out.println("Name of Account Holder : " + Name);
        System.out.println("Account No : " + Account_No);
        System.out.println("Account Type : " + Account_type);
        System.out.println("Account Balance : " + Balance);
    }// Method to display Account Details end here

    //method to deposit Amount
    public void deposit(){
        long amount;
        System.out.println("Enter Amount you want to deposit");
        amount = sc.nextLong();
        Balance = Balance + amount;
    } //method end here

    //Method to withdrawal money
    public void withdrawal(){
        long amount;
        System.out.println("Enter the amount you want to Withdrawal : ");
        amount = sc.nextLong();

        //using to checking balance greater than or less than
        if (Balance >= amount){
            Balance = Balance - amount;
            System.out.println("Balance after withdrawal : " +Balance);
        }
        else {
            System.out.println("Insufficient Balance " +amount+ "\tTransaction failed!!");
        }
    } // withdrawal method end here
    //method to search account
    public boolean search(String account_no){
        if (Account_No.equals(account_no)){
            ShowAccount();
            return (true);
        }
        else {
            return (false);
        }
    } // search method end here

} //class end here
public class banking_system {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Number of Customer do you want to Input ? ");
        int no = sc.nextInt();
        BankDetails[] C = new BankDetails[no];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].OpenAccount();
        }
        //loop run until 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\nBanking System Application");
            System.out.println("1.Display All Account Details\n2. Search by Account No \n3.Deposit The Amount\n 4.Withdrawal the Amount \n 5.Exit");
            System.out.println("Enter Your Choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].ShowAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account No you want to search");
                    String ac_no = sc.next();
                    boolean found = true;
                    for (int i = 0; i < C.length ; i++) {
                        found = C[i].search(ac_no);
                        if (found){
                            break;
                        }
                        if (!found) {
                            System.out.println("Search failed ! Account Doesn't Exist");
                        }
                        break;
                    }
                case 3:
                    System.out.println("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i <C.length ; i++) {
                        found = C[i].search(ac_no);

                        if (found){
                            C[i].deposit();
                            break;
                        }

                    }
                    if (!found){
                        System.out.println("Search failed! Account doesn't Exist");
                    }
                    break;
                case 4:{
                    System.out.println("Enter Account no : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;

                        }

                    }
                    if(!found){
                        System.out.println("Search failed! Account doesn't Exist");
                    }
                }
                case 5:{
                    System.out.println("See You soon");
                }
            }

        }
        while (ch!= 5);

    }
}

