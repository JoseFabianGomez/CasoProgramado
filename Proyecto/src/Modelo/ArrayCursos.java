/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class ArrayCursos {
    
     private ArrayList <Cursos> arrayCursos;
    String arregloInformacionConsultada[]=new String[3];
    ArchivoCurso archivoC;
    
    public ArrayCursos()
    {
        arrayCursos=new ArrayList <Cursos>();
        archivoC=new ArchivoCurso();
        verificarArchivoCurso();
    }
    public void verificarArchivoCurso()
    {
        boolean verificar=archivoC.existeArchivoCurso();
        if(verificar)
        {
            arrayCursos=archivoC.leerInformacionCompletaCursos();
            System.out.println("se cargaron los datos de curso");
        }
        else
        {
            archivoC.crearArchivoCurso();
            System.out.println("se creo el archivo  de cursos");
        }
        
    }
    public void guardarArchivoCurso()
    {
        archivoC.crearArchivoCurso();
        for(int i=0;i<arrayCursos.size();i++)
        {
            archivoC.escribirInfoEnElArchivoCurso(arrayCursos.get(i));
        }
    }
    public void agregarCurso(String informacion[])
    {
        Cursos temporal=new Cursos(informacion[0], informacion[1], Integer.parseInt(informacion[2]), informacion[3]);
        arrayCursos.add(temporal);
        
    }
    public void mostrarInformacion()
    {
        for(int contador=0;contador<arrayCursos.size();contador++)
        {
            //System.out.println(arrayCursos.get(contador).getInformacion());
        
        }
    
    }
    public boolean consultarCurso(String sigla)
    {
        boolean existe=false;
        
        for(int contador=0;contador<arrayCursos.size();contador++)
        {
            if(arrayCursos.get(contador).getSigla().equals(sigla))
            {
                arregloInformacionConsultada[0]=arrayCursos.get(contador).getNombre();
                arregloInformacionConsultada[1]=""+arrayCursos.get(contador).getCreditos();
                arregloInformacionConsultada[2]=arrayCursos.get(contador).getHorario();
                existe=true;
            }
        
        }
        return existe;
    
    }
    public void modificarCurso(String arreglo[])
    {
        for(int contador=0;contador<arrayCursos.size();contador++)
        {
            if(arrayCursos.get(contador).getSigla().equals(arreglo[0]))
            {
                arrayCursos.get(contador).setNombre(arreglo[1]);
                arrayCursos.get(contador).setCreditos(Integer.parseInt(arreglo[2]));
                arrayCursos.get(contador).setHorario(arreglo[3]);
            }
        }
    }
    public void eliminarCurso(String arreglo[])
    {
        for(int contador=0;contador<arrayCursos.size();contador++)
        {
            if(arrayCursos.get(contador).getSigla().equals(arreglo[0]))
            {
                arrayCursos.remove(arrayCursos.get(contador));
    
            }
        }
    }
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    } 
    
}
