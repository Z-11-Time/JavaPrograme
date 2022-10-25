package com.zcc.demo.demo2.exercise.exercisehomework.homework13;

public class HomeWork13 {
    public static void main(String[] args) {
        HomeWork13 homeWork13 = new HomeWork13();
        Person[] p = new Person[4];
        p[0] = new Student("Jack",'N',12,201334);
        p[1] = new Student("Rose",'v',11,201333);
        p[2] = new Teacher("Bob",'n',31,13);
        p[3] = new Teacher("Rand",'v',32,13);
        Person temp = null;
        for(int i = 0;i < p.length - 1;i++){
            for(int j = 0;j < p.length - i - 1;j++){
                if(p[j].getAge() > p[j + 1].getAge()){
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1]= temp;
                }
            }
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
            homeWork13.test(p[i]);
            p[i].play();
        }

    }
    //向下转型和类型判断
    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }
        if(p instanceof Teacher){
            ((Teacher) p).teach();
        }
    }
}
