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
        //los hice con double para probar con los decimales tambien
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
        }
        
        }
    
    
    
}
