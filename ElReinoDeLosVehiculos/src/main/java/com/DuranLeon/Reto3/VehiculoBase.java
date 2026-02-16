public abstract class VehiculoBase implements Vehiculo {
    protected String tipo;
    protected String categoria;
    
    public VehiculoBase(String tipo, String categoria) {
        this.tipo = tipo;
        this.categoria = categoria;
    }
    
    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public String getCategoria() {
        return categoria;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Velocidad máxima: " + getVelocidadMaxima() + " km/h");
        System.out.println("Precio: $" + String.format("%,.0f", getPrecio()));
        System.out.println("Equipamiento: " + getEquipamiento());
    }
}
