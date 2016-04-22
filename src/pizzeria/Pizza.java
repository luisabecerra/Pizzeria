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
public class Pizza {
    String masa;
    private String salsa;
    private String Ingredientes;

    public Pizza(String masa, String salsa, String Ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.Ingredientes = Ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
        System.out.println(masa);
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
        System.out.println(salsa);
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
        System.out.println(Ingredientes);
    }


    
    
}
