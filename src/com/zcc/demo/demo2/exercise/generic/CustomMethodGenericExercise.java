package com.zcc.demo.demo2.exercise.generic;

/**
 * @author Dr.Z
 * @version demo
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> stringIntegerDoubleApple = new Apple<>();
        stringIntegerDoubleApple.fly(10);
        stringIntegerDoubleApple.fly(new Dog());
        //新的
        Apple<Dog, Integer, Dog> dogIntegerDogApple = new Apple<>();
        dogIntegerDogApple.run(new Cat());
    }
}
class Apple<T,R,M>{
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }
    public <U>void eat(U u){}
    public void run(M m){}
}
class Dog{}
class Cat extends Dog{}