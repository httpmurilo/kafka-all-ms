package io.httpmurilo.database.service.generic;

import java.util.List;

public interface GenericDefaultService<T, ID> {

    T findById(ID id);
    List<T> findAll();
    T save(T entity);
    void deleteById(ID id);
}
