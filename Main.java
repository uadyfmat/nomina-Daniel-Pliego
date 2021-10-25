public class Main {
  public static void main(String[] args) {

    final int tarifa = 15;

    Administrador[] administradores = new Administrador[2];
    Jornalero[] jornaleros = new Jornalero[2];
    int contadorJornaleros = 0;
    int contadorAdministradores = 0;

    double totalNominaJornalero = 0;
    double totalNominaAdministradores = 0;

    double totalHorasJornalero = 0;
    double totalHorasAdministradores = 0;

    administradores[contadorAdministradores] = new Administrador("Daniel", 80);
    totalNominaAdministradores += administradores[contadorAdministradores].calcularSalario(80, tarifa);
    System.out.println(administradores[contadorAdministradores]);
    totalHorasAdministradores += administradores[contadorAdministradores].getNumHorasTrabajadas();
    contadorAdministradores++;

    administradores[contadorAdministradores] = new Administrador("Fernan", 48);
    totalNominaAdministradores += administradores[contadorAdministradores].calcularSalario(48, tarifa);
    System.out.println(administradores[contadorAdministradores]);
    totalHorasAdministradores += administradores[contadorAdministradores].getNumHorasTrabajadas();
    contadorAdministradores++;

    jornaleros[contadorJornaleros] = new Jornalero("Tony", 84);
    totalNominaJornalero += jornaleros[contadorJornaleros].calcularSalario(84, tarifa);
    System.out.println(jornaleros[contadorJornaleros]);
    totalHorasJornalero += jornaleros[contadorJornaleros].getNumHorasTrabajadas();
    contadorJornaleros++;

    jornaleros[contadorJornaleros] = new Jornalero("Teo", 24);
    totalNominaJornalero += jornaleros[contadorJornaleros].calcularSalario(24, tarifa);
    System.out.println(jornaleros[contadorJornaleros]);
    totalHorasJornalero += jornaleros[contadorJornaleros].getNumHorasTrabajadas();
    contadorJornaleros++;

    System.out.println("\n\nLa nomina total a pagar es: " + (totalNominaAdministradores + totalNominaJornalero));
    System.out.println("La nomina total de los administradores es: " + totalNominaAdministradores);
    System.out.println("La nomina total de los jornaleros es: " + totalNominaJornalero);
    System.out.println("La horas totales son: " + (totalHorasAdministradores + totalHorasJornalero));
    System.out.println("La horas totales de los administradores son: " + totalHorasAdministradores);
    System.out.println("La horas totales de los jornaleros son: " + totalHorasJornalero);

  }
}
