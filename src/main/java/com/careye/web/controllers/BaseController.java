package com.careye.web.controllers;

import com.careye.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/base")
public class BaseController<T, PK> {

  @Autowired
  private BaseService<T, PK> baseService;

  @RequestMapping(value = "/entity", method = RequestMethod.GET)
  public @ResponseBody List<T> getAll(HttpServletRequest request, HttpServletResponse response) {
    return baseService.getAll();
  }

  @RequestMapping(value = "/entity/{id}", method = RequestMethod.GET)
  public @ResponseBody T getById(HttpServletRequest request, HttpServletResponse response, @PathVariable PK id) {
    return baseService.getById(id);
  }
}
