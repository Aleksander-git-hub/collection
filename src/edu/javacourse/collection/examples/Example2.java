package edu.javacourse.collection.examples;

public class Example2<T>
{
    // не можем создать объекты данного класса
    private T instance;

    private Example2() {

    }

    public static <T> void simpleInit(T instantiator) {
        T obj;
    }

    public static <T> Example2<T> init(T instantiator) {
        return new Example2<T>();
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }
}
