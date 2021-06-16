/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author SergioCaballeroSáez
 */
public class Utilidades {
    public static ArrayList<String> angulos(){
        ArrayList<String> angulos = new ArrayList();
        int grados = 0;
        for(int i=0; i < 19; i++){
            angulos.add(String.valueOf(grados));
            grados = grados + 10;
        }
        return angulos;
        
        
    }
    
    public static double gradosAradianes(int grados){
        double angulo = grados*Math.PI/180;
        return grados;
       
        
    }
    
    public static ArrayList<Coordenada> getCoordenadas(double alcanceMaximo, double velocidadInicial, int angulo){
        int alcance = 0;
        double intervalo = alcance /10;
        ArrayList<Coordenada> listaCoordenadas = new ArrayList<Coordenada>();
        for(int i=0; i<10; i++){
            double x = i*intervalo;
            double y = x*Math.tan(Utilidades.gradosAradianes(angulo))-9.8*Math.pow(x, 2)/(2*Math.pow(velocidadInicial, 2)) * Math.pow(gradosAradianes(angulo), 2);
            Coordenada micoordenada = new Coordenada(x,y);
            listaCoordenadas.add(micoordenada);
            
        }
        return listaCoordenadas;
    }
        
}
    

