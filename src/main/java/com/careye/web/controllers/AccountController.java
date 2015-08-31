package com.careye.web.controllers;

import com.careye.domain.Account;
import com.careye.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController extends BaseController<Account, String> {

  @Autowired
  private AccountService accountService;

  @RequestMapping(value = "/user/{firstName}", method = RequestMethod.GET)
  public @ResponseBody List<Account> getByFirstName(HttpServletRequest request, HttpServletResponse response, @PathVariable String firstName) {
    return accountService.getByFirstName(firstName);
  }
}
