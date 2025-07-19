// pakages in java
// access modifiers in java
/* private, default, protected, public */
// Encapsulation in Java
package banks;

@SuppressWarnings("unused")
class Account {
    public String name;
    protected String accountNumber;
    private String password;
    private double balance;
    
    //getters & setters
    public String getPassword() {
        return password;
    }
    public void  setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class bank1 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Tejas";
        account1.accountNumber = "123456789"; 
        account1.setPassword("tejas123");  
        account1.setBalance(1000.00);
        System.out.println("Account Name: " + account1.name);
        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Password: " + account1.getPassword());
        System.out.println("Balance: " + account1.getBalance());
    }
}
