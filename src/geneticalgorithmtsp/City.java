/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithmtsp;

/**
 *
 * @author Michael
 */
public class City {
    String name;
    
    // Constructs a city name
    public City(String name){
        this.name = name;
    }
    
    // Gets city's name
    public String getName(){
        return this.name;
    }
    
    // Gets the distance to given city
    public double distanceTo(City city){
        int distance = 0;
        
        if ((getName() == "A" && city.getName() == "B") || (getName() == "B" && city.getName() == "A")) {
            distance = 5;
        } else if ((getName() == "A" && city.getName() == "C") || (getName() == "C" && city.getName() == "A")) {
            distance = 7;
        } else if ((getName() == "A" && city.getName() == "D") || (getName() == "D" && city.getName() == "A")) {
            distance = 8;
        } else if ((getName() == "A" && city.getName() == "E") || (getName() == "E" && city.getName() == "A")) {
            distance = 6;
        } else if ((getName() == "A" && city.getName() == "F") || (getName() == "F" && city.getName() == "A")) {
            distance = 3;
        } else if ((getName() == "B" && city.getName() == "C") || (getName() == "C" && city.getName() == "B")) {
            distance = 4;
        } else if ((getName() == "B" && city.getName() == "D") || (getName() == "D" && city.getName() == "B")) {
            distance = 6;
        } else if ((getName() == "B" && city.getName() == "E") || (getName() == "E" && city.getName() == "B")) {
            distance = 6;
        } else if ((getName() == "B" && city.getName() == "F") || (getName() == "F" && city.getName() == "B")) {
            distance = 7;
        } else if ((getName() == "C" && city.getName() == "D") || (getName() == "D" && city.getName() == "C")) {
            distance = 9;
        } else if ((getName() == "C" && city.getName() == "E") || (getName() == "E" && city.getName() == "C")) {
            distance = 5;
        } else if ((getName() == "C" && city.getName() == "F") || (getName() == "F" && city.getName() == "C")) {
            distance = 7;
        } else if ((getName() == "D" && city.getName() == "E") || (getName() == "E" && city.getName() == "D")) {
            distance = 8;
        } else if ((getName() == "D" && city.getName() == "F") || (getName() == "F" && city.getName() == "D")) {
            distance = 8;
        } else if ((getName() == "E" && city.getName() == "F") || (getName() == "F" && city.getName() == "E")) {
            distance = 5;
        }
        
        return distance;
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
