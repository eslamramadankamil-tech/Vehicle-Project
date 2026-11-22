/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclesproject;

/**
 *
 * @author Eslam
 */
class Car extends Vehicle 
{
    public int sets ;
    public boolean isAutomatic;
    
    public Car (int id , String brand ,double pricePerDay ,int sets , boolean isAutomatic)
    {
        super(id,brand,pricePerDay);
       this.sets = sets ;
       this.isAutomatic = isAutomatic;
    }
    @Override
    public void getDetails()
    {
       System.out.print("id" + id + " brand" + brand + " price Per Day" + pricePerDay + " sets" + sets + " isAutomatic" + isAutomatic);
    }
    

}
