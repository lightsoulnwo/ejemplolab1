/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App1;

import java.util.Scanner;
import lab1.Menu;

/**
 *
 * @author the-k
 */
public class App1 extends Menu {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void mostrarMenu() {

        int entrada = 0;

        do {
            System.out.println("MENU DE APP_1");
            System.out.println("INGRESE UNA OPCION");

            System.out.println("1.-si esprimo o no esprimo");
            System.out.println("2.-MCD");
            System.out.println("3.-SALIR");
            entrada = scanner.nextInt();
            while (entrada != 1 && entrada != 2 && entrada != 3) {
                System.out.println("INGRESA UN OPCION VALIDA");
                entrada = scanner.nextInt();

            }
            if(entrada==1||entrada==2){
                Accion(entrada);
            }
          
        } while (entrada != 3);
    }

    @Override
    public void Accion(int acc) {

        if (acc == 1) {
            double num1, num2;
            System.out.println("INGRESE UN NUMERO");

            num1 = scanner.nextDouble();
            while (num1 < 0) {
                System.out.println("INGRESE Una opcion valida");

                num1 = scanner.nextDouble();
            }

            num2 = num1 - 1;

            while (num1 % num2 != 0) {
                num2--;

            }
            if (num2 == 1) {
                System.out.println("es primo el numero : " + num1);

            } else {
                System.out.println("no es primo el numero :" + num1);
            }
        } else {
            int num3, num4;
            int mcd;
            System.out.println("INGRESE 2 numeros mayores que 0 ");
            num3 = scanner.nextInt();
            num4 = scanner.nextInt();
            while (num3 < 0 || num4 < 0) {
                System.out.println("INGRESE Una opcion valida");

                num3 = scanner.nextInt();
                num4 = scanner.nextInt();
            }
            num3=Math.max(num3,num4);
            num4=Math.min(num3, num4);
            mcd = calcularMCD(num3, num4);
            System.out.println("el MCD ES "+mcd);
        }
    }

    public int calcularMCD(int num1, int num2) {
     
        if(num1%num2==0){
            return num2;
        }else{
            return calcularMCD(num2,num1%num2);
        }
       
    }

}
