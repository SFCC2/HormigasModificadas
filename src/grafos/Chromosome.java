/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Sulay2016
 */
public class Chromosome {

    private int maxSize = 20;
    public int[] chromosome = new int[maxSize];
    public int fitness = 0;
    public int id = 0;

    public void getRandomChromosome(int origin, int end) {
        chromosome[0] = origin;
        chromosome[maxSize - 1] = end;

        for (int i = 1; i < maxSize - 1; i++) {
            chromosome[i] = getRandomVal();
        }
    }

    public int getRandomVal() {

        int k = 0;
        int dado = (int) (Math.random() * 10);

        if (dado <= 5) {
            k = -1;
        } else {
            k = (int) (Math.random() * maxSize);
        }

        return k;

    }
    
    

    public void printChromosome() {
        System.out.println("----");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(chromosome[i]);
            System.out.print(" ");
        }
        System.out.println("Fitness: " + fitness);
        System.out.println("\n ----");

        System.out.println("versión elegante:");
        System.out.println("----");
        for (int i = 0; i < maxSize; i++) {
            if (chromosome[i] != -1) {
                System.out.print(chromosome[i]);
                System.out.print(" ");
            }
        }
        System.out.println("Fitness: " + fitness);
        System.out.println("\n ----");

    }

    public void calculateFitness(int a[][]) {
        int myFitness = 0;
        int from = chromosome[0];
        int to = chromosome[1];
        for (int i = 1; i < maxSize; i++) {
//			System.out.println("desde "+from);
//			System.out.println("hasta "+chromosome[i]);
            if (chromosome[i] != -1) {
                to = chromosome[i];
                if (a[from][to] > 0) {
                    myFitness += a[from][to];
//					System.out.println("suma "+a[from][to]);
                } else {
//					System.out.println("suma 1000");
                    myFitness += 10000;
                }
                from = chromosome[i];
            }
        }
        fitness = myFitness;
    }

}
