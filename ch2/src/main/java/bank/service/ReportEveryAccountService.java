package bank.service;

import bank.model.Account;
import bank.model.AccountDAO;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;
//@Setter
@Component("every")
@NoArgsConstructor
public class ReportEveryAccountService {
    private AccountDAO dao;
    private ReportTool printer;

    @Autowired
    public void setDao(AccountDAO dao) {
        this.dao = dao;
    }

    @Autowired
    public void setPrinter(
            @Qualifier("summary") ReportTool printer) {
        this.printer = printer;
    }

    public void printAccountList() {
        Collection<Account> accounts = dao.selectAll();
        for (Account account : accounts) {
            printer.print(account);
        }
    }
}
