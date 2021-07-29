/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import javax.swing.JOptionPane;

/**
 *
 * @author danilus
 */
public class Metodoburbuja {

    /**
     * @param args the command line arguments
     */
    //En este programa se pregunta a traves de una ventana la cantidad de datos a ingresar y 
   // con mas ventanas se preguntaran los datos a ingresar y a 
     // continuacion de imprimira los datos ya ordenados en la plataforma.
    public static void main(String[] args) {
       String ingresar;
        int numero, valor=0, aux=0;
        ingresar= JOptionPane.showInputDialog("cuantos numeros ingresaras?");
        numero= Integer.parseInt(ingresar);
        int burbuja[]= new int [100];
      
        for(int i=1; i<=numero; i++){
            String dato= JOptionPane.showInputDialog("ingresa el numero");
            valor= Integer.parseInt(dato);
            burbuja[i]= valor;
        }
        for(int i=1; i<=numero-1; i++){
             for(int j=1; j<=numero-1; j++){
                 if(burbuja[j]>burbuja[j+1]){
                     aux=burbuja[j];
                     burbuja[j]=burbuja[j+1];
                     burbuja[j+1]=aux;
                 }              
             }
        }
        
        for(int i=1; i<=numero; i++){
                 JOptionPane.showMessageDialog(null,burbuja[i]);
        }
 }
} 
  

