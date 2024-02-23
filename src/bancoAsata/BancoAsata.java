package bancoAsata;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoAsata {
    /*
    public static String mostrarCuentas(ArrayList<CuentaCorriente> pCuentas) {

        String allCuentas = "";
        for (CuentaCorriente valor : pCuentas) {
            allCuentas += "-----\n" + valor.toString() + "\n-----";
        }
        return allCuentas;
    }
    */
    public static String mostrarCuentasRecursivo(ArrayList<CuentaCorriente> pCuentas, int cRecursivo) {
        if (cRecursivo == 0) {
            return pCuentas.get(0).toString();
        } else {
            return pCuentas.get(cRecursivo) + "\n-----\n" + mostrarCuentasRecursivo(pCuentas, cRecursivo - 1);
        } // if end
    }

    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;
        String uNombre;
        String uDNI;
        short uAñoNacimiento;
        double uNum1;

        // Arrays
        ArrayList<CuentaCorriente> listCuentas = new ArrayList<>();

        listCuentas.add(new CuentaCorriente("Peter", "00000000a", (short) 2000));
        listCuentas.add(new CuentaCorriente("Paco", "11111111b", (short) 1990, 10000));
        // Programa
        do {
            System.out.println("**********" + "\nIndice" + "\n-----" +
                    "\n1: Mostrar cuenta" +
                    "\n2: Crear cuenta" +
                    "\n3: Ingresar dinero" +
                    "\n4: Sacar dinero" +
                    "\n5: Comisiones" +
                    "\n6: Intereses" +
                    "\n7: Cambiar límite" +
                    "\n0: Salir" +
                    "\n**********");
            uIndice = sc.next().charAt(0);

            switch (uIndice) {
                case '1':
                    System.out.println(mostrarCuentasRecursivo(listCuentas, listCuentas.size() - 1));
                    break;
                case '2':
                    System.out.println("Creando una cuenta nueva\n-----\nIntroduce el nombre del titular:");
                    uNombre = sc.next();
                    System.out.println("Introduce el DNI del titular:");
                    uDNI = sc.next();
                    System.out.println("Introduce el año de nacimento del titular:");
                    uAñoNacimiento = sc.nextShort();

                    listCuentas.add(new CuentaCorriente(uNombre, uDNI, uAñoNacimiento));
                    break;
                case '3':
                    System.out.println("Ingresando dinero\n-----\nIntroduce el DNI del titular:");
                    uDNI = sc.next();
                    System.out.println("Cantidad a ingresar:");
                    uNum1 = sc.nextDouble();

                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getTitular().getDni().equalsIgnoreCase(uDNI)) {
                            valor.ingresarDinero(uNum1);
                        }
                    }
                    break;
                case '4':
                    System.out.println("Retirando dinero\n-----\nIntroduce el DNI del titular:");
                    uDNI = sc.next();

                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getTitular().getDni().equalsIgnoreCase(uDNI)) {
                            valor.sacarDinero(100);
                        }
                    }
                    break;
                case '5':
                    for (CuentaCorriente valor : listCuentas) {
                        valor.comision();
                    }
                    break;
                case '6':
                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getSaldo() % 2 == 0) {
                            valor.intereses();
                        }
                    }
                    break;
                case '7':
                    System.out.println("Cambiando el limite negativo\n-----\nIntroduce el DNI del titular:");
                    uDNI = sc.next();
                    System.out.println("Nuevo limite:");
                    uNum1 = sc.nextDouble();

                    for (CuentaCorriente valor : listCuentas) {
                        if (valor.getTitular().getDni().equalsIgnoreCase(uDNI)) {
                            valor.setLimite(uNum1);
                        }
                    }
                    break;
                case '0':
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Indice introducido incorrecto");
            } // switch end
        } while (uIndice != '0');

        sc.close();
    } // main end
} // class end
