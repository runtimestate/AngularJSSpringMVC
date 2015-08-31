package com.careye.persistence;

import java.util.List;

public interface BaseMapper<T, PK> {

  T getById(PK id);

  List<T> getAll();

  void insert(T t);

  void update(T t);

}
