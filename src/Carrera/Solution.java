package Carrera;

import java.util.Arrays;

public class Solution {
    
    public static int[] reporte(int[] participantes) {
        
        // Declaracion e inicializacion de variables
        // Array tipo int de 3 posiciones
        int[] respuesta = new int[3];
         
        // Hallamos la cantidad de participantes
        respuesta[0] = participantes.length;

        // Ordenamos la lista de forma ascendente
        Arrays.sort(participantes);

        // El tiempo del participante que llego primero es el primer indice de la lista
        respuesta[1] = participantes[0];

        // El tiempo del participante que llego ultimo es el ultimo indice de la lista
        respuesta[2] = participantes[participantes.length - 1];

        System.out.println("respuesta Carrera -> modo 1: " + Arrays.toString(respuesta));

        // Retornamos la variable respuesta
        return respuesta;
        
    }
    
    public static int[] reporte(int[] participantes, boolean modo) {
        
        // Declaracion e inicializacion de variables
        // Array tipo int de 3 posiciones
        int[] respuesta = new int[3];
        int cantidadParticipantes, tiempoPrimerCompetidor, tiempoUltimoCompetidor;
        
        if(modo){
            
            // Inicializamos las variables
            tiempoPrimerCompetidor = Integer.MAX_VALUE;
            tiempoUltimoCompetidor = Integer.MIN_VALUE;
            cantidadParticipantes = 0;
            
            /* Hallamos la cantidad de participantes, valor maximo y valor minimo
            de los tiempos de los participantes */
            for (int i = 0; i < participantes.length; i++) {
                if (participantes[i] < tiempoPrimerCompetidor){
                    tiempoPrimerCompetidor = participantes[i];
                }
                if (participantes[i] > tiempoUltimoCompetidor){
                    tiempoUltimoCompetidor = participantes[i];
                }
                cantidadParticipantes ++;
            }

            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = cantidadParticipantes;
            respuesta[1] = tiempoPrimerCompetidor;
            respuesta[2] = tiempoUltimoCompetidor;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Carrera -> modo 2: " + Arrays.toString(respuesta));
        
        }else{
            
            // Inicializamos las variables
            tiempoPrimerCompetidor = Integer.MAX_VALUE;
            tiempoUltimoCompetidor = Integer.MIN_VALUE;
            cantidadParticipantes = 0;
            
            /* Hallamos la cantidad de participantes, valor maximo y valor minimo
            de los tiempos de los participantes */

            for (int participante:participantes) {
                tiempoPrimerCompetidor = Math.min(tiempoPrimerCompetidor, participante);
                tiempoUltimoCompetidor = Math.max(tiempoUltimoCompetidor, participante);
                cantidadParticipantes ++;
            }
    
            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = cantidadParticipantes;
            respuesta[1] = tiempoPrimerCompetidor;
            respuesta[2] = tiempoUltimoCompetidor;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Carrera -> modo 3: " + Arrays.toString(respuesta));
        }

        // Retornamos la variable respuesta
        return respuesta;
        
    }
}
