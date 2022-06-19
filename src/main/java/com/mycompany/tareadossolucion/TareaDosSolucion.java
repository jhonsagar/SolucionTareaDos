/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareadossolucion;
import java.util.Scanner;

/**
 *
 * @author jhon sanchez
 */
public class TareaDosSolucion {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        /*1 Realizar un programa en Java que permita ingresar 2 números con el objetivo de
         operarlos como en una calculadora, utilizando funciones y estructuras básicas y
         operandos.*/
        /*
        //los hice con double para probar con los decimales 
        double Num1;
        double Num2;
        System.out.println("Ingrese un Numero :");
        Num1 = op.nextDouble();
        System.out.println("Ingrese un Numero :");
        Num2 = op.nextDouble();
        Suma(Num1,Num2);
        Resta(Num1,Num2);
        Multiplicacion(Num1,Num2);
        Division(Num1,Num2);
        

    }
    public static void Suma (double N1, double N2){
        double resultado = N1+N2;
        System.out.println("La suma es :"+resultado);
        }
    public static void Resta (double N1, double N2){
        double resultado = N1-N2;
        System.out.println("La resta es :"+resultado);
        }
    public static void Multiplicacion (double N1, double N2){
        double resultado = N1*N2;
        System.out.println("La Multiplicacion es :"+resultado);
        }
    public static void Division (double N1, double N2){
        if(N2<=0){
            System.out.println("Error, no puede dividir entre 0 o con un número negativo");
        }else{
            double resultado = N1/N2;
            System.out.println("El resultado de la division es :"+resultado);
        }*/
        System.out.println("=================================================");
    /*2. Realice un programa que muestre el signo del zodiaco de una persona. Para ello el
        usuario debe introducir únicamente el día y el mes de nacimiento y el programa
        determinará inmediatamente el signo zodiacal de la persona y su horóscopo (pequeño).
        Luego volverá a mostrar el menú de ingreso, hasta escoger salir*/    
        int Dia;
        int Mes;
        System.out.println("Ingresa tu Mes de nacimiento");
        Mes = op.nextInt();
        System.out.println("Ingresa tu dia de nacimiento");
        Dia = op.nextInt();
        System.out.println("Su dia de nacimento es :"+ Dia);
        CalcularSigno(Mes,Dia);
        }
    
    public static void CalcularSigno(int MesN,int DiaN ){
    switch(MesN){
        case 1:
            System.out.println("Su Mes es Enero ");
            if (DiaN <= 20){
                
                System.out.println("Su signo es Capricornio");
            }else{
                System.out.println("Su signo es Acuario");
            }break;
        case 2:
            System.out.println("Su Mes es Febrero ");
            if(DiaN <= 18){
                
                System.out.println("Su signo es Acuario");
            }else{
                System.out.println("Su signo es Piscis");
            }break;
        case 3:
            if(DiaN <= 20){
                System.out.println("Su Mes es Marzo ");
                System.out.println("Su signo es Piscis");
            }else{
                System.out.println("Su signo es Aries");
            }break;
        case 4:
            System.out.println("Su Mes es Abril ");
            if(DiaN <= 20){
                System.out.println("Su signo es Aries");
            }else{
                System.out.println("Su signo es Tauro");
            }break;
        case 5:
            System.out.println("Su Mes es Mayo ");
            if(DiaN <= 21){
                
                System.out.println("Su signo es Tauro");
            }else{
                System.out.println("Su signo es Geminis");
            }break;
        case 6:
            System.out.println("Su Mes es Junio ");
            if(DiaN <= 21){
                System.out.println("Su signo es Geminis");
            }else{
                System.out.println("Su signo es Cancer");
            }break;
        case 7:
            System.out.println("Su Mes es Julio ");
            if(DiaN <= 22){
                System.out.println("Su signo es Cancer");
            }else{
                System.out.println("Su signo es Leo");
            }break;
        case 8:
            System.out.println("Su Mes es Agosto ");
            if(DiaN <= 23){
                System.out.println("Su signo es Leo");
            }else{
                System.out.println("Su signo es Virgo");
            }break;
        case 9:
            System.out.println("Su Mes es Septiembre ");
            if(DiaN <= 24){
                System.out.println("Su signo es Virgo");
            }else{
                System.out.println("Su signo es Libra");
            }break;
        case 10:
            System.out.println("Su Mes es Octubre ");
            if(DiaN <= 24){
                System.out.println("Su signo es Libra");
            }else{
                System.out.println("Su signo es Escorpion");
            }break;
        case 11:
            System.out.println("Su Mes es Noviembre ");
            if(DiaN <= 24){
                System.out.println("Su signo es Escorpion");
            }else{
                System.out.println("Su signo es Sagitario");
            }break;
        case 12:
            System.out.println("Su Mes es Diciembre");
            if(DiaN <= 21){
                System.out.println("Su signo es Sagitario");
            }else{
                System.out.println("Su signo es Capricornio");
            }break;
            
        default: {
                System.out.println("Opcion incorrecta");

            }      
    }
    }
    
    
    
}
