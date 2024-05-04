/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ramdani
 */
public class ElectronicsStore 
{

  public static void main(String[] args) 
  {
    Television tv = new Television("Samsung", 55);
    Laptop laptop = new Laptop("Apple", "MacBook Pro", 13);
    Smartphone phone = new Smartphone("Google", "Pixel 6", 6.4);
    
    System.out.println(tv.getBrand() + " TV (" + tv.getSize() + " inches): " + tv.getDescription());
    System.out.println(laptop.getBrand() + " " + laptop.getModel() + " Laptop (" + laptop.getSize() + " inches): " + laptop.getDescription());
    System.out.println(phone.getBrand() + " " + phone.getModel() + " Smartphone (" + phone.getSize() + " inches): " + phone.getDescription());
  }
}
