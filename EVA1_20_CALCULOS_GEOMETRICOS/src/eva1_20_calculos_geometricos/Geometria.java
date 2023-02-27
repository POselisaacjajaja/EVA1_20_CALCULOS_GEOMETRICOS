/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author isaaczapatto
 */
public class Geometria {
    //Constantes:
    public static final double PI = 3.1416;
    
    //Perímetro de un círculo
    public static double perímetroCírculo(double radio){
        return PI*(radio*2);
    }
    //Área de un círculo
    public static double areaCírculo(double radio){
        return PI*(radio*radio);
    }
    
    //Volumen de un círculo
    public static double volumenEsfera(double radio){
        return (4.0)/(3.0) * (PI*(radio*radio*radio));
    }
}
