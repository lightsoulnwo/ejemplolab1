/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author the-k
 */
public abstract class Menu {

    public String menu;
    public int opciones;
    public int acc;

    public Menu() {}

    public abstract void mostrarMenu() ;

    public abstract void Accion(int acc) ;
}
