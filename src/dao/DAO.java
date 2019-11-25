package dao;

import java.util.List;

public interface DAO<T> {
    void add(T t);

    void edit(String id);

    boolean remove(String id);

    T findById(String id);

    List<T> findByName(String name);

    List<T> findByType(String type);
}
