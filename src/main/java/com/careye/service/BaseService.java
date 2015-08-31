package com.careye.service;

import com.careye.persistence.BaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public abstract class BaseService<T, PK> {

  protected BaseMapper baseMapper;

  public BaseService(BaseMapper baseMapper) {
    this.baseMapper = baseMapper;
  }

  public T getById(PK id) {
    return (T)baseMapper.getById(id);
  }

  public List<T> getAll() {
    return baseMapper.getAll();
  }

  @Transactional
  public void insert(T t) {
    baseMapper.insert(t);
  }

  @Transactional
  public void update(T t) {
    baseMapper.update(t);
  }

}
