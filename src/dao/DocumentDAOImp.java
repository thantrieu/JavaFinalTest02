package dao;

import model.Document;

import java.sql.Connection;
import java.util.List;

public class DocumentDAOImp implements DAO<Document> {
    private boolean checkId(String id, Connection conn) {
        var sql = "SELECT * FROM Document WHERE ID = ?";
        try{
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeQuery();
            if(result.next()) {
                return false;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void add(Document document) {
        var sql = "INSERT INTO dbo.Document(ID, Title, PublishedYear, " +
                "Quantity, Author) VALUES (?, ?, ?, ?, ?)";
        var conn = DBConnection.getInstance().getConnection();
        if(checkId(document.getId(), conn)) { // this.checkId(document.getId(), conn)
            try {
                var prepare = conn.prepareStatement(sql);
                prepare.setString(1, document.getId());
                prepare.setString(2, document.getTitle());
                prepare.setInt(3, document.getPublishedYear());
                prepare.setInt(4, document.getQuantity());
                prepare.setString(5, document.getAuthor());
                prepare.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("This ID Already exist!");
        }
    }

    @Override
    public void edit(String id) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Document findById(String id) {
        return null;
    }

    @Override
    public List<Document> findByName(String name) {
        return null;
    }

    @Override
    public List<Document> findByType(String type) {
        return null;
    }

    public List<Document> searchDocByYear(int year) {
        return null;
    }

    public List<Document> searchDocByAuthor(String author) {
        return null;
    }

    public List<Document> getAll() {
        return null;
    }
}
