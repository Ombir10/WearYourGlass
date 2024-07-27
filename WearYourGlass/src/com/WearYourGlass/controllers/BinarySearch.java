/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WearYourGlass.controllers;


import java.util.Arrays;
import java.util.ArrayList;
import com.WearYourGlass.models.*;
import java.util.List;
/**
 *
 * @author raiom
 */
public class BinarySearch {
    public List<WearYourGlassModel> searchString(ArrayList<WearYourGlassModel>glassDataList, int low, int high, String searchKey, String sortBy) {
        List<WearYourGlassModel> foundEntries = new ArrayList<>();
        switch (sortBy) {    
            case "brands":
                    while (high >= low) {
                        int mid = (low + high) / 2;
                        String brandName = glassDataList.get(mid).getBrands();


                        // If the element is present at the
                        // middle itself
                        if (brandName.equals(searchKey)) {
                            foundEntries.add(glassDataList.get(mid));
                            
                            // Move left and right to find other matching entries
                            int left = mid -1;
                            int right= mid + 1;
                            while(left>=0 && glassDataList.get(left).getBrands().equals(searchKey)){
                                foundEntries.add(glassDataList.get(left));
                                left--;
                            }
                            // Search right for matching entries
                            while(right<glassDataList.size() && glassDataList.get(right).getBrands().equals(searchKey)){
                                foundEntries.add(glassDataList.get(right));
                                right++;
                            }
                            return foundEntries;
                        }
                        else if(brandName.compareTo(searchKey)<0){
                            low = mid+1;
                        }
                        else{
                            high = mid - 1;
                        }
                    }
                    break;
            case "materials":
                while (high >= low) {
                    int mid = (low + high) / 2;
                    String materials = glassDataList.get(mid).getMaterials();


                    // If the element is present at the
                    // middle itself
                        if (materials.equals(searchKey)) {
                            foundEntries.add(glassDataList.get(mid));
                            int left = mid -1;
                            int right= mid + 1;
                            while(left>=0 && glassDataList.get(left).getMaterials().equals(searchKey)){
                                foundEntries.add(glassDataList.get(left));
                                left--;
                            }
                            
                            while(right<glassDataList.size() && glassDataList.get(right).getMaterials().equals(searchKey)){
                                foundEntries.add(glassDataList.get(right));
                                right++;
                            }
                            return foundEntries;
                        }
                        else if(materials.compareTo(searchKey)<0){
                            low = mid+1;
                        }
                        else{
                            high = mid - 1;
                        }
                    }
                    break;
            case "frame size":
                while (high >= low) {
                    int mid = (low + high) / 2;
                    String frameSize = glassDataList.get(mid).getFrameSize();


                    // If the element is present at the
                    // middle itself
                    if (frameSize.equals(searchKey)) {
                            foundEntries.add(glassDataList.get(mid));
                            int left = mid -1;
                            int right= mid + 1;
                            while(left>=0 && glassDataList.get(left).getFrameSize().equals(searchKey)){
                                foundEntries.add(glassDataList.get(left));
                                left--;
                            }
                            
                            while(right<glassDataList.size() && glassDataList.get(right).getFrameSize().equals(searchKey)){
                                foundEntries.add(glassDataList.get(right));
                                right++;
                            }
                            return foundEntries;
                        }
                        else if(frameSize.compareTo(searchKey)<0){
                            low = mid+1;
                        }
                        else{
                            high = mid - 1;
                        }
                    }
                    break;
                    default:
                    // Default to sorting by brands if sortBy is unrecognized
                    while (high >= low) {
                    int mid = (low + high) / 2;
                        String brandName = glassDataList.get(mid).getBrands();


                        // If the element is present at the
                        // middle itself
                        if (brandName.equals(searchKey)) {
                            foundEntries.add(glassDataList.get(mid));
                            int left = mid -1;
                            int right= mid + 1;
                            
                            //Search left for matching entries
                            while(left>=0 && glassDataList.get(left).getBrands().equals(searchKey)){
                                foundEntries.add(glassDataList.get(left));
                                left--;
                            }
                            
                            while(right<glassDataList.size() && glassDataList.get(right).getBrands().equals(searchKey)){
                                foundEntries.add(glassDataList.get(right));
                                right++;
                            }
                            return foundEntries;
                        }
                        else if(brandName.compareTo(searchKey)<0){
                            low = mid+1;
                        }
                        else{
                            high = mid - 1;
                        }
                    }
                    break;
        }
        
        return null;
    }

    public List<WearYourGlassModel> searchInt(ArrayList<WearYourGlassModel> glassDataList, int low, int high, int searchKey, String sortBy) {
            List<WearYourGlassModel> foundEntries = new ArrayList<>();
            if (sortBy.equals("price")){
            while (high >= low) {
                int mid = (low + high) / 2;
                int price = glassDataList.get(mid).getPrice();

                if (price == searchKey) {
                    // Add the matching entry to the list
                    foundEntries.add(glassDataList.get(mid));

                    // Move left and right to find other matching entries
                    int left = mid - 1;
                    int right = mid + 1;

                     //Search left for matching entries
                    while (left >= 0 && glassDataList.get(left).getPrice() == searchKey) {
                        foundEntries.add(glassDataList.get(left));
                        left--;
                    }

                    // Search right for matching entries
                    while (right < glassDataList.size() && glassDataList.get(right).getPrice() == searchKey) {
                        foundEntries.add(glassDataList.get(right));
                        right++;
                    }

                    return foundEntries;
                } else if (price < searchKey) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }        
        }
            return null;
    }
}


