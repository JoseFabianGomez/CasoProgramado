/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Vista.VentanaMatricula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey
 */
public class ArrayMatricula {
    
    private ArrayList <Matricula> arrayMatricula;
    String arregloInformacionConsultada[]=new String[4];
   // Controlador_FRM_Matricula controlador;
    ArrayCursos metodosCursos;
    ArrayEstudiante metodosEstudiantes;
    VentanaMatricula frm_Matricula;
   // ArchivoMatricula archivoM;
    
    public ArrayMatricula(ArrayEstudiante metodosEstudiantes,ArrayCursos metodosCursos/*,
,Controlador_FRM_Matricula controlador, FRM_Matricula frm_Matricula*/){
     
     arrayMatricula=new ArrayList<Matricula>();
     this.metodosCursos=metodosCursos;
     this.metodosEstudiantes=metodosEstudiantes;
     //this.controlador=controlador;
     //this.frm_Matricula=frm_Matricula;
     //archivoM=new ArchivoMatricula();
     //verificarArchivoMatricula();
    }
    /*public void verificarArchivoMatricula()
    {
        boolean verificar=archivoM.existeArchivo();
        if(verificar)
        {
            arrayMatricula=archivoM.leerInformacionCompletaMatricula();
            System.out.println("se cargaron los datos..");
        }
        else
        {
            archivoM.crearArchivoMatricula();
            System.out.println("se creo el archivo Matricula");
        }
        
    }
      public void guardarArchivoMatricula()
    {
        
        archivoM.crearArchivoMatricula();
        for(int i=0;i<arrayMatricula.size();i++)
        {
            archivoM.escribirInfoEnElArchivoMatricula(arrayMatricula.get(i));
        }
    }*/
    
    public void agregarMatricula(String informacion[])
    {
        Matricula temporal=new Matricula(informacion[0], informacion[1], informacion[2],true);
        arrayMatricula.add(temporal);
    }
    
    public void mostrarInformacion()
    {
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            System.out.println(arrayMatricula.get(contador).infoMatricula());
        }
    
    }
    public boolean consultarMatricula(String codigo)
    {
        boolean existe=false;
        
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(codigo)&& (arrayMatricula.get(contador).isEstado()==true))
            {
                arregloInformacionConsultada[0]=codigo;
                arregloInformacionConsultada[1]=arrayMatricula.get(contador).getCedula();
                metodosEstudiantes.consultarEstudiante(arrayMatricula.get(contador).getCedula());
                arregloInformacionConsultada[2]=metodosEstudiantes.getArregloInformacion()[0];
                arregloInformacionConsultada[3]=arrayMatricula.get(contador).getSigla();
                //frm_Matricula.agregarInformacionTabla(arregloInformacionConsultada);
                existe=true;
            }
        }
        return existe;
    }
    
    public void modificarMatricula(String arreglo[])
    {
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(arreglo[0]))
            {
                arrayMatricula.get(contador).setCedula(arreglo[1]);
                arrayMatricula.get(contador).setSigla(arreglo[2]);
            }
        }
    }
    
    public void eliminarMatricula(String codigo)
    {
        for(int contador=0;contador<arrayMatricula.size();contador++)
        {
            if(arrayMatricula.get(contador).getCodigo().equals(codigo))
            {
               // arrayMatricula.remove(arrayMatricula.get(contador));
                arrayMatricula.get(contador).setEstado(false);
                JOptionPane.showMessageDialog(null,"Llegoa eliminar");
            }
        }
        
    }
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    } 
    
    public String devolverCodigo(){
        String codigo="0000";
        if(arrayMatricula.size()==0)
        {
          codigo+=1;
        }else{
         int numero=Integer.parseInt(arrayMatricula.get(arrayMatricula.size()-1).getCodigo());
         numero++;
         codigo="0000"+numero;
        }
        codigo=codigo.substring(codigo.length()-5,codigo.length());
        return codigo;
    }
    
}
