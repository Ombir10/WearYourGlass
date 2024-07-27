/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WearYourGlass.controllers;

import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.WearYourGlass.models.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author raiom
 */
public class MergeSort {
    public void sortString(ArrayList<WearYourGlassModel> glassDataList, String sortBy){
        if (glassDataList.size() <= 1)
            return;
                
        ArrayList<WearYourGlassModel> first = new ArrayList<WearYourGlassModel>(glassDataList.subList(0, glassDataList.size()/2));
        ArrayList<WearYourGlassModel> second = new ArrayList<WearYourGlassModel>(glassDataList.subList(glassDataList.size()/2, glassDataList.size()));
        
                
        sortString(first, sortBy);
        sortString(second, sortBy);
        mergeString(first, second, glassDataList, sortBy);
    }
    
    private char getFirstCharFromFrameColor(WearYourGlassModel model){
        String frameColor = model.getFrameColor();
        return (frameColor != null && frameColor.length() > 0) ? frameColor.charAt(0):0;
    }

    private void mergeString(ArrayList<WearYourGlassModel> first, ArrayList<WearYourGlassModel> second,
                             ArrayList<WearYourGlassModel> glassDataList, String sortBy) {
        int firstCount = 0;
        int secondCount = 0;
        int arrayCount = 0;

        while (firstCount < first.size() && secondCount < second.size()) {
            int comparisonResult;
            switch (sortBy) {
                case "brands":
                    comparisonResult = first.get(firstCount).getBrands().compareTo(second.get(secondCount).getBrands());
                    break;
                case "materials":
                    comparisonResult = first.get(firstCount).getMaterials().compareTo(second.get(secondCount).getMaterials());
                    break;
                case "frame size":
                    comparisonResult = first.get(firstCount).getFrameSize().compareTo(second.get(secondCount).getFrameSize());
                    break;
                case "frame color":
                    char firstFrameColorChar = getFirstCharFromFrameColor(first.get(firstCount));
                    char secondFrameColorChar = getFirstCharFromFrameColor(second.get(secondCount));
                    comparisonResult = Character.compare(firstFrameColorChar, secondFrameColorChar);
                    break;
                case "gender":
                    comparisonResult = first.get(firstCount).getGender().compareTo(second.get(secondCount).getGender());
                    break;
                default:
                    // Default to sorting by brands if sortBy is unrecognized
                    comparisonResult = first.get(firstCount).getBrands().compareTo(second.get(secondCount).getBrands());
                break;
            }
            if (comparisonResult < 0) {
                glassDataList.set(arrayCount, first.get(firstCount));
                firstCount++;
            } else {
                glassDataList.set(arrayCount, second.get(secondCount));
                secondCount++;
            }
            arrayCount++;
        }
        

        while (firstCount < first.size()) {
            glassDataList.set(arrayCount, first.get(firstCount));
            firstCount++;
            arrayCount++;
        }

        while (secondCount < second.size()) {
            glassDataList.set(arrayCount, second.get(secondCount));
            secondCount++;
            arrayCount++;
        }  
    }

    
    
    public void sortInt(ArrayList<WearYourGlassModel>glassDataList, String sortBy){
        if (glassDataList.size() <= 1)
            return;
                   
         ArrayList<WearYourGlassModel> first = new ArrayList<WearYourGlassModel>(glassDataList.subList(0, glassDataList.size()/2));
         ArrayList<WearYourGlassModel> second = new ArrayList<WearYourGlassModel>(glassDataList.subList(glassDataList.size()/2, glassDataList.size()));
        
                
        sortInt(first, sortBy);
        sortInt(second, sortBy);
        mergeInt(first, second, glassDataList, sortBy);
    }
    
