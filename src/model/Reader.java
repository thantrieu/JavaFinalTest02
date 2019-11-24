package model;

public class Reader extends Person {
    private String readerId;
    private String kindOfReader;
    private String phoneNumber;
    private String email;

    public Reader() {
    }

    public Reader(String readerId, String kindOfReader, String phoneNumber, String email) {
        this.readerId = readerId;
        this.kindOfReader = kindOfReader;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getKindOfReader() {
        return kindOfReader;
    }

    public void setKindOfReader(String kindOfReader) {
        this.kindOfReader = kindOfReader;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + "Reader{" +
                "readerId='" + readerId + '\'' +
                ", kindOfReader='" + kindOfReader + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
