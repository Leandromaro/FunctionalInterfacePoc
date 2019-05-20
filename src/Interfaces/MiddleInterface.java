package Interfaces;

@FunctionalInterface
public interface MiddleInterface<T>{
    boolean isBetween(T from, T to, T middleValue);
}
