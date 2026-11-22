/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclesproject;
/**
 *
 * @author Eslam
 */
public class Bicycle extends Vehicle
{
   public int frameSize ;
   public boolean forAdults ;
   public Bicycle (int id , String brand ,double pricePerDay ,int frameSize , boolean forAdults)
    {
        super(id,brand,pricePerDay);
       this.frameSize = frameSize ;
       this.forAdults = forAdults;
    }
   
   @Override
    public void getDetails()
    {
       System.out.print("id" + id + " brand" + brand + " price Per Day" + pricePerDay + " frameSize" + frameSize + " forAdults" + forAdults);
    }
}
