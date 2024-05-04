/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ramdani
 */
public class Television extends ElectronicsStore 
{
  private String brand;
  private int size;

  public Television(String brand, int size) 
  {
    this.brand = brand;
    this.size = size;
  }

  public String getBrand() 
  {
    return brand;
  }

  public int getSize() 
  {
    return size;
  }

  @Override
  public String getDescription() 
  {
    return "A high-definition television for an immersive viewing experience.";
  }
}
