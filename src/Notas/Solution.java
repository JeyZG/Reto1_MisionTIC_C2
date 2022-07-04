package Notas;

import java.util.Arrays;

public class Solution {
    
    public static double[] reporte(double[] listaNotas) {

        // Declaracion e inicializacion de variables
        // Array tipo double de 3 posiciones
        double[] respuesta = new double[3];
        double suma = 0;

        // Ciclo for para hallar la suma de las notas
        for (int i = 0; i < listaNotas.length; i++) {
            suma += listaNotas[i];
        }

        // Calculamos el promedio de las notas ingresadas
        respuesta[0] = suma / listaNotas.length;

        // Ordenamos la lista de forma ascendente
        Arrays.sort(listaNotas);

        // La nota mas baja es el primer indice de la lista
        respuesta[1] = listaNotas[0];

        // La nota mas baja es el ultimo indice de la lista
        respuesta[2] = listaNotas[listaNotas.length - 1];

        System.out.println("respuesta Notas -> modo 1: " + Arrays.toString(respuesta));

        // Retornamos la variable respuesta
        return respuesta;

    }

    public static double[] reporte(double[] listaNotas, boolean modo) {

        // Declaracion e inicializacion de variables
        // Array tipo double de 3 posiciones
        double[] respuesta = new double[3];
        double suma, promedio, notaMasBaja, notaMasAlta;

        if(modo){

            // Inicializamos las variables
            notaMasBaja = Double.MAX_VALUE;
            notaMasAlta = Double.MIN_VALUE;
            suma = 0.0;
            
            /* Hallamos la suma de las notas, nota mas alta
            y nota mas baja */
            for (int i = 0; i < listaNotas.length; i++) {
                if (listaNotas[i] < notaMasBaja){
                    notaMasBaja = listaNotas[i];
                }
                if (listaNotas[i] > notaMasAlta){
                    notaMasAlta = listaNotas[i];
                }
                suma += listaNotas[i];
            }

            // Calculaos el promedio de las notas ingresadas
            promedio = suma / listaNotas.length;

            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = promedio;
            respuesta[1] = notaMasBaja;
            respuesta[2] = notaMasAlta;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Notas -> modo 2: " + Arrays.toString(respuesta));

        }else{

            // Inicializamos las variables
            notaMasBaja = Double.MAX_VALUE;
            notaMasAlta = Double.MIN_VALUE;
            suma = 0.0;
            
            /* Hallamos la suma de las notas, nota mas alta
            y nota mas baja */
            for (double nota:listaNotas) {
                notaMasBaja = Math.min(notaMasBaja, nota);
                notaMasAlta = Math.max(notaMasAlta, nota);
                suma += nota;
            }
            
            // Calculaos el promedio de las notas ingresadas
            promedio = suma / listaNotas.length;

            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = promedio;
            respuesta[1] = notaMasBaja;
            respuesta[2] = notaMasAlta;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Notas -> modo 3: " + Arrays.toString(respuesta));
        
        }
        
        // Retornamos la variable respuesta
        return respuesta;

    }
}
