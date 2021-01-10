package consumer;

import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i:list) {
            c.accept(i);
        }
    }
}
