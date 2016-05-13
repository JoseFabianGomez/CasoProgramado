/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Andrey
 */
public class ControlVentanaPrincipal implements ActionListener {
    
    VentanaPrincipal principal;
    
    public ControlVentanaPrincipal(VentanaPrincipal principal)
    {
        this.principal=principal;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Estudiante"))
        {
            
        }
        if(e.getActionCommand().equals("Cursos"))
        {
            
        }
        if(e.getActionCommand().equals("Matricula"))
        {
            
        }
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
    }
}
