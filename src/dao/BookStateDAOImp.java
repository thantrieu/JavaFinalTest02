package dao;

import model.BookState;

import java.util.List;

public class BookStateDAOImp implements DAO<BookState> {
    @Override
    public void add(BookState bookState) {

    }

    @Override
    public boolean edit(BookState bs) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public BookState findById(String id) {
        return null;
    }

    @Override
    public List<BookState> findByName(String name) {
        return null;
    }

    @Override
    public List<BookState> findByType(String type) {
        return null;
    }

    public List<BookState> getAll() {
        return null;
    }
}
