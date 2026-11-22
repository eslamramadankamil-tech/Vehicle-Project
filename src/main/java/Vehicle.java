/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclesproject;
/**
 *
 * @author Eslam
 */
 public class Vehicle 
{
    static int countNumber = 0;
      public int id ;
      public String brand ;
      public double pricePerDay;
      Vehicle(int id , String brand ,double pricePerDay )
     {
         countNumber++; 
         this.id = id ;
         this.brand = brand ;
         this.pricePerDay = pricePerDay;
     }
      
      public double calcRentalCost(int days)
      {
          return days * pricePerDay ;
      }
      public void getDetails()
      {
           System.out.print("id" + id + " brand" + brand + " price Per Day" + pricePerDay);
      }
              
      
}
