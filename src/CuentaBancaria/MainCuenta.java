package CuentaBancaria;

public class MainCuenta {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Iker", "123456V");
        Cuenta cuenta1 = new Cuenta(cliente1, 1000);

        System.out.println("\n---ESTADO INICIAL---");
        cuenta1.estadoCuenta();

        System.out.println("\n---OPERACIONES---");
        try {
            cuenta1.ingresar(300);
        } catch (SaldoInferiorCeroException sice) {
            System.out.println("ERROR!! La cantidad a ingresar debe ser positiva");
        }
        System.out.println("---------------------------------------------------");
        try {
            cuenta1.retirar(1700);
        } catch (SaldoMayorDisponibleException smde) {
            System.out.println("ERROR!! No puedes retirar una cantidad superior a tu saldo");
            System.out.println("Estás intentando retirar " + smde.getCantidad() + "€");
        } catch (SaldoInferiorCeroException sice) {
            System.out.println("ERROR!! La cantidad a retirar debe ser positiva");
        }
    }
}
