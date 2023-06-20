package clase10;

public class cuenta {
    private String titular;
    private double cantidad;

    public cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("Aquí los datos de la cuenta");
        System.out.println("Titular: "+getTitular());
        System.out.println("Cantidad: "+getCantidad());
    }

    public void ingresarCantidad(double monto){
        if(monto>0){
            this.cantidad+=monto;
            System.out.println("Ingreso de "+monto+" soles");
        }
    }

    public void retirarCantidad(double monto){
            this.cantidad-=monto;
        System.out.println("Egreso de "+monto+" soles");
    }


}
