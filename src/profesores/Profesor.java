/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

import alumnos.Persona;
import materias.Materias;

/**
 *
 * @author martaperal
 */
public class Profesor extends Persona {
   
    private Materias materia1, materia2; 

    public Profesor(Materias materia1, Materias materia2) {
        super();
        this.materia1 = materia1;
        this.materia2 = materia2;
    }
    public Materias getMateria1() {
        return materia1;
    }

    public void setMateria1(Materias materia1) {
        this.materia1 = materia1;
    }

    public Materias getMateria2() {
        return materia2;
    }

    public void setMateria2(Materias materia2) {
        this.materia2 = materia2;
    }
    
    
    
}
