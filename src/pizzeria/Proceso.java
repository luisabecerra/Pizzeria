/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author Preparar y amasar la masa.
–Adicionar las salsas.
–Adicionar los ingredientes, los cuales dependen de cada tipo de pizza.
•Ornear
•Cortar
•Empacar
 */
public abstract class Proceso {
    
    public abstract void PrepararyCortar();
    public abstract void AdicionarSalsas();
    public abstract void Hornear();
    public abstract void Cortar();
    public abstract void Empacar();
    
    
            
}
