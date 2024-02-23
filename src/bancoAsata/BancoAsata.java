package bancoAsata;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoAsata {
    public String mostrarCuentas(ArrayList<CuentaCorriente> pCuentas) {
        String allCuentas = "";
        for (CuentaCorriente valor : pCuentas) {
            allCuentas += "-----" + valor.toString() + "-----";
        }
        return allCuentas;
    }

    public static void main(String[] args) {
        // Utils
        Scanner sc = new Scanner(System.in);

        // Variables
        char uIndice;
        String uNombre;
        String uDNI;
        short uAñoNacimiento;

        // Arrays
        ArrayList<CuentaCorriente> listCuentas = new ArrayList<>();

        listCuentas.add(new CuentaCorriente("Peter", "00000000a", (short) 2000));
        listCuentas.add(new CuentaCorriente("Paco", "11111111b", (short) 1990, 10000));
        // Programa
        do {
            System.out.println("*****" + "\nIndice" + "\n-----" +
                    "\n1: Mostrar cuenta" +
                    "\n2: Crear cuenta" +
                    "\n3: Ingresar dinero" +
                    "\n4: Sacar dinero" +
                    "\n5: Comisiones" +
                    "\n6: Intereses" +
                    "\n7: Cambiar límite" +
                    "\n0: Salir");
            uIndice = sc.next().charAt(0);

            switch (uIndice) {
                case '1':
                    System.out.println();
                    break;
                case '2':
                    System.out.println("Creando una cuenta nueva\n-----\nIntroduce el nombre del titular:");
                    uNombre = sc.next();
                    System.out.println("Introduce el DNI del titular");
                    uDNI = sc.next();
                    System.out.println("Introduce el año de nacimento del titular");
                    uAñoNacimiento = sc.nextShort();

                    listCuentas.add(new CuentaCorriente(uNombre, uDNI, uAñoNacimiento));
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Indice introducido incorrecto");
            } // switch end
        } while (uIndice != '0');

        sc.close();
    } // main end
} // class end
