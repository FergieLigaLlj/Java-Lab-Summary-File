import java.io.*;
class Account{
    public String accountNum;
    public double balance;
    public Account(String accNum,double initialBal){
        accountNum=accNum;
        balance = initialBal;
    }
    public Account(String accNum){
        this(accNum,0.0);
    }
    public String getAccountNum(){return accountNum;}
    public double getBalance(){return balance;}
    public double deposit(double money){
        balance = balance + money;
        return balance;
    }
    public double withdraw(double money){
        balance = balance - money;
        return balance;
    }
}
class AccountDemo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        double balance;
        String input1 = null;
        String input2 = null;
        String input3 = null;
        String input4 = null;
        System.out.println("input your account number");
        input1=br.readLine();
        System.out.println("input your initial balance");
        input2=br.readLine();
        double n = Integer.parseInt(input2);
        Account[] wallet = new Account[1];
        wallet[0]=new Account(input1,n);
        str = wallet[0].getAccountNum();
        wallet[0].getBalance();
        System.out.println("input your deposit money:");
        input3=br.readLine();
        System.out.println("input your withdraw money:");
        input4=br.readLine();
        double m = Integer.parseInt(input3);
        double z = Integer.parseInt(input4);
        wallet[0].deposit(m);
        wallet[0].withdraw(z);
        balance = wallet[0].getBalance();
        System.out.println("Account number="+str);
        System.out.println("Final Balance="+balance);  
    }
}