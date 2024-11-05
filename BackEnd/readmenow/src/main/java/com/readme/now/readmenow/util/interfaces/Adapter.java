package com.readme.now.readmenow.util.interfaces;

import org.springframework.data.domain.Page;

public interface Adapter<T> {
    Page<T> findAll(Integer pageNumber, Integer pageSize, Boolean active);
    T findById(Integer id);
    T create(T entity);
    T update(T entity);
    Boolean existById(Integer id);
    void deleteById(Integer id);
    Long count();
}
