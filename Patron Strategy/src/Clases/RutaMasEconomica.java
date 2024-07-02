package Clases;

import Interfaz.RutaStrategy;

public class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}
