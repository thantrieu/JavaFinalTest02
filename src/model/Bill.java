package model;

import java.util.Date;

public class Bill {
    private String id;
    private Bill bill;
    private int total;
    private Date startDate;
    private Date dueDate;
    private float deposit;
    private Borrowing borrowing;

    public Bill() {
    }

    public Bill(String id, Bill bill, int total, Date startDate,
                Date dueDate, float deposit, Borrowing borrowing) {
        this.id = id;
        this.bill = bill;
        this.total = total;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.deposit = deposit;
        this.borrowing = borrowing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public Borrowing getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(Borrowing borrowing) {
        this.borrowing = borrowing;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", bill=" + bill +
                ", total=" + total +
                ", startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", deposit=" + deposit +
                ", borrowing=" + borrowing +
                '}';
    }
}
