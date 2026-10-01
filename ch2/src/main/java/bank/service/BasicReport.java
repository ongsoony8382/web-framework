package bank.service;

import bank.model.Account;

public class BasicReport implements ReportTool {

    @Override
    public void print(Account account) {
        System.out.println(account);
    }
}
