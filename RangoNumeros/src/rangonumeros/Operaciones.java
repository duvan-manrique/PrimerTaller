/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangonumeros;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * Clase encargada de calcular los numeros faltantes en la secuencia
 * @author duvan
 * @author ivan camilo
 */
public class Operaciones {
    
    /**
     * Variable que se usa en todos los metodos de esta clase como contador
     */
    int contador;
    /**
     * Constructor de la clase
     */
    public Operaciones() {
        Ingresar();
    }
    /**
     * Funcion en la cual pedimos los numeros y los guardamos en un vector 
     * y llamamos al siguiente metodo Determindar
     *  
     */
    
    public void Ingresar (){

        int [] lista= new int[40];
        Scanner entrada = new Scanner(System. in);
       contador=0;
        char pregunta='n';
        do {
        out. println("Introduce número: ");            
        lista[contador] = entrada.nextInt();
        contador++;
        
        out. println("\n Desea ingresar otro digito(n=no,cualquier tecla para continuar): ");
        pregunta= entrada.next().charAt(0);
        } while (pregunta!='n'&&pregunta!='N');
        Determinar(lista);
        
    }
    /**
     * Funcion en la cual determinamos el numero mayor y el menor de el vector
     * y llamamos al siguiente metodo faltantes     * 
     * @param lista
     *  
     */
    public void Determinar(int [] lista){
        int menor=9999;
        int mayor=-9999;
        for (int i=0;i<contador;i++){
            if(lista[i]<menor){
                menor=lista[i];
            }
            if(lista[i]>mayor){
                mayor=lista[1];
            }
        }
        Faltantes(lista, mayor, menor);
    }
    /**
     * Funcion en la cual determinamos cuales son los numeros faltantes en el vector
     * y los imprimimos     * 
     * @param lista
     * @param mayor
     * @param menor
     *  
     */
    public void Faltantes(int [] lista,int mayor,int menor){
        int recorrido= menor;
        int encontro=0;
        System.out.println("listado de faltantes");
        while(recorrido<=mayor){
            for(int i=0;i<contador;i++){
                if(recorrido==lista[i]){
                    encontro++;
                }
            }
            if(encontro==0){
                System.out.println("\n "+recorrido);
            }
            encontro=0;
            recorrido++;
        }
    }
}
