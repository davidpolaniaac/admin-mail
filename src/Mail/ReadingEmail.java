/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail;

/**
 *
 * @author PC
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.*;
import javax.mail.*;
import javax.mail.event.MessageCountEvent;
import javax.mail.event.MessageCountListener;
import javax.swing.JOptionPane;

public class ReadingEmail {
    public static archivoLog archivo = new archivoLog(); //Instancia de la clase para utilizar sus metodos.
    public static void main(String[] args) throws GeneralSecurityException, MessagingException, IOException   
    {
        try{
            
            archivo.eventoInicio(); //Se llama al método Inicio log
            Gestor reading=new Gestor();
            reading.Leer();         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error General ");
        }
    }
}
