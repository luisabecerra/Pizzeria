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
public class Vegetariana extends Pizza {

    public Vegetariana(String masa, String salsa, String Ingredientes) {
       super(masa, salsa, Ingredientes);
       super.setIngredientes(Ingredientes);
       super.setMasa(masa);
       super.setSalsa(salsa);
    }


    @Override
    public String getIngredientes() {
        return super.getIngredientes(); 
    }


    @Override
    public String getSalsa() {
        return super.getSalsa(); 
    }

    @Override
    public String getMasa() {
        return super.getMasa(); 
    }


    public void Hornear(){
        System.out.println("Horneado por 15 minuos");
    }
    
    public void Cortar(){
        System.out.println("El corte es cuadrado");
    }
    
    public void Empacar(){
        System.out.println("Se empaca en caja ");
    }

}
