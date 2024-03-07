package ch13.quiz1;

public class Container<T> {

    private T name;

    public T get() {
        return name;
    }

    public void set(T name) {
        this.name = name;
    }
}
