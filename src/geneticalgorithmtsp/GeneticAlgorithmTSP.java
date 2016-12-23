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
public class GeneticAlgorithmTSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create and add our cities
        
        TourManager.addCity(new City("A"));
        TourManager.addCity(new City("B"));
        TourManager.addCity(new City("C"));
        TourManager.addCity(new City("D"));
        TourManager.addCity(new City("E"));
        TourManager.addCity(new City("F"));

        // Initialize population
        Population pop = new Population(6, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution: " + pop.getFittest());
    }
    
}
