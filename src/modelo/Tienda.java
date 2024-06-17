/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Tienda {
    private String kapcNombreTienda;
    private String kapcPropietarioTienda;
    private String kapcIdentificadorTributario;

    public Tienda() {
    }

    public Tienda(String kapcNombreTienda, String kapcPropietarioTienda, String kapcIdentificadorTributario) {
        this.kapcNombreTienda = kapcNombreTienda;
        this.kapcPropietarioTienda = kapcPropietarioTienda;
        this.kapcIdentificadorTributario = kapcIdentificadorTributario;
    }

    public String getKapcNombreTienda() {
        return kapcNombreTienda;
    }

    public void setKapcNombreTienda(String kapcNombreTienda) {
        this.kapcNombreTienda = kapcNombreTienda;
    }

    public String getKapcPropietarioTienda() {
        return kapcPropietarioTienda;
    }

    public void setKapcPropietarioTienda(String kapcPropietarioTienda) {
        this.kapcPropietarioTienda = kapcPropietarioTienda;
    }

    public String getKapcIdentificadorTributario() {
        return kapcIdentificadorTributario;
    }

    public void setKapcIdentificadorTributario(String kapcIdentificadorTributario) {
        this.kapcIdentificadorTributario = kapcIdentificadorTributario;
    }
    
    public void imprimir (){
        System.out.println(" ****** Datos de la Tienda****** "+
                "Nombre Tienda: " + getKapcNombreTienda() +
                "Propietario de la Tienda: " + getKapcPropietarioTienda() +
                "Identificador Tributario: " + getKapcIdentificadorTributario() );
        
        
    }
}
