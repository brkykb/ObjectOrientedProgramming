import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BankAccount a1=new BankAccount(2110206009,"Berkay",10001);
        BankAccount a2=new BankAccount(2110206010,"Ahmet",10002);
        BankAccount a3=new BankAccount(2110206011,"Mehmet",10003);
        BankAccount a4=new BankAccount(2110206012,"Ali",10004);

        ArrayList<BankAccount> myAccounts=new ArrayList<>();

        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Iterator<BankAccount> iterator= myAccounts.iterator();
        
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            System.out.println(account.toString());
        }
    }
}
