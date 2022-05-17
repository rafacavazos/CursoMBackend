package semana1;

public class Producto {
    private String marca;
    private String categoria;
    private String descripcion;
    private double precio;

    public Producto(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca(){return marca;}
    public String getCategoria() {return categoria;}
    public String getDescripción() {return descripcion;}
    public double getPrecio(){return precio;}

    public boolean setMarca(String marca){
        if (marca != ""){
            this.marca = marca;
            return true;
        }else{
            return false;
        }
    }

    public boolean setCategoria(String categoria) {
        if (categoria != "") {
            this.categoria = categoria;
            return true;
        } else {
            return false;
        }
    }

    public boolean setDescripcion(String descripcion) {
        if (descripcion != "") {
            this.descripcion = descripcion;
            return true;
        } else {
            return false;
        }
    }
}
