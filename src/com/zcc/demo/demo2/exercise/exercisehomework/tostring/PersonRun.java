package com.zcc.demo.demo2.exercise.exercisehomework.tostring;

public class PersonRun {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("11",11,"11");
        person[1] = new Person("12",12,"11");
        person[2] = new Person("12",13,"11");
            Person temp = null;
        for(int i = 0;i < person.length - 1;i++){
            for (int j = 0; j < person.length - i - 1; j++) {
                if(person[j].getAge() > person[j + 1].getAge()){
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
