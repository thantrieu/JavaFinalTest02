package dao;

import model.Book;
import model.Document;

import java.sql.Connection;
import java.util.List;

public class BookDAOImp extends DocumentDAOImp {
    private boolean checkId(String id, Connection conn) {
        var sql = "SELECT * FROM dbo.Book WHERE ID = ?";
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
    public void add(Document doc) {
        super.add(doc);
        var sql = "INSERT INTO dbo.Book(ID, DocumentID, Type) VALUES (?, ?, ?)";
        var conn = DBConnection.getInstance().getConnection();
        var d = (Book)doc;
        if(checkId(d.getId(), conn)) {
            try {
                var prepare = conn.prepareStatement(sql);
                prepare.setString(1, d.getId());
                prepare.setString(2, doc.getId());
                prepare.setString(3, d.getType());
                prepare.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Book's ID already exist!");
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
