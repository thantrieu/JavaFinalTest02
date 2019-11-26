package dao;

import model.Borrowing;

import java.util.List;

public class BorrowingDAOImp implements DAO<Borrowing> {
    @Override
    public void add(Borrowing borrowing) {

    }

    @Override
    public boolean edit(Borrowing br) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return  false;
    }

    @Override
    public Borrowing findById(String id) {
        return null;
    }

    @Override
    public List<Borrowing> findByName(String name) {
        return null;
    }

    @Override
    public List<Borrowing> findByType(String type) {
        return null;
    }

    public List<Borrowing> sortByReaderName(){

        return null;
    }

    public List<Borrowing> sortByQuantity() {

        return null;
    }
}
