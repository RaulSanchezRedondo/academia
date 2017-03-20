/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

/**
 *
 * @author martaperal
 */
public class Aulas {
    
    private String aulaJava; 
    private String aulaAngular; 
    private String aulaAspNet; 
    private String aulaRuby;
    //Constantes de objeto
    static  int CAPACIDAD=5; 
    static  String METROS="30m2"; 
   
    
    
    

    public String getAulaJava() {
        return aulaJava;
    }

    

    public static int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public static String getMETROS() {
        return METROS;
    }

    public void setAulaJava(String aulaJava) {
        this.aulaJava = aulaJava;
    }

    public String getAulaAngular() {
        return aulaAngular;
    }

    public void setAulaAngular(String aulaAngular) {
        this.aulaAngular = aulaAngular;
    }

    public String getAulaAspNet() {
        return aulaAspNet;
    }

    public void setAulaAspNet(String aulaAspNet) {
        this.aulaAspNet = aulaAspNet;
    }

    public String getAulaRuby() {
        return aulaRuby;
    }

    public void setAulaRuby(String aulaRuby) {
        this.aulaRuby = aulaRuby;
    }


    
    
    
    
    
}
