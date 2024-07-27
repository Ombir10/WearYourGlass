/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WearYourGlass.models;

import java.util.List;

/**
 *
 * @author raiom
 */
public class WearYourGlassModel {
    String Brands;
    String  Materials;
    String  FrameSize;
    int  Price;
    String  SupportedPower;
    String FrameColor;
    String  Gender;
    
    public WearYourGlassModel(String  Brands, String  Materials, String  FrameSize, int  Price, String SupportedPower,String FrameColor, String  Gender)
    {
        this.Brands = Brands;
        this.Materials = Materials;
        this.FrameSize = FrameSize;
        this.Price = Price;
        this.SupportedPower = SupportedPower;
        this.FrameColor = FrameColor;
        this.Gender = Gender;
    } 
    
    public String  getBrands()
    {
        return Brands;
    }
    
    public String  getMaterials()
    {
        return Materials;
    }
    
    public String  getFrameSize()
    {
        return FrameSize;
    }
    
    public int  getPrice()
    {
        return Price;
    }
    
     public String getFrameColor()
    {
        return FrameColor;
    }
    
     public String  getGender()
    {
        return Gender;
    }
    
     public String   getSupportedPower()
    {
        return SupportedPower;
    }
     public void updateWearYourGlassModel(String  Brands, String  Materials, String  FrameSize, int  Price, String SupportedPower,String FrameColor, String  Gender)
    {
        this.Brands = Brands;
        this.Materials = Materials;
        this.FrameSize = FrameSize;
        this.Price = Price;
        this.SupportedPower = SupportedPower;
        this.FrameColor = FrameColor;
        this.Gender = Gender;
    } 
     
    /**public void setBrands(String  Brands)
    {
        this.Brands = Brands;
    }
   
    public void setMaterials(String  Materials)
    {
        this.Materials = Materials;
    }
   
    public void setFrameSize(String  FrameSize)
    {
        this.FrameSize = FrameSize;
    }
     
    public void setPrice(int  Price)
    {
        this.Price = Price;
    }
      
    public void setSupportedPower(String  SupportedPower)
    {
        this.SupportedPower = SupportedPower;
    }
    
    public void setFrameColor(String  FrameColor)
    {
        this.FrameColor = FrameColor;
    }
      
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }**/

   
}
