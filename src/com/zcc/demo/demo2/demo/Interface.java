package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Interface {
    public static void main(String[] args) {
        Music.DASDADS.playing();
    }
}
interface IPlaying{
    public void playing();
}
enum Music implements IPlaying{
    DASDADS;
    @Override
    public void playing() {
        System.out.println("duide");
    }
}
