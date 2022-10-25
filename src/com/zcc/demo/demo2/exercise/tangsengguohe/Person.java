package com.zcc.demo.demo2.exercise.tangsengguohe;

/**
 * @author Dr.Z
 * @version demo
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name,  Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //直接把需求封装成方法

        public void passRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getboat();
        }
        vehicles.work();
    }

    public void normal(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public String getName() {
        return name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }
}
