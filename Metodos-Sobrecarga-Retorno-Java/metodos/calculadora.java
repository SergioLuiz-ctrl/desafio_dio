import java.lang.reflect.Method;

public class calculadora {
    
    public static void soma (double numero1, double numero2){

       double resultado =  numero1 + numero2;

       System.out.println("O resultado da soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao (double numero1, double numero2){

        double resultado =  numero1 - numero2;
 
        System.out.println("O resultado da subtração de " + numero1 + " - " + numero2 + " = " + resultado);
    }    

      
    public static void multiplicacao (double numero1, double numero2){

        double resultado =  numero1 * numero2;
 
        System.out.println("O resultado da multiplicação de " + numero1 + " X " + numero2 + " = " + resultado);
     }

       
    public static void divisao (double numero1, double numero2){

        double resultado =  numero1 / numero2;
 
        System.out.println("O resultado da divisão de " + numero1 + " / " + numero2 + " = " + resultado);
     }
}
