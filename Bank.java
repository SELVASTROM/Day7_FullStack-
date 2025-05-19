import java.util.*;
class Account{
    long accno;
    String accholdername;
    double balance;
    double add;
    double withdraw;
    // Account(){
    //     this.accno = 1234567890;
    //     this.accholdername = "selva";
    //     this.balance = 1000;
    // }
    Account(long accno,String accholdername,double balance,double add,double withdraw){
        this.accno=accno;
        this.accholdername=accholdername;
        this.balance=balance;
        this.add=add;
        this.withdraw=withdraw;
    }
    void deposit(){
        System.out.println("you accocunt name "+accno+"\n the bank account holder name is "+accholdername+"\nyour balance "+(add+balance));
    }
     void withdraw() {

      if(withdraw>balance){
            System.out.println("INSUFFICIENT FUNDS");
        }else{
            System.out.println("YOUR AMOUNT IS WITHDRAWED SUCESSFULLY"+"\nYOUR CURRENT BALANCE IS"+((add+balance)-withdraw));
        }

    }
}
class Bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Account a=new Account();
        // a.deposit();
        System.out.println("Enter the acc no");
        long accno=s.nextLong();s.nextLine();
        System.out.println("Enter the account name");
        String accholdername=s.nextLine();
        System.out.println("Enter the balance");
        double balance=s.nextDouble();
        System.out.println("Enter the amount  you have to add");
        double add=s.nextDouble();
        System.out.println("Enter the withdraw amount");
        double withdraw=s.nextDouble();
        Account b=new Account(accno,accholdername,balance,add,withdraw);
        b.deposit();
        b.withdraw();
        s.close();

    }
    
}
