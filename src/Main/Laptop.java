/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ramdani
 */
public class Laptop extends ElectronicsStore 
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

  @Override
  public String getDescription() 
  {
    return "A powerful and portable computer for work and entertainment.";
  }
}

