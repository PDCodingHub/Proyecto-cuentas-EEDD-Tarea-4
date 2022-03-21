package cuentas;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        // Establece los parámetros de la cuenta
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es " + saldoActual + "€");

        // Pide una cantidad a retirar de la cuenta
        System.out.print("Indica la cantidad que deseas retirar: ");
        teclado = new Scanner(System.in);
        float cantidadRetirar = teclado.nextFloat();

        // Pide una cantidad a ingresar en la cuenta
        System.out.print("Indica la cantidad que deseas ingresar: ");
        float cantidadIngresar = teclado.nextFloat();

        // Llama al método que se encarga de operar con los ingresos y retiradas, con las cantidades correspondientes
        operativaCuenta(cuenta1, cantidadRetirar, cantidadIngresar);
    }

    public static void operativaCuenta(CCuenta cuenta1, float cantidadRetirar, float cantidadIngresar) {
        // Retirada
        try {
            System.out.println("Retirada en cuenta: " + cantidadRetirar);
            cuenta1.retirar(cantidadRetirar);
            System.out.println("Retirada realizada.");
            System.out.println("Saldo actual: " + cuenta1.getSaldo() + "€");
        } catch (Exception e) {
            // devuelve el mensaje si no ha retirado nada
            System.out.print("Fallo al retirar\n");
        }

        // Ingreso
        try {
            System.out.println("Ingreso en cuenta: " + cantidadIngresar);
            cuenta1.ingresar(cantidadIngresar);
            System.out.println("Ingreso realizado.");
            System.out.println("Saldo actual: " + cuenta1.getSaldo() + "€");
        } catch (Exception e) {
            // devuelve el mensaje si no ha ingresado nada
            System.out.print("Fallo al ingresar");
        }
    }

}


