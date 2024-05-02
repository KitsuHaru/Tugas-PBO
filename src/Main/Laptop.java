/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Adam
 */
public class Laptop 
{
  private String brand;
  private String model;
  private int size;

  public Laptop(String brand, String model, int size) 
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

  public int getSize() 
  {
    return size;
  }

  public String getDescription() 
  {
    return "A powerful and portable computer for work and entertainment.";
  }
}

