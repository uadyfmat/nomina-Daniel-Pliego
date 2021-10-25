public class Jornalero extends Empleado {
    private double horasExtra;

    public double getHorasExtra() {
        return this.horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Jornalero(String nombre, double numHorasTrabajadas) {
        super(nombre, numHorasTrabajadas);

    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        int numHorasNormales = 50;
        double salarioHorasNormales, salarioHorasExtra;
        if ((numHorasTrabajadas - numHorasNormales) > 0) {
            this.horasExtra = numHorasTrabajadas - numHorasNormales;
            salarioHorasExtra = super.calcularSalario((int) this.horasExtra, tarifa * 2);
            salarioHorasNormales = super.calcularSalario(numHorasNormales, tarifa);
            double salarioTotal = salarioHorasExtra + salarioHorasNormales;
            super.setSalario(salarioTotal);
            return (salarioTotal);
        } else {
            return super.calcularSalario(numHorasTrabajadas, tarifa);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
