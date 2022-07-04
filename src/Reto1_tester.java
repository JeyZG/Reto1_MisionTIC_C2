public class Reto1_tester {
    
    public static void main(String[] args) {
        
        /* 
        Para cada metodo hay 3 parametros:
        1. Llama al metodo reporte(int), solo pasando el parametro del arrray de participantes
           Se usa el metodo de calculo aplicando la Clase Arrays
        2. Llama al metodo reporte(int, boolean), pasando el array de participantes y true
           Se usa el for para comparar valor por valor y hallar el mayor y menor valor
        3. Llama al metodo reporte(int, boolean), pasando el array de participantes y false
           Se usa el for-each y el metodo Math para hallar el mayor y menor valor
        */ 
        
        // Llamada de los metodos a testear
        Carrera_tester(1);
        Notas_tester(1);
        Tienda_tester(1);

    }

    public static void Carrera_tester(int modo){

        // Arrays para probar el metodo reporte
        int[] participantes = {19, 22, 21, 25, 32, 38, 16, 31, 30, 26, 19, 17, 23};
        //int[] participantes = {26, 17, 23, 16, 24, 21, 18, 25, 22, 20, 19};
        //int[] participantes = {1801, 1806, 2094, 2075, 2044, 1634, 1735, 1616, 1998, 210, 9, 2078, 2141, 1851, 2171, 1846, 2167, 1967, 2036};                              
        //int[] participantes = {1785, 1712, 1680, 1615, 1777, 1726, 1675, 1705, 1607, 163, 5, 1745, 1731, 1760, 1799, 1679, 1718, 1664, 1778};
        //int[] participantes = {1764, 1933, 1970, 1734, 2117, 2140, 1657, 1962, 1963};   
        //int[] participantes = {1671, 1929, 2070, 2062, 2056, 2100, 1938, 1695, 2116};
        
        // Seleccion del caso segun el parametro modo
        switch (modo) {
            case 1 -> Carrera.Solution.reporte(participantes);
            case 2 -> Carrera.Solution.reporte(participantes, true);
            case 3 -> Carrera.Solution.reporte(participantes, false);
            default -> System.out.println("Modo de ejecucion no valido");
        }
    }

    public static void Notas_tester(int modo){
        
        // Arrays para probar el metodo reporte
        double[] listaNotas = {4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0};
        //double[] listaNotas = {0.5, 2.0, 4.3, 2.0, 1.7, 1.8, 2.1, 0.4, 3.6, 3.0};
        //double[] listaNotas = {3.4, 4.5, 1.8, 3.4, 0.5, 0.4, 2.4, 2.0, 2.9, 3.2};
        //double[] listaNotas = {4.3, 2.4, 2.4, 2.0, 1.8, 4.0, 3.6, 2.3, 4.4, 1.5};
        //double[] listaNotas = {0.5, 0.7, 4.2, 3.6, 4.4, 2.2, 2.4, 3.5, 3.7, 0.6};
        
        // Seleccion del caso segun el parametro modo
        switch (modo) {
            case 1 -> Notas.Solution.reporte(listaNotas);
            case 2 -> Notas.Solution.reporte(listaNotas, true);
            case 3 -> Notas.Solution.reporte(listaNotas, false);
            default -> System.out.println("Modo de ejecucion no valido");
        }
    }

    public static void Tienda_tester(int modo){
        
        // Arrays para probar el metodo reporte
        int[] compra = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        //int[] compra = {3240, 9048, 2310, 4680, 3968, 6000, 13120, 5980, 7240, 29900, 19, 3600};
        //int[] compra = {9653, 3918, 6048, 5840, 3840, 3696, 2432};
        //int[] compra = {100, 2300};
        //int[] compra = {6700};   
        
        // Seleccion del caso segun el parametro modo
        switch (modo) {
            case 1 -> Tienda.Solution.reporte(compra);
            case 2 -> Tienda.Solution.reporte(compra, true);
            case 3 -> Tienda.Solution.reporte(compra, false);
            default -> System.out.println("Modo de ejecucion no valido");
        }
    }
}
