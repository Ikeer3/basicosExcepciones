package CuentaBancaria;

public class MainCuenta {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Iker", "123456V");
        Cuenta cuenta1 = new Cuenta(cliente1, 1000);

        System.out.println("\n---ESTADO INICIAL---");
        cuenta1.estadoCuenta();

        System.out.println("\n---OPERACIONES---");
        cuenta1.ingresar(300);
        System.out.println("---------------------------------------------------");
        try {
            cuenta1.retirar(1500);
        } catch (SaldoMayorDisponibleException smde) {
            System.out.println("\nERROR!! Estás intentando retirar una cantidad superior a tu saldo");
        }
    }
}
