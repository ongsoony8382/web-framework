package bank.service;

import bank.exception.AccountNotFoundException;
import bank.model.Account;
import bank.model.AccountDAO;

public class TransactionService {
    private final AccountDAO dao;
    public TransactionService(AccountDAO dao) {
        this.dao = dao;
    }

    public int deposit(int aid, int amount) {
        Account account = dao.selectByAid(aid);
        if (account == null)
            throw new AccountNotFoundException();
        account.setBalance(account.getBalance() + amount);
        dao.update(account);
        return account.getBalance();
    }
}
