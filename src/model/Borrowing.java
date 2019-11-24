package model;

import java.util.List;

public class Borrowing {
    private String  brwId;
    private Employee employee;
    private Reader reader;
    private List<BookState> states;

    public Borrowing() {
    }

    public Borrowing(String brwId, Employee employee, Reader reader,
                     List<BookState> states) {
        this.brwId = brwId;
        this.employee = employee;
        this.reader = reader;
        this.states = states;
    }

    public String getBrwId() {
        return brwId;
    }

    public void setBrwId(String brwId) {
        this.brwId = brwId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<BookState> getStates() {
        return states;
    }

    public void setStates(List<BookState> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "brwId='" + brwId + '\'' +
                ", employee=" + employee +
                ", reader=" + reader +
                ", states=" + states +
                '}';
    }
}
