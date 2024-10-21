public class Main {
    public static void main(String[] args) {

        Account account = new Account(23071,"bob Brown", "boBrown@yahoo.com", "01677-8738", 500.0);

         account.checkBalance();
         account.withdrawalFund(100.0);
         account.depositFund(250);
         account.withdrawalFund(50);
         account.transferMoney("michael deSantos", 50.0,"SE542uui" );
    }




}

