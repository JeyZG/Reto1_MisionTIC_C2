package Tienda;

import java.util.Arrays;

public class Solution {

    public static int[] reporte(int[] compra) {

        // Declaracion e inicializacion de variables
        // Array tipo int de 3 posiciones
        int[] respuesta = new int[3];

        // Ciclo for para hallar el costo total de la compra
        for (int i = 0; i < compra.length; i++) {
            respuesta[0] += compra[i];
        }

        // Ordenamos la lista de forma ascendente
        Arrays.sort(compra);

        // El producto mas barato es el primer indice de la lista
        respuesta[1] = compra[0];

        // El producto mas caro es el ultimo indice de la lista
        respuesta[2] = compra[compra.length - 1];

        System.out.println("respuesta Tienda -> modo 1: " + Arrays.toString(respuesta));

        // Retornamos la variable respuesta
        return respuesta;

    }

    public static int[] reporte(int[] compra, boolean modo) {

        // Declaracion e inicializacion de variables
        // Array tipo int de 3 posiciones
        int[] respuesta = new int[3];
        int totalCompra = 0, productoMasBarato, productoMasCaro;

        if (modo) {

            // Inicializamos las variables
            productoMasBarato = Integer.MAX_VALUE;
            productoMasCaro = Integer.MIN_VALUE;
            totalCompra = 0;

            /* Hallamos el total de la compra, el producto mas caro
            y el producto mas barato */
            for (int i = 0; i < compra.length; i++) {
                if (compra[i] < productoMasBarato){
                    productoMasBarato = compra[i];
                }
                if (compra[i] > productoMasCaro){
                    productoMasCaro = compra[i];
                }
                totalCompra += compra[i];
            }

            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = totalCompra;
            respuesta[1] = productoMasBarato;
            respuesta[2] = productoMasCaro;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Tienda -> modo 2: " + Arrays.toString(respuesta));

        }else{

            // Inicializamos las variables
            productoMasBarato = Integer.MAX_VALUE;
            productoMasCaro = Integer.MIN_VALUE;
            totalCompra = 0;

            /* Hallamos el total de la compra, el producto mas caro
            y el producto mas barato */
            for (int precio:compra) {
                productoMasBarato = Math.min(productoMasBarato, precio);
                productoMasCaro = Math.max(productoMasCaro, precio);
                totalCompra += precio;
            }
            // Le asignamos los valores a cada posicion del array respuesta
            respuesta[0] = totalCompra;
            respuesta[1] = productoMasBarato;
            respuesta[2] = productoMasCaro;

            // Imprimimos el array con el resultado
            System.out.println("respuesta Tienda -> modo 3: " + Arrays.toString(respuesta));

        }

        // Retornamos la variable respuesta
        return respuesta;

    }

}
