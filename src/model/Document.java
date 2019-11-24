package model;

public class Document {
    private String id;
    private String title;
    private int publishedYear;
    private String Author;
    private int quantity;

    public Document() {
    }

    public Document(String id, String title, int publishedYear, String author, int quantity) {
        this.id = id;
        this.title = title;
        this.publishedYear = publishedYear;
        Author = author;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                ", Author='" + Author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
