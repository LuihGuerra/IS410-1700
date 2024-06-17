/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;
/**
 *
 * @author Luih
 */
public class Smartphone {
    
    //propiedades
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int tamanioBateria;
    private Chip chip1;
    private Chip chip2;
    
    //constructor

    /**
     *
     * @param marca
     * @param modelo
     * @param almacenamiento
     * @param ram
     * @param tamanioBateria
     * @param chip1
     * @param chip2
     */
    
    public Smartphone(Fabricante marca, String modelo, int almacenamiento, int ram, int tamanioBateria, Chip chip1, Chip chip2){
            this.marca=marca;
            this.modelo=modelo;
            this.almacenamiento=almacenamiento;
            this.ram=ram;
            this.tamanioBateria=tamanioBateria;
            this.chip1=chip1;
            this.chip2=chip2;
            }
    public Smartphone(){}
    //metodos
    public Fabricante getFabricante(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAlmacenamiento(){
        return this.almacenamiento;
    }
    public  int getRam(){
        return this.ram;
    }
    public Chip getChip1(){
        return this.chip1;
    }
    public Chip getChip2(){
        return this.chip2;
    }
   public int getTamanioBateria(){
       return this.tamanioBateria;
   }
   
   public void setFabricante(Fabricante fabricante){
       if (fabricante!=null) {
           this.marca=fabricante;
       } else {
           System.out.println("Ingrese un valor Valido");
       }
       
   }
   public void setModelo(String modelo){
       if (modelo.isBlank()) {
           System.out.println("Ingrese un valor Valido");
       } else {
           this.modelo=modelo;
       }
   }
   public void setAlmacenamiento(int almacenamiento){
       if (almacenamiento<1){
           System.out.println("Ingrese un valor Valido");
       } else {
           this.almacenamiento=almacenamiento;
       }
   }
   public void setRam(int ram){
       if (ram<1){
           System.out.println("Ingrese un valor Valido");
       } else {
           this.ram=ram;
       }
   }
   public void setTamanioBateria(int tamanio){
       if (tamanio<1){
           System.out.println("Ingrese un valor Valido");
       } else {
           this.tamanioBateria=tamanio;
       }
   }
   
   public void setChip1(Chip chip1){
       if (chip1!=null) {
           this.chip1=chip1;
       } else {
           System.out.println("Ingrese un valor Valido");
       }
       
   }
   public void setChip2(Chip chip2){
       if (chip2!=null) {
           this.chip2=chip2;
       } else {
           System.out.println("Ingrese un valor Valido");
       }   
   }
   public void mostrarInformacion(){
       System.out.println("||     SMARTPHONE      ||");
       System.out.println("Fabricante");
       System.out.println("     Nombre: "+getFabricante().nombre);
       System.out.println("     Nombre: "+getFabricante().nombre);
       System.out.println("     Pais: "+getFabricante().pais);
       System.out.println("");
       System.out.println("Modelo: "+getModelo());
       System.out.println("");
       System.out.println("Almacenamiento: "+getAlmacenamiento()+" GB");
       System.out.println("");
       System.out.println("RAM: "+getRam()+" GB");
       System.out.println("");
       System.out.println("Tamanio de Bateria: "+getTamanioBateria()+" mA");
       System.out.println("");
       System.out.println("Tarjeta SIM 1");
       System.out.println("     Operador");
       System.out.println("         Nombre: "+getChip1().operador.nombre);
       System.out.println("         Pais: "+getChip1().operador.pais);
       System.out.println("     Numero: "+getChip1().numero);
       System.out.println("");
       System.out.println("Tarjeta SIM 2");
       System.out.println("     Operador");
       System.out.println("         Nombre: "+getChip2().operador.nombre);
       System.out.println("         Pais: "+getChip2().operador.pais);
       System.out.println("     Numero: "+getChip2().numero);
       
   }
}
