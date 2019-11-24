package dao;

import model.Person;
import model.Reader;

import java.util.List;

public class ReaderDAOImp extends PersonDAOImp {
    @Override
    public void add(Person person) {
        super.add(person);
    }

    @Override
    public void edit(String id) {
        super.edit(id);
    }

    @Override
    public void remove(String id) {
        super.remove(id);
    }

    @Override
    public Person findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<Person> findByName(String name) {
        return super.findByName(name);
    }

    @Override
    public List<Person> findByType(String type) {
        return super.findByType(type);
    }

    public List<Reader> getAll() {
        return null;
    }
}
