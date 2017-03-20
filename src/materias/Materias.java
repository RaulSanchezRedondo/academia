/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materias;

/**
 *
 * @author martaperal
 */
public class Materias { 
    
    public static final String JAVA="java"; //Constante de clase
    public static  String JAVAhome="java"; //Constante de objeto
    private String java; 
    private String angularJs; 
    private String rubyAndRails; 
    private String aspNet;

    public static String getJAVAhome() {
        return JAVAhome;
    }

    public static void setJAVAhome(String JAVAhome) {
        Materias.JAVAhome = JAVAhome;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getAngularJs() {
        return angularJs;
    }

    public void setAngularJs(String angularJs) {
        this.angularJs = angularJs;
    }

    public String getRubyAndRails() {
        return rubyAndRails;
    }

    public void setRubyAndRails(String rubyAndRails) {
        this.rubyAndRails = rubyAndRails;
    }

    public String getAspNet() {
        return aspNet;
    }

    public void setAspNet(String aspNet) {
        this.aspNet = aspNet;
    }
    
    
    
}
