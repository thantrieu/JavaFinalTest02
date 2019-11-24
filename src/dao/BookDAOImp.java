package dao;

import model.Book;
import model.Document;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookDAOImp extends DocumentDAOImp {

    @Override
    public void add(Document doc) {
        super.add(doc);
        var conn = DBConnection.getInstance().getConnection();
        var sql = "INSERT INTO dbo.Book(ID, DocumentID, Type) VALUES(?, ?, ?)";
        try {
            var book = (Book)doc;
            var prepare =conn.prepareStatement(sql);
            prepare.setString(1, book.getId());
            prepare.setString(2, doc.getId());
            prepare.setString(3, book.getType());
            prepare.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    public Document findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<Document> findByName(String name) {
        return super.findByName(name);
    }

    @Override
    public List<Document> findByType(String type) {
        return super.findByType(type);
    }

    @Override
    public List<Document> searchDocByYear(int year) {
        return super.searchDocByYear(year);
    }

    @Override
    public List<Document> searchDocByAuthor(String author) {
        return super.searchDocByAuthor(author);
    }

    @Override
    public List<Document> getAll() {
        return super.getAll();
    }
}
