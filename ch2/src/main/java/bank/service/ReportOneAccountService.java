package bank.service;

import bank.model.Account;
import bank.model.AccountDAO;
import lombok.Setter;

@Setter
public class ReportOneAccountService {
    private AccountDAO dao;
    private ReportTool printer;

    public void printAccountInfo(String owner) {
        Account account = dao.selectByOwner(owner);
        if (account == null)
            System.out.println("계좌가 없는 고객입니다.");
        else{
            printer.print(account);
        }
    }
}
