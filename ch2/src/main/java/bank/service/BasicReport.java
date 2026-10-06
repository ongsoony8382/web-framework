package bank.service;

import bank.model.Account;
import org.springframework.stereotype.Component;

@Component("basic")
public class BasicReport implements ReportTool {

    @Override
    public void print(Account account) {
        System.out.println(account);
    }
}
