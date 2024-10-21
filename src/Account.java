public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;
    public Account(int accountNumber, String name, String email, String phoneNumber, double balance) {
        this.balance= balance;
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void checkBalance(){
        double currentBalance = balance;
        System.out.println("current balance in my Account is : " + currentBalance);
    }
    public boolean isEmpty(){
        if (balance == 0)
            return true;
        else
            return false;
    }
    public  void depositFund(double depositAmount){
        balance += depositAmount;
        System.out.println("deposit of $" + depositAmount + " made. new balance is $" +
               this.balance);
    }
    public void withdrawalFund(double withdrawlAmount){
        if (balance - withdrawlAmount < 0 ){
            System.out.println("insufficient funds! you only have $" + balance + " in your acc");
        }else {
            balance -= withdrawlAmount;
            System.out.println("withdrawl of $" + withdrawlAmount + " proceed, remainig balance = $"
            + balance);
        }
    }
    public void transferMoney(String recepient,double amountToTransfer, String IBAN){
        if (isEmpty()) {
            System.out.println("balance is insufficient for a Transfer ! ");
        }else {
            System.out.println("the amount of Money you need to transfer : " + amountToTransfer);
            System.out.println("please enter the recipient :" + recepient);
            System.out.println("please enter the IBAN: " + IBAN);
            balance -= amountToTransfer;
            System.out.println("Transferred Amount : " + amountToTransfer +" current Balance : " + balance);
        }
    }



}
