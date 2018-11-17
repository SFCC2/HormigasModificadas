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
public class Population {
    public int populationSize=1000;
	public Chromosome[] population=new Chromosome[populationSize];
	
	
	public Population(int origin, int end){
		for(int i=0;i<populationSize;i++){
			population[i]=new Chromosome();
			population[i].getRandomChromosome(origin, end);
			population[i].id=i;
		}
	}
	public void getPopulationFitness(int A[][]){
		for(int i=0;i<populationSize;i++){
			population[i].calculateFitness(A);
		}
	}
	
	public Chromosome getHighest(){
		Chromosome max=population[0];
		for(int i=0;i<populationSize;i++){
			if(population[i].fitness>max.fitness){
				max=population[i];
			}
		}
		return max;
	}
	
	public Chromosome getSecondHighest(){
		Chromosome secondMax=population[0];
		Chromosome max=getHighest();
		for(int i=0;i<populationSize;i++){
			if(population[i].fitness>secondMax.fitness && population[i]!=max){
				secondMax=population[i];
			}
		}
		return secondMax;
	}
	
	public Chromosome getLowest(){
		Chromosome min=population[0];
		for(int i=0;i<populationSize;i++){
			if(population[i].fitness<min.fitness){
				min=population[i];
			}
		}
		return min;
	}

	public Chromosome getSecondLowest(){
		Chromosome secondMin=population[0];
		Chromosome min=getLowest();
		for(int i=0;i<populationSize;i++){
			if(population[i].fitness<secondMin.fitness && population[i]!=min){
				secondMin=population[i];
			}
		}
		return secondMin;
	}
	
	
	public Chromosome[] takeTrake(int id1, int id2){
		Chromosome[] hijos=new Chromosome[2];
		hijos[0]=new Chromosome();
		hijos[1]=new Chromosome();
		int crossPoint=population[id1].chromosome.length/2;
		for(int i=0;i<population[id1].chromosome.length;i++){
			if(i<crossPoint){
				hijos[0].chromosome[i]=population[id1].chromosome[i];
				hijos[1].chromosome[i+crossPoint]=population[id1].chromosome[i+crossPoint];
			}else{
				hijos[0].chromosome[i]=population[id2].chromosome[i];
				hijos[1].chromosome[i-crossPoint]=population[id2].chromosome[i-crossPoint];
			}
		}
		
		return hijos;
	}
	
	public void replace(int idPaila1, int idPaila2, Chromosome hijo1,Chromosome hijo2 ){
		population[idPaila1]=hijo1;
		population[idPaila1].id=idPaila1;
		population[idPaila2]=hijo2;
		population[idPaila2].id=idPaila2;
		
		
	}
        
        public Chromosome[] caminHormiga_comida(int id1, int id2){
		Chromosome[] hijos=new Chromosome[2];
		hijos[0]=new Chromosome();
		hijos[1]=new Chromosome();
		int crossPoint=population[id1].chromosome.length/2;
		for(int i=0;i<population[id1].chromosome.length;i++){
			if(i<crossPoint){
				hijos[0].chromosome[i]=population[id1].chromosome[i];
				hijos[1].chromosome[i+crossPoint]=population[id1].chromosome[i+crossPoint];
			}else{
				hijos[0].chromosome[i]=population[id2].chromosome[i];
				hijos[1].chromosome[i-crossPoint]=population[id2].chromosome[i-crossPoint];
			}
		}
		
		return hijos;
	
	}
        
        
	
}

