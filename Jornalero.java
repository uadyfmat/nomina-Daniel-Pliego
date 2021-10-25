public class Jornalero extends Empleado {
    public int totalHorasJornalero = 0;
    public double totalNominaJornalero = 0;
    public int totalJornaleros = 0;

    public Jornalero(String nombre, double numHorasTrabajadas) {
        super(nombre, numHorasTrabajadas);

    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        totalHorasJornalero += numHorasTrabajadas;
        totalJornaleros++;
        int numHorasNormales = 50;
        double salarioHorasNormales, salarioHorasExtra;
        if ((numHorasTrabajadas - numHorasNormales) > 0) {
            int numHorasExtra = numHorasTrabajadas - numHorasNormales;
            salarioHorasExtra = super.calcularSalario(numHorasExtra, tarifa * 2);
            salarioHorasNormales = super.calcularSalario(numHorasNormales, tarifa);
            double salarioTotal = salarioHorasExtra + salarioHorasNormales;
            super.setSalario(salarioTotal);
            totalNominaJornalero += salarioTotal;
            return (salarioTotal);
        } else {
            totalNominaJornalero += super.calcularSalario(numHorasTrabajadas, tarifa);
            return super.calcularSalario(numHorasTrabajadas, tarifa);
        }

    }

    public String toString() {
        return super.toString();
    }

}
