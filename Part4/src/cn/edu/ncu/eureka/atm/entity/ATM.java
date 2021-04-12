package cn.edu.ncu.eureka.atm.entity;

public class ATM {
    private Account[] accounts;
    private static ATM instance = null;
    private Account currentAccount;

    /**
     * ATM对象具有唯一性
     *
     * @return 唯一的ATM对象
     */
    public static ATM getInstance() {
        if (instance == null)
            instance = new ATM();
        return instance;
    }

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
        account1.setMoney(account1.getMoney() - money);
        account2.setMoney(account2.getMoney() + money);
    }

    public boolean checkAccount(String id, String password) {
        for (Account account : accounts) {
            if (account.getId().equals(id) && account.getPassword().equals(password)) {
                this.currentAccount = account;
                return true;
            }
        }
        return false;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }
}
