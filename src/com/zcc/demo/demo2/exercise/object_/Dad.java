package com.zcc.demo.demo2.exercise.object_;

public class Dad {
    private int salay;
    public String n = "ww";
    public Dad(int salay) {
        this.salay = salay;
    }
    public double Math_(){
        return salay * 12;
    }
    public boolean equals(String string){
        return true;
    }

    @Override
    public String toString() {
        return "Dad{" +
                "salay=" + salay +
                ", n='" + n + '\'' +
                '}';
    }
}
