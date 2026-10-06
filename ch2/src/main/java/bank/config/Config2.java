package bank.config;

import bank.model.AccountDAO;
import bank.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bank")
public class Config2 {
//    @Bean
//    public AccountDAO accountDAO() {
//        return new AccountDAO();
//    }
//
//    @Bean("cservice")
//    public AccountCreateService accountCreateService() {
//        return new AccountCreateService(accountDAO());
//    }
//
//    @Bean("tservice")
//    public TransactionService transactionService() {
//        return new TransactionService(accountDAO());
//    }
//
//    @Bean("basic")
//    public BasicReport basicReport() {
//        return new BasicReport();
//    }
//
//    @Bean("one")
//    public ReportOneAccountService oneAccountService() {
//        ReportOneAccountService service = new ReportOneAccountService();
////        service.setDao(accountDAO());
////        service.setPrinter(basicReport());
//        return service;
//    }
//
//    @Bean("every")
//    public ReportEveryAccountService everyAccountService() {
//        ReportEveryAccountService service = new ReportEveryAccountService();
////        service.setDao(accountDAO());
////        service.setPrinter(basicReport());
//        return service;
//    }
//
//    @Bean("summary")
//    public SummaryReport summaryReport() { return new SummaryReport(); }
}
