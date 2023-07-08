package io.httpmurilo.database.service.generic;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericDefaultServiceImpl<T, ID> implements GenericDefaultService<T, ID> {

    protected JpaRepository<T, ID> repository;

    public GenericDefaultServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

}
