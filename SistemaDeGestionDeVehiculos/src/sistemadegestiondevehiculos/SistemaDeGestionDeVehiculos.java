/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadegestiondevehiculos;

/**
 *
 * @author Luih
 */
public class SistemaDeGestionDeVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Turismo t1 = new Turismo("Toyota", "Corolla", 2005, 300, 15, 4);
        
        t1.mostrarInformacion();
        
        Camion c1 = new Camion("Isuzu", "PHR", 2013, 450, 4, 1500);
        
        c1.mostrarInformacion();
        
        Moto m1 = new Moto("Yamaha", "MT15", 2018, 220, 8, 155);
        
        m1.mostrarInformacion();
    }
    
}
