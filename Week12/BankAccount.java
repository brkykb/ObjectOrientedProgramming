public class BankAccount {

    public int no;
    public String name;
    public double balance;


    public BankAccount(int no,String name,double balance){
        this.no=no;
        this.name=name;
        this.balance=balance;
    }

    public void setAccountNo(int no){
        this.no=no;
    };

    public void setHolderName(String name){
        this.name=name;
    };

    public void setBalance(double balance){
        this.balance=balance;
    };


    public void balanceChange(double amount){
        balance-=amount;
    };


    @Override
    public String toString() {
        return "Account No:"+no+" Holder Name:"+name+" Balance:"+balance;
    }
}
