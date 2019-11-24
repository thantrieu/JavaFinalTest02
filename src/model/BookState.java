package model;

public class BookState {
    private Book book;
    private Borrowing borrowing;
    private String state;
    private int quantity;

    public BookState() {
    }

    public BookState(Book book, Borrowing borrowing, String state, int quantity) {
        this.book = book;
        this.borrowing = borrowing;
        this.state = state;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrowing getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(Borrowing borrowing) {
        this.borrowing = borrowing;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookState{" +
                "book=" + book +
                ", borrowing=" + borrowing +
                ", state='" + state + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
