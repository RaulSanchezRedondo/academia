/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos;

import alumnos.Alumnos;
import alumnos.Persona;
import aulas.Aulas;
import aulas.Clases;
import materias.Materias;
import profesores.Profesor;

/**
 *
 * @author martaperal
 */
public class Cursos extends Persona { 
    
    private String fechaInicio; 
    private String fechaFin; 
    private Materias materia1,materia2; 
    private Alumnos alumno1, alumno2,alumno3; 
    private Profesor profesor1,profesor2; 
    private Enum<Clases> aula1,aula2; 
    //
    private Aulas aula11,aula22;

    public Cursos(String fechaInicio, String fechaFin, Materias materia1, Materias materia2, Alumnos alumno1, Alumnos alumno2, Alumnos alumno3, Profesor profesor1, Profesor profesor2, Enum<Clases> aula1, Enum<Clases> aula2) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.alumno1 = alumno1;
        this.alumno2 = alumno2;
        this.alumno3 = alumno3;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.aula1 = aula1;
        this.aula2 = aula2;
    }
    
    

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
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

    public Alumnos getAlumno1() {
        return alumno1;
    }

    public void setAlumno1(Alumnos alumno1) {
        this.alumno1 = alumno1;
    }

    public Alumnos getAlumno2() {
        return alumno2;
    }

    public void setAlumno2(Alumnos alumno2) {
        this.alumno2 = alumno2;
    }

    public Alumnos getAlumno3() {
        return alumno3;
    }

    public void setAlumno3(Alumnos alumno3) {
        this.alumno3 = alumno3;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Enum<Clases> getAula1() {
        return aula1;
    }

    public void setAula1(Enum<Clases> aula1) {
        this.aula1 = aula1;
    }

    public Enum<Clases> getAula2() {
        return aula2;
    }

    public void setAula2(Enum<Clases> aula2) {
        this.aula2 = aula2;
    }
    
    


    }
    
    

 
    

