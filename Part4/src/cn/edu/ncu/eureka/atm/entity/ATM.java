package cn.edu.ncu.eureka.atm.entity;

public class ATM {
    private Account[] accounts;

    public ATM() {
        this.accounts = new Account[100];
    }

    public void initData() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(String.format("No_%d", (i + 1)), "张三", "123456", 1000);
        }
    }

    public void deposit(Account account, double money) {
        if (money <= 0)
            return;
        account.setMoney(account.getMoney() + money);
    }

    public void withdraw(Account account, double money) {
        if (money <= 0 || !isEnough(account, money))
            return;
        account.setMoney(account.getMoney() - money);
    }

    private boolean isEnough(Account account, double money) {
        return account.getMoney() >= money;
    }

    public void transfer(Account account1, Account account2, double money) {
        if (money <= 0 || !isEnough(account1, money))
            return;
        account1.setMoney(account1.getMoney()-money);
        account2.setMoney(account2.getMoney()+money);
    }
}
