/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TipoPizza;
        java.util.Scanner leer=new java.util. Scanner(System.in);
        System.out.println("Ingrese el numero de la pizza que desea");
        System.out.println("1: Vegetariana, 2: Pepperoni, 3: Queso");
        TipoPizza = leer.nextInt();
        
        if (TipoPizza==1){
            Vegetariana p= new Vegetariana("Regular","Tomate","mozzarela, parmesano rallado, cebolla picada, hongos en rebanadas, pimienta roja, aceitunas negras en rebanadas.");
            p.Hornear();
            p.Cortar();
            p.Empacar();
  
        }
        
        if (TipoPizza==2){
            Pepperoni p= new Pepperoni("Corteza regular","Tomate","rodajasde pepperoni, rodajas de cebolla, queso parmesano rallado");
            p.Hornear();
            p.Cortar();
            p.Empacar();
        }
        
        if (TipoPizza==3){
            Queso p= new Queso("Regular","Tomate","Queso Mozzarella fresco, Parmesano.");
            p.Hornear();
            p.Cortar();
            p.Empacar();
        }
        
        
    }
    
}
