package model;

public class Employee extends Person {
    private String emId;
    private String role;
    private String shift;

    public Employee() {
    }

    public Employee(String emId, String role, String shift) {
        this.emId = emId;
        this.role = role;
        this.shift = shift;
    }

    public String getEmId() {
        return emId;
    }

    public void setEmId(String emId) {
        this.emId = emId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "emId='" + emId + '\'' +
                ", role='" + role + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
