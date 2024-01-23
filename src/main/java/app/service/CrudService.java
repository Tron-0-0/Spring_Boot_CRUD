package app.service;

import java.util.List;

public interface CrudService <T, ID> {

    List<T> getAll();

    T findById(ID id);

    void save(T entity);

    void update(T enityt);

    void delete(ID id);

}
