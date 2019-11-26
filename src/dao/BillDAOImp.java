package dao;

import model.Bill;
import model.Borrowing;

import java.util.List;

public class BillDAOImp implements DAO<Bill> {
    @Override
    public void add(Bill bill) {

    }

    @Override
    public boolean edit(Bill b) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public Bill findById(String id) {
        return null;
    }

    @Override
    public List<Bill> findByName(String name) {
        return null;
    }

    @Override
    public List<Bill> findByType(String type) {
        return null;
    }

    public List<Bill> getAll() {
        return null;
    }

    public List<Bill> getDocumentBorrowing(String moreOrLess) {
        return null;
    }

    public List<Bill> getReaderBorrowing(String moreOrLess) {
        return null;
    }
}
