package bank.config;

import bank.model.AccountDAO;
import bank.service.AccountCreateService;
import bank.service.BasicReport;
import bank.service.ReportOneAccountService;
import bank.service.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    @Bean
    public AccountDAO accountDAO() {
        return new AccountDAO();
    }

    @Bean("cservice")
    public AccountCreateService accountCreateService() {
        return new AccountCreateService(accountDAO());
    }

    @Bean("tservice")
    public TransactionService transactionService() {
        return new TransactionService(accountDAO());
    }

    @Bean("basic")
    public BasicReport basicReport() {
        return new BasicReport();
    }

    @Bean("one")
    public ReportOneAccountService oneAccountService() {
        ReportOneAccountService service = new ReportOneAccountService();
//        service.setDao(accountDAO());
//        service.setPrinter(basicReport());
        return service;
    }
}
