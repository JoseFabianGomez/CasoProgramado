/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Andrey
 */
public class ControlVentanaCursos implements ActionListener{
    
    VentanaCursos cursos;
    public ControlVentanaCursos(VentanaCursos cursos)
    {
        this.cursos=cursos;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            
        }
        
    }
    
}
