package view;

import java.util.List;

public class View {
    public <T> void show(List<T> list) {
        for (T t: list) {
            System.out.println(t);
        }
    }
}
