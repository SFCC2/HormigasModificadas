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
public class Grafo {

    public int[][] A;
    private int maxSize = 20;

    public int[][] getMatriz() {

        A = new int[maxSize][maxSize];
        int i = 0, j = 0;
        while (i < maxSize) {
            j = i;
            A[i][j] = 0;
            j++;
            while (j < maxSize) {
                int n = getRandomVal();
                A[i][j] = n;
                A[j][i] = n;
                j++;
            }
            i++;
        }
        return A;
    }

    public int getRandomVal() {

        int k = 0;
        int dado = (int) (Math.random() * 10);

        if (dado <= 5) {
            k = 0;
        } else {
            k = (int) (Math.random() * 100) + 1;
        }

        return k;

    }

    public void printMatrixToSave() {
        System.out.print("{");
        for (int i = 0; i < maxSize; i++) {
            System.out.print("{");
            for (int j = 0; j < maxSize; j++) {

                System.out.print(A[i][j]);
                if (j != maxSize - 1) {
                    System.out.print(",");
                };
            }
            System.out.print("},");
        }
        System.out.print("}");
    }

    public void printMatrix() {

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                String s = (A[i][j]) + "";
                if (s.length() == 1) {
                    System.out.print(" " + A[i][j] + " ");

                }
                if (s.length() == 2) {
                    System.out.print("" + A[i][j] + " ");

                }
                if (s.length() == 3) {
                    System.out.print("" + A[i][j] + "");

                }
                System.out.print(" | ");
//				
            }
            System.out.print('\n');
        }
    }

    public void setStaticGraph() {
//		A=new int[][]{{0,65,96,0,0,0,0,0,0,17},{65,0,47,17,13,45,65,0,0,0},{96,47,0,82,0,0,0,0,25,0},{0,17,82,0,0,36,0,22,0,0},{0,13,0,0,0,75,0,0,0,0},{0,45,0,36,75,0,31,33,86,67},{0,65,0,0,0,31,0,6,0,18},{0,0,0,22,0,33,6,0,42,0},{0,0,25,0,0,86,0,42,0,0},{17,0,0,0,0,67,18,0,0,0}};
//		A=new int[][]{{0,0,0,89,13,0,0,22,0,0,0,36,0,0,0,95,98,79,0,0,39,68,0,0,0,0,45,0,0,40},{0,0,54,0,0,15,83,0,49,6,74,0,0,98,98,0,0,0,45,0,0,0,0,0,88,0,0,0,40,16},{0,54,0,81,0,0,21,81,0,85,0,0,0,22,0,18,59,68,8,0,0,0,0,42,0,95,75,0,0,23},{89,0,81,0,0,0,0,51,90,7,29,0,0,0,0,0,18,0,0,0,44,0,0,0,32,39,90,0,53,39},{13,0,0,0,0,0,6,0,53,57,32,0,48,42,75,67,0,0,27,0,0,0,0,36,0,18,48,0,0,0},{0,15,0,0,0,0,3,29,0,86,74,0,0,0,0,0,5,18,8,27,0,0,92,0,0,0,0,93,0,8},{0,83,21,0,6,3,0,12,86,0,18,0,0,38,0,0,0,0,0,0,0,61,0,63,0,34,84,25,0,51},{22,0,81,51,0,29,12,0,40,0,0,0,68,0,0,89,0,68,0,0,0,0,59,51,0,0,0,0,60,82},{0,49,0,90,53,0,86,40,0,0,16,0,0,34,0,0,0,0,83,0,0,0,25,0,0,0,84,0,76,10},{0,6,85,7,57,86,0,0,0,0,5,0,14,76,96,0,11,37,52,0,89,0,0,0,27,55,0,13,0,42},{0,74,0,29,32,74,18,0,16,5,0,0,0,0,0,3,0,0,33,37,63,31,46,0,0,89,71,0,0,93},{36,0,0,0,0,0,0,0,0,0,0,0,0,70,0,0,0,0,6,93,75,0,0,77,65,32,38,0,36,0},{0,0,0,0,48,0,0,68,0,14,0,0,0,0,84,0,0,0,0,66,14,55,41,84,63,0,0,0,81,0},{0,98,22,0,42,0,38,0,34,76,0,70,0,0,46,82,70,37,46,0,60,94,0,22,0,0,0,49,0,0},{0,98,0,0,75,0,0,0,0,96,0,0,84,46,0,0,0,0,0,0,0,0,0,7,0,62,0,0,0,0},{95,0,18,0,67,0,0,89,0,0,3,0,0,82,0,0,81,0,1,0,0,0,0,94,0,0,0,0,0,0},{98,0,59,18,0,5,0,0,0,11,0,0,0,70,0,81,0,56,0,0,0,0,53,0,73,26,65,0,0,81},{79,0,68,0,0,18,0,68,0,37,0,0,0,37,0,0,56,0,86,0,0,90,0,25,24,0,26,0,0,0},{0,45,8,0,27,8,0,0,83,52,33,6,0,46,0,1,0,86,0,0,0,38,0,0,22,0,90,0,60,0},{0,0,0,0,0,27,0,0,0,0,37,93,66,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0},{39,0,0,44,0,0,0,0,0,89,63,75,14,60,0,0,0,0,0,0,0,0,71,0,0,0,32,0,62,0},{68,0,0,0,0,0,61,0,0,0,31,0,55,94,0,0,0,90,38,0,0,0,0,0,26,0,41,21,20,0},{0,0,0,0,0,92,0,59,25,0,46,0,41,0,0,0,53,0,0,0,71,0,0,0,0,0,80,41,0,0},{0,0,42,0,36,0,63,51,0,0,0,77,84,22,7,94,0,25,0,0,0,0,0,0,0,0,0,0,0,0},{0,88,0,32,0,0,0,0,0,27,0,65,63,0,0,0,73,24,22,0,0,26,0,0,0,0,0,0,0,0},{0,0,95,39,18,0,34,0,0,55,89,32,0,0,62,0,26,0,0,0,0,0,0,0,0,0,0,0,0,0},{45,0,75,90,48,0,84,0,84,0,71,38,0,0,0,0,65,26,90,0,32,41,80,0,0,0,0,79,79,0},{0,0,0,0,0,93,25,0,0,13,0,0,0,49,0,0,0,0,0,2,0,21,41,0,0,0,79,0,0,0},{0,40,0,53,0,0,0,60,76,0,0,36,81,0,0,0,0,0,60,0,62,20,0,0,0,0,79,0,0,0},{40,16,23,39,0,8,51,82,10,42,93,0,0,0,0,0,81,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        A = new int[][]{{0, 0, 0, 0, 0, 63, 0, 4, 68, 74, 49, 0, 84, 0, 0, 99, 0, 0, 0, 40}, {0, 0, 75, 0, 0, 0, 0, 0, 0, 0, 27, 0, 89, 0, 0, 0, 88, 35, 37, 0}, {0, 75, 0, 0, 0, 0, 62, 67, 80, 59, 0, 22, 0, 31, 0, 0, 0, 0, 0, 96}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 54, 97, 0, 18, 54, 0, 0, 0, 3, 0, 58}, {0, 0, 0, 0, 0, 0, 68, 81, 0, 0, 12, 55, 100, 0, 2, 0, 91, 0, 0, 0}, {63, 0, 0, 0, 0, 0, 0, 0, 35, 0, 0, 0, 0, 0, 0, 60, 28, 15, 0, 0}, {0, 0, 62, 0, 68, 0, 0, 84, 0, 0, 0, 0, 0, 26, 0, 18, 0, 0, 0, 45}, {4, 0, 67, 0, 81, 0, 84, 0, 48, 0, 0, 81, 0, 0, 0, 0, 0, 19, 6, 0}, {68, 0, 80, 0, 0, 35, 0, 48, 0, 46, 40, 0, 0, 57, 0, 7, 0, 17, 15, 0}, {74, 0, 59, 54, 0, 0, 0, 0, 46, 0, 30, 0, 82, 0, 4, 0, 0, 71, 0, 0}, {49, 27, 0, 97, 12, 0, 0, 0, 40, 30, 0, 0, 0, 17, 0, 0, 0, 0, 13, 0}, {0, 0, 22, 0, 55, 0, 0, 81, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0}, {84, 89, 0, 18, 100, 0, 0, 0, 0, 82, 0, 0, 0, 0, 0, 0, 0, 50, 0, 2}, {0, 0, 31, 54, 0, 0, 26, 0, 57, 0, 17, 0, 0, 0, 76, 0, 33, 0, 0, 0}, {0, 0, 0, 0, 2, 0, 0, 0, 0, 4, 0, 0, 0, 76, 0, 0, 0, 0, 0, 5}, {99, 0, 0, 0, 0, 60, 18, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97, 49}, {0, 88, 0, 0, 91, 28, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0, 0, 0, 93, 13}, {0, 35, 0, 3, 0, 15, 0, 19, 17, 71, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0}, {0, 37, 0, 0, 0, 0, 0, 6, 15, 0, 13, 7, 0, 0, 0, 97, 93, 0, 0, 0}, {40, 0, 96, 58, 0, 0, 45, 0, 0, 0, 0, 0, 2, 0, 5, 49, 13, 0, 0, 0}};

    }

    public void modificarGrafo(Grafo camino) {
        boolean ayuda = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    A[i][j] = 0;
                } else if (i != j && A[i][j] >= 30) {
                    A[i][j] = A[i][j] + 10;
                } else if (i != j && A[i][j] <= 30) {
                    A[i][j] = A[i][j] - 5;
                }
            }
        }
    }

}
