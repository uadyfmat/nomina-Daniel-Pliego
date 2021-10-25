public class Administrador extends Empleado {
    private double compensacion;

    public Administrador(String nombre, double numHorasTrabajadas) {
        super(nombre, numHorasTrabajadas);
    }

    public double getCompensacion() {
        return this.compensacion;
    }

    public void setCompensacion(double compensacion) {
        this.compensacion = compensacion;
    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        if (numHorasTrabajadas >= 80) {
            this.setCompensacion(1.3);
            return super.calcularSalario(numHorasTrabajadas, tarifa * 1.3);
        } else {
            this.setCompensacion(1.2);
            return super.calcularSalario(numHorasTrabajadas, tarifa * 1.2);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}