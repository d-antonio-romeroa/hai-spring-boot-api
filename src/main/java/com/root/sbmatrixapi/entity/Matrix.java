package com.root.sbmatrixapi.entity;

import java.util.ArrayList;

public class Matrix {

    int R;
    int C;
    int Z;
    ArrayList<Integer> matrix_fila;
    ArrayList<ArrayList<Integer>> matrix_final;
    int row;

    // public Matrix() {
    // }

    public Matrix(int R, int C, int Z) {
        this.R = R;
        this.C = C;
        this.Z = Z;
        // System.out.println(this.R);
        // System.out.println(this.C);
        // System.out.println(this.Z);
        int last_Z = this.Z;
        matrix_final = new ArrayList<>();
        for (int r = 1; r < this.R+1; r++){
            matrix_fila = new ArrayList<>();
            if(r>1){
                last_Z = last_Z + r -1;
            }

            for (int i=0; i< this.C; i++){
                matrix_fila.add(last_Z);

            };
            matrix_final.add(matrix_fila);
        }
        System.out.println(matrix_final);
        
        
    }

    public int getR() {
        return this.R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getC() {
        return this.C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getZ() {
        return this.Z;
    }

    public void setZ(int Z) {
        this.Z = Z;
    }

    public ArrayList<Integer> getMatrix_fila(int row) {
        return this.matrix_final.get(row);
    }

    public void setMatrix_fila(ArrayList<Integer> matrix_fila) {
        this.matrix_fila = matrix_fila;
    }

    public ArrayList<ArrayList<Integer>> getMatrix_final() {
        return this.matrix_final;
    }

    public void setMatrix_final(ArrayList<ArrayList<Integer>> matrix_final) {
        this.matrix_final = matrix_final;
    }

    public int sum_range(int x, int y){

        try {
            // SE CALCULA LA SUMA DE LA MATRIZ DE ACUERDO A LAS COORDENADAS x e y
            int total = 0;
            for (int j = 0; j < y+1; j++){
                // for (int i = 0; i < x+1; i++){
                    int cell_val = this.matrix_final.get(j).get(0);
                    total += (x+1)*cell_val;
                    // System.out.println(total);
                // }
            };
            // System.out.println(this.matrix_final);
            

            return total;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;

    }

    
}
