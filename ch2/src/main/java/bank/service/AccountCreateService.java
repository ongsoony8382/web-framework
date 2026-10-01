package bank.service;

import bank.model.AccountDAO;
import bank.model.CreateReq;

public class AccountCreateService {
    private final AccountDAO dao;

    public AccountCreateService(AccountDAO dao) {
        this.dao = dao;
    }

    public boolean create(CreateReq req){
        String owner = req.getOwner();
        if(dao.selectByOwner(owner) != null)
            return false;
        dao.insert(req);
        return true;
    }
}
