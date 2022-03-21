/**
 * Esta clase se encarga de albergar los atributos, constructores y métodos de una cuenta bancaria
 */

package cuentas;

public class CCuenta {
    /**
     * Los atributos de la clase CCuenta son:
     * nombre: Nombre del titular de la cuenta
     * cuenta: código identificativo de la cuenta bancaria
     * saldo: cantidad de dinero del que dispone la cuenta
     * tipoInterés: Porcentaje de interés de la cuenta
     */
// ***** ATRIBUTOS ******
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

// ***** CONSTRUCTORES *****

    /**
     * Getter del atributo nombre
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre Entra un nombre como String y establece ese nombre como valor del atributo nombre de la clase
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo cuenta
     * @return devuelve el código de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter del atributo cuenta
     * @param cuenta Entra una cuenta como String y establece esa cuenta como valor del atributo cuenta de la clase
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter del atributo saldo
     * @return devuelve la cantidad de saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter del atributo saldo
     * @param saldo Entra un saldo como Double y establece ese saldo como valor del atributo saldo de la clase
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter del atributo tipoInteres
     * @return devuelve el interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Setter del atributo tipoInteres
     * @param tipoInteres entra un tipoInteres como Double y establece ese tipoInteres como valor del atributo tipoInteres de la clase
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

// ***** MÉTODOS *****

    /**
     * Este método crea un objeto CCuenta vacío
     */
    public CCuenta() {
    }

    /**
     * Este método crea un objeto CCuenta, que guarda como atributos los valores pasados por parámetros:
     * @param nom nombre del titular
     * @param cue código de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Este método realiza un ingreso en la cuenta. Obtiene una cantidad por parámetro y procede a ingresarlo si la cantidad es mayor de 0.
     * En este caso, la cantidad se sumará al saldo y este último se actualizará.
     * En caso contrario, lanza un error.
     * @param cantidad es la cantidad que se pretende ingresar
     * @throws Exception lanza una excepción si el numero es menor de 0
     */
    public void ingresar(float cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Este método realiza una retirada de dinero en la cuenta. Obtiene una cantidad por parámetro y procede a retirarlo si la cantidad es mayor de 0 y menor que el saldo.
     * En este caso, la cantidad se restará al saldo y este último se actualizará.
     * @param cantidad es la cantidad que se pretende retirar
     * En caso contrario, lanza un error:
     * @throws Exception lanza una excepción si la cantidad es igual o menor de 0
     * @throws Exception lanza una excepción si la cantidad es superior al saldo
     */
    public void retirar(float cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo -= cantidad;
    }
}
