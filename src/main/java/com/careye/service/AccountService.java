package com.careye.service;

import com.careye.domain.Account;
import com.careye.persistence.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends BaseService<Account, String> {

  @Autowired
  public AccountService(AccountMapper accountMapper) {
    super(accountMapper);
  }

  @Autowired
  private AccountMapper accountMapper;

  public List<Account> getByFirstName(String firstName) {
    return accountMapper.getByFirstName(firstName);
  }
}
