/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import javax.swing.JOptionPane;
/**
 * @author Ivan Vargas y Sulay Cupitra
 * Asignaturaa: Estrudctura de Datos
 * Actividad: Hormigas
 * este programa solo se puede ejecutar desde la consola mas no contine grafico
 */
public class Ejecutar_hormigasconsola {

    public static void main(String[] args) {
        Grafo camino = new Grafo();
        Ejecutar_hormigasconsola admin = new Ejecutar_hormigasconsola();
//		a.getMatriz();
//		a.printMatrixToSave();
        camino.setStaticGraph();
        camino.printMatrix();
        boolean ayuda = true;
        //create population
        Population pop = new Population(4, 6);
        for (int i = 0; i < 2; i++) {
            //si se utiliza las funciones po get lowest y second lowest  por tanto altera la matriz las veces necesaras hasta que sea falsa
            if (ayuda = true) {
                //calculate fitness
                pop.getPopulationFitness(camino.A);
                //se modificara el grafo hasta que el boleeano sea falso
                camino.modificarGrafo(camino);
                Chromosome comida = pop.getLowest();
                Chromosome hormiga = pop.getSecondLowest();

                //Chromosome hormiga2=pop.takeTrake(comida.id, hormiga.id)[0];
                Chromosome hormiga2 = pop.caminHormiga_comida(comida.id, hormiga.id)[0];
                //admin.calcularfitness(camino, hormiga);
                hormiga.calculateFitness(camino.A);
                hormiga2.calculateFitness(camino.A);
            } else {

            }

        }
        pop.getLowest().printChromosome();
       System.out.println("las hormigas van ");
        camino.printMatrix();
         System.out.println("");
         System.out.println("");
         for (int i = 0; i < 2; i++) {
            //si se utiliza las funciones po get lowest y second lowest  por tanto altera la matriz las veces necesaras hasta que sea falsa
            if (ayuda = true) {
                //calculate fitness
                pop.getPopulationFitness(camino.A);
                //se modificara el grafo hasta que el boleeano sea falso
                camino.modificarGrafo(camino);
                Chromosome comida = pop.getLowest();
                Chromosome hormiga = pop.getSecondLowest();

                //Chromosome hormiga2=pop.takeTrake(comida.id, hormiga.id)[0];
                Chromosome hormiga2 = pop.caminHormiga_comida(comida.id, hormiga.id)[0];
                //admin.calcularfitness(camino, hormiga);
                hormiga.calculateFitness(camino.A);
            }}
         
         pop.getLowest().printChromosome();
          System.out.println("");
        System.out.println("las hormigas se devuelven");
        camino.printMatrix();
        //admin.poblacion(pop);
    }

    public void calcularfitness(Grafo camino, Chromosome b) {
        b.calculateFitness(camino.A);
    }
}
