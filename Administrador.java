public class Administrador extends Empleado {
    public int totalHorasAdministrador = 0;
    public double totalNominaAdministrador = 0;
    public int totalAdministradores = 0;

    public Administrador(String nombre, double numHorasTrabajadas) {
        super(nombre, numHorasTrabajadas);
    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        totalHorasAdministrador += numHorasTrabajadas;
        totalAdministradores++;
        if (numHorasTrabajadas >= 80) {
            totalNominaAdministrador += super.calcularSalario(numHorasTrabajadas, tarifa * 1.3);
            return super.calcularSalario(numHorasTrabajadas, tarifa * 1.3);
        } else {
            totalNominaAdministrador += super.calcularSalario(numHorasTrabajadas, tarifa * 1.2);
            return super.calcularSalario(numHorasTrabajadas, tarifa * 1.2);
        }

    }

    public String toString() {
        return super.toString();
    }
}