/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanivel01_2021;

/**
 *
 * @author xp
 */
public class EjerciciosJavaNivel01_2021 {

    //declaro un array de integers para hacer pruebas
    
    int[] listaNumeros = {3, 31, 200, 20, 5, 99};
    
    public int maximo (int[] lista){
        int auxiliar = lista[0]; //el maximo va a ser el primer elemento del array
        for (int i=0; i< lista.length; i++){
            if (auxiliar < lista[i]){
            auxiliar = lista [i];
            }
         }
        return auxiliar;
    }

    /**
     * @param args 
     */
    public static void main(String[] args) {
        EjerciciosJavaNivel01_2021 ejercicio = new EjerciciosJavaNivel01_2021();
        
        System.out.println(ejercicio.listaNumeros[0]);
        System.out.println("El maximo es " + ejercicio.maximo(ejercicio.listaNumeros));
        
    }
    
}
