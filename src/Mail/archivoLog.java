/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author PC
 */
public class archivoLog {
    FileWriter archivo ;//nuestro archivo log
    
    public void crearLog(String Operacion) throws IOException {

        //Pregunta el archivo existe, caso contrario crea uno con el nombre log.txt
        if (new File("log.txt").exists()==false)
        {
             archivo=new FileWriter(new File("log.txt"),false);}
             archivo = new FileWriter(new File("log.txt"), true);
             Calendar fechaActual = Calendar.getInstance(); //Para poder utilizar el paquete calendar     
             //Empieza a escribir en el archivo
             archivo.write((String.valueOf(fechaActual.get(Calendar.DAY_OF_MONTH))
                  +"/"+String.valueOf(fechaActual.get(Calendar.MONTH)+1)
                  +"/"+String.valueOf(fechaActual.get(Calendar.YEAR))
                  +";"+String.valueOf(fechaActual.get(Calendar.HOUR_OF_DAY))
                  +":"+String.valueOf(fechaActual.get(Calendar.MINUTE))
                  +":"+String.valueOf(fechaActual.get(Calendar.SECOND)))+";"+Operacion+"\r\n");
             archivo.close(); //Se cierra el archivo
    }//Fin del metodo crearLog
    
    public void eventoInicio() throws IOException {   
        this.crearLog("Inicio del programa");
    }
    public void descargaArchivo(String nombre) throws IOException{
        this.crearLog("Descarga de arhvio :"+ nombre);
    }
    public void GuardaArchivo(String nombre) throws IOException{
        this.crearLog("Guarda archivo :"+nombre); 
    }
    public void leerMensaje(String nombre) throws IOException{
        this.crearLog("leido el mensaje:"+nombre); 
    }
    public void conexionExitosa() throws IOException{
        this.crearLog("Conexion exitosa"); 
    }
    public void conexionFallida() throws IOException{
        this.crearLog("Conexion fallida"); 
    }
    public void crearDatos() throws IOException{
        this.crearLog("creacion de datos.bin"); 
    }
    
}
