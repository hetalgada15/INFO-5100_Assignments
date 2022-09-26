/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_application;

import java.util.ArrayList;

/**
 *
 * @author hetal
 */
public class employeeDatabase {
    
    private ArrayList<Demographic> previous_data;
    
    public employeeDatabase(){
        
        this.previous_data = new ArrayList<Demographic>();
        
        
    }

    public ArrayList<Demographic> getPrevious_data() {
        return previous_data;
    }

    public void setPrevious_data(ArrayList<Demographic> previous_data) {
        this.previous_data = previous_data;
    }
    
    
    public Demographic addPreviousDatabases(){
       
        Demographic demographicInfo= new Demographic();
        
        previous_data.add(demographicInfo);
        return demographicInfo;
        
    }
    
    
    
    
}
