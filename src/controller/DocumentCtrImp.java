package controller;

import model.Document;

public class DocumentCtrImp implements Ctr<Document> {
    @Override
    public void show(Document document) {
        System.out.println(document);
    }

    @Override
    public Document addFromKeyBoard() {
        return null;
    }
}
