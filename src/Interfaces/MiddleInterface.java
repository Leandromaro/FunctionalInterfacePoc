package Interfaces;

@FunctionalInterface
public interface MiddleInterface<F,T,V>{
    boolean isBetween(F from, T to, V middleValue);
}
