package lab1;

import App1.App1;
import static java.time.Clock.system;
import java.util.Scanner;

public class Lab1  {

    public static void main(String[] args) {
        
        int entrada = 0;
        double num1, num2;

        Scanner scanner = new Scanner(System.in);
                 
                       
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("INGRESE UNA OPCION");

            System.out.println("1.-APP_1");
            System.out.println("2.-APP_2");
            System.out.println("3.-SALIR");
                entrada = scanner.nextInt();
            while (entrada != 1 && entrada != 2 && entrada != 3) {
                    System.out.println("INGRESA UN OPCION VALIDA");
                entrada = scanner.nextInt();
            
            }
               if(entrada==1||entrada==2){
                accion(entrada); 
            }
                     
            
        } while (entrada != 3);

         System.out.println("GRACIAS X USARME");
        
    }
    
    public static void accion(int entrada){
        if (entrada==1){
            
           App1 obj1=new App1();
           obj1.mostrarMenu();
            
        }
    }


}
