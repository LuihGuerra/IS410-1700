/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestiondevehiculos;

/**
 *
 * @author Luih
 */
public class Camion extends Vehiculo implements Aseguranza{
    private int capaciodDeCarga;
    private int dias;
    public Camion(String marca, String modelo, int anio, int precioRenta, int dias, int capaciodDeCarga) {
        super(marca, modelo, anio, precioRenta, dias);
        this.capaciodDeCarga=capaciodDeCarga;
        this.dias=dias;
        
    }

    public int getCapacidadDeCarga() {
        return capaciodDeCarga;
    }

    @Override
    public double calcularCostoRenta(){
        return (this.getDias()*this.getPrecioRenta())*1.20;   
    }

    @Override
    public double calcularCostoAseguranza() {
        return (this.getAnio()*0.015)*this.getPrecioRenta();
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Sistema de Gestion de Vehiculos");
        System.out.println("");
        System.out.println("Vehiculo: ");
        System.out.println("    Marca: "+getMarca());
        System.out.println("    Modelo: "+getModelo());
        System.out.println("    Año: "+getAnio());
        System.out.println("    Capacidad de Carga: "+getCapacidadDeCarga()+" Libras");
        System.out.println("");
        System.out.println("Precio de Renta: "+getPrecioRenta());
        System.out.println("Costo de la Renta: "+calcularCostoRenta());
        System.out.println("Aseguranza: "+calcularCostoAseguranza());
        System.out.println("");
    }
    
}
