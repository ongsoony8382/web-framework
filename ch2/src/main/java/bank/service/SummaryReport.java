package bank.service;

import bank.model.Account;
import org.springframework.stereotype.Component;

@Component("summary")
public class SummaryReport implements ReportTool {

    public void print(Account account){
        System.out.printf("aid: %d, balance: %d%n"
                , account.getAid(), account.getBalance());
    }
}
