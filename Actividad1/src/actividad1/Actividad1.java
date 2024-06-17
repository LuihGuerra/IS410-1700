/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;


/**
 *
 * @author Luih
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smartphone s1 =new Smartphone(); 
        Fabricante f1= new Fabricante("Samsung", "Corea del Sur");
        Operador o1= new Operador("Tigo", "Honduras");
        Operador o2=new Operador("Claro", "Guatemala");
        Chip c1= new Chip(o1, 99887766);
        Chip c2=new Chip(o2, 33224455);
        
        s1.setAlmacenamiento(1000);
        s1.setFabricante(f1);
        s1.setChip1(c1);
        s1.setChip2(c2);
        s1.setModelo("S22 Ultra");
        s1.setRam(16);
        s1.setTamanioBateria(6000);
        s1.mostrarInformacion();
       
        
    
    }
    
}
