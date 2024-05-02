/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Adam
 */
public class Television
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

  // Abstract method to be implemented by subclasses to describe how the food is prepared
  public String getDescription(){
    return "A high-definition television for an immersive viewing experience.";
  }
}
