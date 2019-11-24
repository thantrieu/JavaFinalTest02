package controller;

public interface Ctr<T> {
    void show(T t);

    T addFromKeyBoard();
}
