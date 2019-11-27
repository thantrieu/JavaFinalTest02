package dao;

import model.Document;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentDAOImp implements DAO<Document> {
    public boolean isIdValid(String id, String tableName) {
        var sql = "SELECT ID FROM " + tableName + " WHERE ID = ?";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeQuery();
            if(result.next()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void add(Document document) {
        var conn = DBConnection.getInstance().getConnection();
        var sql = "INSERT INTO dbo.Document(ID, Title, PublishedYear, Quantity, Author)"
                + " VALUES(?, ?, ?, ?, ?);";
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, document.getId());
            prepare.setString(2, document.getTitle());
            prepare.setInt(3, document.getPublishedYear());
            prepare.setInt(4, document.getQuantity());
            prepare.setString(5, document.getAuthor());
            prepare.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean edit(Document document) {
        var sql = "UPDATE dbo.Document SET Title = ? WHERE ID = ?";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, document.getTitle());
            prepare.setString(2, document.getId());
            var result = prepare.executeUpdate();
            if(result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String id) {
        var sql = "DELETE FROM dbo.Document WHERE ID = ?";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, id);
            var result = prepare.executeUpdate();
            if(result > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Document findById(String id) {
        return null;
    }

    @Override
    public List<Document> findByName(String name) {
        var docs = new ArrayList<Document>();
        var sql = "SELECT * FROM dbo.Document WHERE Title LIKE ?";
        var conn = DBConnection.getInstance().getConnection();
        try {
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1, "%" + name + "%");
            var result = prepare.executeQuery();
            while(result.next()) {
                var id = result.getString("ID");
                var title = result.getString("Title");
                var year = result.getInt("PublishedYear");
                var quan = result.getInt("Quantity");
                var author = result.getString("Author");
                var doc = new Document(id, title, year, author, quan);
                docs.add(doc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docs;
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
