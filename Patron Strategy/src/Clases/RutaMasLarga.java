package Clases;

import Interfaz.RutaStrategy;

public class RutaMasLarga implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta más larga entre " + puntoA + " y " + puntoB;
    }
}
