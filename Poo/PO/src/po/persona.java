/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class persona {
    private String nombre;
    private String fechaNacimiento;
    private int edad;
    //public persona() {
     //   JOptionPane.showMessageDialog(null, "SOY el constructor");
    //}
   public persona (String nombre, String fechaNacimiento, int edad) {
      this.nombre=nombre;
      this.fechaNacimiento=fechaNacimiento;
      this.edad=edad;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  public  void crearPersona(String nombre, String fechaNacimiento, int edad) {
      this.nombre = nombre;
      this.fechaNacimiento=fechaNacimiento;
      this.edad = edad;
  }  
    
    
}
