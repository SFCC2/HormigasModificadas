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
public class Launcher {
    public static void main(String[] args){
		//Crear ambiente
		Grafo a=new Grafo();
//		a.getMatriz();
//		a.printMatrixToSave();
		a.setStaticGraph();
		a.printMatrix();
		
		//create population
		Population pop=new Population(4, 6);
		
		for(int i=0;i<2;i++){

			//calculate fitness
			pop.getPopulationFitness(a.A);

			Chromosome mama=pop.getLowest();
			Chromosome papa = pop.getSecondLowest();
			
			
			//CRUCE... <3
			
			Chromosome hijo1=pop.takeTrake(mama.id, papa.id)[0];
			hijo1.calculateFitness(a.A);
			Chromosome hijo2=pop.takeTrake(mama.id, papa.id)[1];
			hijo2.calculateFitness(a.A);
			
			
			//Reemplazo
			Chromosome paila1=pop.getHighest();
			Chromosome paila2=pop.getSecondHighest();
			pop.replace(paila1.id, paila2.id, hijo1, hijo2);
	
		}		
		
		
		pop.getLowest().printChromosome();
		
		
		
		
		
	}
}