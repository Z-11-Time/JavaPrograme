package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Dfeedfs {
    public static void main(String args[]){
        Action action = new Action() {
            @Override
            public void execute() {

            }
        };
                action.execute();
    }

}
interface Action{
    public void execute();
}
