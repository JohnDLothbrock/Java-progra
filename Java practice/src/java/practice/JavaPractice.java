/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.practice;

import javax.swing.JOptionPane;

public class JavaPractice {

   
    public static void main(String[] args) {
        
        
        String correo;
        String nombre="";
        String entrada="";
        String lectura="";
        int edad=15;
        double altura;
        char letra;
        boolean respuesta;
        
        nombre=JOptionPane.showInputDialog("Digite su nombre");
        
        entrada=JOptionPane.showInputDialog("Digite su edad");
        edad=Integer.parseInt(entrada);
        
        lectura=JOptionPane.showInputDialog("Digite su altura");
        altura=Double.parseDouble(lectura);
        
        lectura=lectura+5;
        altura=altura+5;
        
        entrada=entrada+10;
        edad=edad+10;
        
        
        JOptionPane.showMessageDialog(null, "Buenas noches "+nombre+"\nEn 10 años usted tendrá= "+entrada+" String"+"\nEn 10 años usted tendrá="+edad+" Entero");
        JOptionPane.showMessageDialog(null, "Buenas noches "+nombre+"\nSi usted crece 5cm medirá= "+lectura+" String"+"\nSi usted crece 5cm medirá="+altura+" Entero");
      
        
        if(edad>=18)
        {
            JOptionPane.showMessageDialog(null, "Felicidades si puede votar");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No puede votar, debe esperar a cumplir los 18 años");
        }
        
        
    }
    
}
