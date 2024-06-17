/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Computadores {
    
    private String kapcMarcaComp;
    private int kapcCantidadMem;
    private String kapcCaracteristicasPro;
    private String kapcSistemaOperativo;
    private Double kapcPrecioComp;

    public Computadores() {
    }

    public Computadores(String kapcMarcaComp, int kapcCantidadMem, String kapcCaracteristicasPro, String kapcSistemaOperativo, Double kapcPrecioComp) {
        this.kapcMarcaComp = kapcMarcaComp;
        this.kapcCantidadMem = kapcCantidadMem;
        this.kapcCaracteristicasPro = kapcCaracteristicasPro;
        this.kapcSistemaOperativo = kapcSistemaOperativo;
        this.kapcPrecioComp = kapcPrecioComp;
    }

    public String getKapcMarcaComp() {
        return kapcMarcaComp;
    }

    public void setKapcMarcaComp(String kapcMarcaComp) {
        this.kapcMarcaComp = kapcMarcaComp;
    }

    public int getKapcCantidadMem() {
        return kapcCantidadMem;
    }

    public void setKapcCantidadMem(int kapcCantidadMem) {
        this.kapcCantidadMem = kapcCantidadMem;
    }

    public String getKapcCaracteristicasPro() {
        return kapcCaracteristicasPro;
    }

    public void setKapcCaracteristicasPro(String kapcCaracteristicasPro) {
        this.kapcCaracteristicasPro = kapcCaracteristicasPro;
    }

    public String getKapcSistemaOperativo() {
        return kapcSistemaOperativo;
    }

    public void setKapcSistemaOperativo(String kapcSistemaOperativo) {
        this.kapcSistemaOperativo = kapcSistemaOperativo;
    }

    public Double getKapcPrecioComp() {
        return kapcPrecioComp;
    }

    public void setKapcPrecioComp(Double kapcPrecioComp) {
        this.kapcPrecioComp = kapcPrecioComp;
    }
     
     public void imprimir (){
         System.out.println("***** Datos Computador ****" +
         "Marca Computador: " + getKapcMarcaComp() +
         "Cantidad de Memoria: " +  getKapcCantidadMem() +
         "Caracteristicas del Procesador: " + getKapcCaracteristicasPro() +
         "Sistema Operativo: " + getKapcSistemaOperativo() +
         "Precio Computador: " + getKapcPrecioComp());
     
        
    }
    
    
}
