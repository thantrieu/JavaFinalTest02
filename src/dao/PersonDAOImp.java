package dao;

import model.Person;

import java.util.List;

public class PersonDAOImp implements DAO<Person> {
    @Override
    public void add(Person person) {

    }

    @Override
    public boolean edit(Person p) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public Person findById(String id) {
        return null;
    }

    @Override
    public List<Person> findByName(String name) {
        return null;
    }

    @Override
    public List<Person> findByType(String type) {
        return null;
    }
}
