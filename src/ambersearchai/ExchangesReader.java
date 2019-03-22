/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambersearchai;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.io.File;

/**
 *
 * @author gusman
 */
public class ExchangesReader {
 
    
    public void ReadCurrencies(){
        
        String location = "Users/gusman/NetBeansProjects/AmberSearchAI/src/ambersearchai/";
        String fileName = "exchanges.json.json";
        try{
            File file = new File(location + fileName);
            FileReader fileReader = new FileReader(file);          
            JsonReader reader = new JsonReader(fileReader);
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            Exchange[] exchanges = gson.fromJson(reader, Exchange[].class);
            
            List<Exchange> asList = Arrays.asList(exchanges);
            System.out.println(asList);
        }
        catch(Exception err){
            err.printStackTrace();
        }
        
        
        //Currency currencies = new Gson().fromJson(exchanges, Currency.class);
        
        
        
    }
    
    
    
}
    
    
 

