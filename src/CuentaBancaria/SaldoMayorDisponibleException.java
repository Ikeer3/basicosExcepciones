package CuentaBancaria;

public class SaldoMayorDisponibleException extends Exception {

    private int cantidad;

    public SaldoMayorDisponibleException (int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