    private void mergeInt(ArrayList<WearYourGlassModel>first, ArrayList<WearYourGlassModel>second, ArrayList<WearYourGlassModel> glassDataList, String sortBy){
        int firstCount = 0;
        int secondCount = 0;
        int arrayCount = 0;
        
        while(firstCount<first.size() && secondCount<second.size()){
            int comparisonResult;
            
            if (sortBy.equalsIgnoreCase("Price in Rs")){
                int firstPrice = first.get(firstCount).getPrice();
                int secondPrice = second.get(secondCount).getPrice();
                comparisonResult = Integer.compare(firstPrice, secondPrice);
           }else{
                comparisonResult = 0;
            }
            
            if(comparisonResult < 0){
                glassDataList.set(arrayCount, first.get(firstCount));
                firstCount++;
            }else{
                glassDataList.set(arrayCount, second.get(secondCount));
                secondCount++;
            }
            
            arrayCount++;
        }
            while(firstCount<first.size()){
                glassDataList.set(arrayCount, first.get(firstCount));
                firstCount++;
                arrayCount++;
            }

            while(secondCount<second.size()){
                glassDataList.set(arrayCount, second.get(secondCount));
                secondCount++;
                arrayCount++;
            }
          
    }
     public void sortDescendString(ArrayList<WearYourGlassModel> glassDataList, String sortBy){
        if (glassDataList.size() <= 1)
            return;
                
        ArrayList<WearYourGlassModel> first = new ArrayList<WearYourGlassModel>(glassDataList.subList(0, glassDataList.size()/2));
        ArrayList<WearYourGlassModel> second = new ArrayList<WearYourGlassModel>(glassDataList.subList(glassDataList.size()/2, glassDataList.size()));
        
                
        sortDescendString(first, sortBy);
        sortDescendString(second, sortBy);
        mergeDescendString(first, second, glassDataList, sortBy);
    }
    
    private char getfirstCharFromFrameColor(WearYourGlassModel model){
        String frameColor = model.getFrameColor();
        return (frameColor != null && frameColor.length() > 0) ? frameColor.charAt(0):0;
    }

    private void mergeDescendString(ArrayList<WearYourGlassModel> first, ArrayList<WearYourGlassModel> second,
                             ArrayList<WearYourGlassModel> glassDataList, String sortBy) {
        int firstCount = 0;
        int secondCount = 0;
        int arrayCount = 0;

        while (firstCount < first.size() && secondCount < second.size()) {
            int comparisonResult;
            switch (sortBy) {
                case "brands":
                    comparisonResult = first.get(firstCount).getBrands().compareTo(second.get(secondCount).getBrands());
                    break;
                case "materials":
                    comparisonResult = first.get(firstCount).getMaterials().compareTo(second.get(secondCount).getMaterials());
                    break;
                case "frame size":
                    comparisonResult = first.get(firstCount).getFrameSize().compareTo(second.get(secondCount).getFrameSize());
                    break;
                case "frame color":
                    char firstFrameColorChar = getFirstCharFromFrameColor(first.get(firstCount));
                    char secondFrameColorChar = getFirstCharFromFrameColor(second.get(secondCount));
                    comparisonResult = Character.compare(firstFrameColorChar, secondFrameColorChar);
                    break;
                case "gender":
                    comparisonResult = first.get(firstCount).getGender().compareTo(second.get(secondCount).getGender());
                    break;
                default:
                    // Default to sorting by brands if sortBy is unrecognized
                    comparisonResult = first.get(firstCount).getBrands().compareTo(second.get(secondCount).getBrands());
                    break;
            }
            if (comparisonResult > 0) {
                glassDataList.set(arrayCount, first.get(firstCount));
                firstCount++;
            } else {
                glassDataList.set(arrayCount, second.get(secondCount));
                secondCount++;
            }
            arrayCount++;
        }
        

        while (firstCount < first.size()) {
            glassDataList.set(arrayCount, first.get(firstCount));
            firstCount++;
            arrayCount++;
        }

        while (secondCount < second.size()) {
            glassDataList.set(arrayCount, second.get(secondCount));
            secondCount++;
            arrayCount++;
        }
       
    }
}

