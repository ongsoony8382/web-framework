package bank.model;

import java.util.Collection;
import java.util.HashMap;

public class AccountDAO {
    private final HashMap<String, Integer> ownerMap;
    private final HashMap<Integer, Account> accountMap;
    private int newAccountId;

    public AccountDAO(){
        this.ownerMap = new HashMap<>();
        this.accountMap = new HashMap<>();
    }

    public Account selectByAid(int aid){
        return accountMap.get(aid);
    }

    public Account selectByOwner(String owner){
        if(!ownerMap.containsKey(owner))
            return null;
        return accountMap.get(ownerMap.get(owner));
    }

    public Collection<Account> selectAll(){
        return accountMap.values();
    }

    public void insert(CreateReq req){
        Account account = new Account();
        account.setAid(++newAccountId);
        account.setName(req.getName());
        account.setBalance(req.getBalance());
        account.setOwner(req.getOwner());
        accountMap.put(account.getAid(), account);
        ownerMap.put(account.getOwner(), account.getAid());
    }

    public boolean update(Account account){
        if(!accountMap.containsKey(account.getAid()))
            return false;
        accountMap.put(account.getAid(), account);
        return true;
    }
}
