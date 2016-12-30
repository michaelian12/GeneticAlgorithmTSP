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
        double totalFitness = 0, cumulative = 0;       
        
        TourManager.addCity(new City("A"));
        TourManager.addCity(new City("B"));
        TourManager.addCity(new City("C"));
        TourManager.addCity(new City("D"));
        TourManager.addCity(new City("E"));
        TourManager.addCity(new City("F"));

        // Initialize population
        Population pop = new Population(6, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());
        for (int i = 0; i < pop.populationSize(); i++) {
            System.out.println(pop.getTour(i) + "Total: " + pop.getTour(i).getDistance());
        }

        // Chromosome selection
        System.out.println("\nChromosome selection:");
        for (int i = 0; i < pop.populationSize(); i++) {
            totalFitness += pop.getTour(i).getFitness();
            System.out.println("Q[" + (i+1) + "] = " + pop.getTour(i).getFitness());
        }
        
        // Roulette wheel
        System.out.println("\nProbabilities:");
        for (int i = 0; i < pop.populationSize(); i++) {
            System.out.println("P[" + (i+1) + "] = " + (pop.getTour(i).getFitness()/totalFitness));
        }
        
        // Cumulatives
        System.out.println("\nCumulatives:");
        for (int i = 0; i < pop.populationSize(); i++) {
            cumulative += pop.getTour(i).getFitness()/totalFitness;
            System.out.println("C[" + (i+1) + "] = " + cumulative);
        }
        
        // Crossover
        System.out.println("\nCrossover candidates:");
        for (int i = 0; i < pop.populationSize(); i++) {
            System.out.println(GA.tournamentSelection(pop));
        }
        
        // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("\nFinal distance: " + pop.getFittest().getDistance());
        System.out.println("Solution: " + pop.getFittest());
    }
    
}
