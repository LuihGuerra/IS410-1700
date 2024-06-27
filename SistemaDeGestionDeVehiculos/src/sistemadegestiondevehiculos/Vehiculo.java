/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestiondevehiculos;

/**
 *
 * @author Luih
 */
abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private int precioRenta;
    private int dias;
    
    public Vehiculo(String marca, String modelo, int anio, int precioRenta, int dias){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.precioRenta=precioRenta;
        this.dias=dias;
    }

    public String getMarca() {
        return marca;
    }
    public int getDias(){
        return dias;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getPrecioRenta(){
        return this.precioRenta;
    }

    public void setPrecioRenta(int precioRenta) {
        this.precioRenta = precioRenta;
    }
    
  
    public double calcularCostoRenta(){
        return 0;
    }
    
}
