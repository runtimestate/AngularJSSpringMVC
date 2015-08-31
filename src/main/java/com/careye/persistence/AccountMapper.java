package com.careye.persistence;

import com.careye.domain.Account;

import java.util.List;

public interface AccountMapper extends BaseMapper<Account, String> {

  List<Account> getByFirstName(String firstName);
}
