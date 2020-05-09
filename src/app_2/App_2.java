/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_2;

import java.io.File;
import java.util.Scanner;
import lab1.Menu;

/**
 *
 * @author the-k
 */
public class App_2 extends Menu{
  Scanner scanner = new Scanner(System.in);
    @Override
    public void mostrarMenu() {
        
        Personas personas = objectMapper.readValue(new File("C:\\Users\\the-k\\Desktop\\ttttt\\ejemplolab1\\src\\lab1\\personas.json"), personas.class);
         int entrada = 0;

        do {
            System.out.println("MENU DE APP_2");
            System.out.println("INGRESE UNA OPCION");

            System.out.println("1.-LISTAR=MOSTRAREL NUMER DE ORDEN DE TODAS LAS PERSONAS");
            System.out.println("2.-CREAR UNA PERSONA CON TODOS LOSCAMPOS");
            System.out.println("3.-ELIMINAR A UNA PERSONA");
            System.out.println("4.-GUARDAR UNA NUEVA LISTA");
            System.out.println("5.- SALIR");
            entrada = scanner.nextInt();
            while (entrada != 1 && entrada != 2 && entrada != 3&& entrada != 5&& entrada != 4) {
                System.out.println("INGRESA UN OPCION VALIDA");
                entrada = scanner.nextInt();

            }
            if(entrada==1||entrada==2||entrada==3||entrada==4){
                Accion(entrada);
            }
          
        } while (entrada != 3);
        
        }

    @Override
    public void Accion(int acc) {
     
       }
    
}
