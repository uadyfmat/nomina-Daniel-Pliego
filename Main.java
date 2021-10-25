public class Main {
    public static void main(String[] args) {

        Administrador administrador = new Administrador("Daniel", 80);
        System.out.println(administrador);
        administrador.calcularSalario(80, 15);
        System.out.println(administrador);

        Jornalero jornalero = new Jornalero("Daniel", 80);
        System.out.println(jornalero);
        jornalero.calcularSalario(80, 15);
        System.out.println(jornalero);

        System.out.println("\n\nLa nomina total a pagar es: " + totalNominaAdministrador + totalNominaJornalero);
        System.out.println("La nomina total de los administradores es: "+ totalAdministradores);
      /* System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();*/
    }
}
