package com.zcc.demo.demo2.exercise.tangsengguohe;

/**
 * @author Dr.Z
 * @version demo
 */
public class VehiclesFactory {
//    让马永远是同一匹
    private static Horse horse = new Horse();
    private VehiclesFactory(){}
    public static Horse getHorse(){
//        return new Horse();
        return horse;
    }
    public static Boat getboat(){
        return new Boat();
    }
}
