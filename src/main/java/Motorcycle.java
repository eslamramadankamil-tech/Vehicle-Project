/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclesproject;
/**
 *
 * @author Eslam
 */
public class Motorcycle extends Vehicle
{
    public int ccValue ;
    public boolean haveSideCar;
    
    public Motorcycle (int id , String brand ,double pricePerDay ,int  ccValue, boolean haveSideCar)
    {
       super(id,brand,pricePerDay);
       this.ccValue = ccValue ;
       this.haveSideCar = haveSideCar;
    }
    
    @Override
    public void getDetails()
    {
       System.out.print("id" + id + " brand" + brand + " price Per Day" + pricePerDay + " ccValue" + ccValue + " haveSideCar" + haveSideCar);
    }
}
