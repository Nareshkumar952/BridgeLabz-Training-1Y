package com.gla.Inheritance;
class Device{
    int deviceid;
    String Status;
    void Dis(){
        System.out.println(deviceid);
        System.out.println(Status);
    }
}
class Thermostat extends Device{
    void display(){
        String Temp = "";
        System.out.println(Temp);
    }
}
public class SmartHomeDevices {
    static void main(String[] args) {
    Thermostat t=new Thermostat();
    t.Dis();
    t.display();
    }
}
