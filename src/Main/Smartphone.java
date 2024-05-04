/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ramdani
 */
public class Smartphone 
{
  private String brand;
  private String model;
  private double size;

  public Smartphone(String brand, String model, double size) 
  {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public String getBrand() 
  {
    return brand;
  }

  public String getModel() 
  {
    return model;
  }

  public double getSize() 
  {
    return size;
  }

  public String getDescription() 
  {
    return "A compact and versatile device for communication and entertainment.";
  }
}
