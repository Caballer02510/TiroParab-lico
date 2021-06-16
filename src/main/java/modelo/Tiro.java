/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static modelo.Utilidades.gradosAradianes;

/**
 *
 * @author SergioCaballeroSáez
 */
public class Tiro {
    //TODOS LOS PRIVATES DOUBLE SE PODRIAN PONER JUNTOS CON COMAS, PERO PREFIERO HACERLO EN EL ORDEN DE LA HOJA.
    private double velocidadInicial;
    private int angulo;
    private double valorGravedad;
    private double alcanceMaximo;
    private double alturaMaxima;
    
    public Tiro(double velocidadInicial, int angulo){
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        
        double gravedad = 9.8;
        
        alcanceMaximo=(velocidadInicial)*(velocidadInicial)*Math.sin(2*gradosAradianes(angulo))/gravedad;
        alturaMaxima=(velocidadInicial)*(velocidadInicial)*((Math.sin(gradosAradianes(angulo)))*Math.sin(gradosAradianes(angulo)))/2*gravedad;
        
        
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public int getAngulo() {
        return angulo;
    }

    public double getValorGravedad() {
        return valorGravedad;
    }

    public double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    
    
    
    
}
