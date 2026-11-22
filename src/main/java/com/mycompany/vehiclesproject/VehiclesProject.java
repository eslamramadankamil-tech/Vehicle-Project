/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclesproject;

/**
 *
 * @author Eslam
 */
public class VehiclesProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vehicle[] Vehicles = {new Car(11,"dd",200,3,true)
                             ,new Bicycle (12,"qq",300,15,false)
                             ,new Motorcycle (13,"ee",400,18,true)};
            
            for(Vehicle v : Vehicles)
            {
              v.getDetails();
            }
        
    }
}
