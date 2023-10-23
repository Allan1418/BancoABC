
package bancoabc;

import bancoabc.Cheque;
import bancoabc.Cola;
import bancoabc.Comun;
import bancoabc.Ficha;
import bancoabc.Pila;
import javax.swing.JOptionPane;

/**
 * Clase principal que simula una sucursal bancaria del Banco ABC.
 */
public class BancoABC {
    

    //Variables Globales
    
    
    public static int cantcajas = 0;

    public static Pila<Cheque> cheques = new Pila<>();

    public static Cola<Ficha> fichasRegulares = new Cola<>();
    public static Cola<Ficha> fichasPreferenciales = new Cola<>();

    //Metodo principal
    
    
    public static void main(String[] args) {

        //arranque del sistema
        menu();
        //Pruebas
    }

    /**
     * Muestra el menú principal de la aplicación y permite al usuario
     * seleccionar diferentes opciones.
     */
    public static void menu() {

        String precajas = Comun.regexConfirm("[3-5]", "indique la cantidad de cajas \nPara abrir la sucursal bancaria \n(3-5)", "Solo entre 3 a 5 cajas");
        if (precajas == null) {
            return;
        }

        cantcajas = Integer.parseInt(precajas);

        String[] botones = {"Gestionar Cheques Gerencia", "Listar Cajas Activas", "Gestionar Usuarios de Cajas", "Ayuda", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU PRINCIPAL",
                    "Menu temporal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[4]);

            switch (opcion) {
                case 0:
                    opChequesGerencia();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "La sucursal actual del banco ABC tiene " + cantcajas + " cajas activas");
                    break;
                case 2:
                    opUsuariosCajas();
                    break;
                case 3:
                    opAyuda();
                    break;
                default:
                    break OUTER;
            }

        }
    }

    // Métodos de operaciones con cheques
    
    /**
     * Muestra un menú de opciones para la gestión de cheques por parte de la
     * gerencia del banco. Las opciones incluyen ingresar un nuevo cheque,
     * firmar un cheque y listar los cheques pendientes. Permite al usuario
     * seleccionar una de estas opciones o salir del menú.
     */
    public static void opChequesGerencia() {

        String[] botones = {"Ingresar un cheque", "Firmar un cheque", "Listar cheques pendientes", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU CHEQUES GERENCIA",
                    "Menu temporal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[3]);

            switch (opcion) {
                case 0:
                    crearCheque();
                    break;
                case 1:
                    sacarCheque();
                    break;
                case 2:
                    imprCheques();
                    break;
                default:
                    break OUTER;
            }

        }

    }

    /**
     * Muestra el menú de gestión de usuarios de las cajas del banco. Las
     * opciones incluyen seleccionar una ficha, llamar a un usuario a las cajas
     * y mostrar las fichas pendientes.
     */
    public static void opUsuariosCajas() {

        String[] botones = {"Seleccionar ficha", "Llamar Usuario a cajas", "Mostrar Fichas Pendientes", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU CHEQUES GERENCIA",
                    "Menu temporal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[3]);

            switch (opcion) {
                case 0:
                    crearFicha();
                    break;
                case 1:
                    prepararFicha();
                    break;
                case 2:
                    imprFichas();
                    break;
                default:
                    break OUTER;
            }

        }

    }

    /**
     * Muestra una ventana de ayuda con la información de los integrantes de la
     * solución del sistema del Banco ABC.
     */
    public static void opAyuda() {
        String m = "Banco ABC \n\nIntegrantes de la solucion: \n-Allan Nuñez Brenes  \n-Anyelo Vargas Merlo  \n-Maria Celeste Cerdas Hernandez";
        JOptionPane.showMessageDialog(null, m);
    }
    
    

    //Metodos de opcion
    
    
    /**
     * Crea un nuevo cheque y lo agrega a la pila de cheques.
     */
    public static void crearCheque() {
        String preNombre, preMonto;

        preNombre = Comun.regexConfirm(".+", "Ingrese el Titular del cheque", "Ingrese un titular");
        if (preNombre == null) {
            return;
        }

        preMonto = Comun.regexConfirm("\\d+([.]\\d+)?", "Ingrese el Monto del Cheque", "Numero Invalido!");
        if (preMonto == null) {
            return;
        }

        Cheque preCheque = new Cheque(preNombre, Double.parseDouble(preMonto));
        cheques.push(preCheque);

    }

    /**
     * Saca un cheque de la pila de cheques y muestra la información del mismo
     * en una ventana.
     */
    public static void sacarCheque() {

        if (cheques.isVacia()) {
            JOptionPane.showMessageDialog(null, "La pila de cheques esta vacia!");
            return;
        }

        String[] boton = {"Firmar"};
        JOptionPane.showOptionDialog(null,
                cheques.pop().toString(),
                "Menu temporal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                boton, boton[0]);
    }

    /**
     * Imprime la lista de cheques pendientes en la pila de cheques. Muestra una
     * cabecera con el título "Cheques Pendientes," seguido de la lista de
     * cheques y una línea divisoria.
     */
    public static void imprCheques() {
        System.out.println("\n---Cheques Pendientes---");
        cheques.impPila();
        System.out.println("------------------------");
    }

    /**
     * Crea una nueva ficha de cliente y la agrega a la cola correspondiente
     * (preferencial o regular).
     */
    public static void crearFicha() {

        boolean tipoCliente;
        String preCedula, preNombre;

        String[] botones = {"Preferencial", "Regular", "SALIR"};
        int opcion = JOptionPane.showOptionDialog(null,
                "Seleccione el tipo de Ficha",
                "Menu temporal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                botones, botones[2]);

        switch (opcion) {
            case 0:
                tipoCliente = true;
                break;
            case 1:
                tipoCliente = false;
                break;
            default:
                return;
        }

        preNombre = Comun.regexConfirm(".+", "Ingrese su Nombre", null);
        if (preNombre == null) {
            return;
        }

        preCedula = Comun.regexConfirm("\\d{9}", "Ingrese su Cedula", "Formato de cedula invalido!");
        if (preCedula == null) {
            return;
        }

        Ficha preFicha = new Ficha(preNombre, preCedula, tipoCliente);
        if (preFicha.isPreferencial()) {
            fichasPreferenciales.ingresarACola(preFicha);
        } else {
            fichasRegulares.ingresarACola(preFicha);
        }

    }

    /**
     * Prepara y llama a un usuario de las cajas, dependiendo de la
     * disponibilidad y el tipo de ficha.
     */
    public static void prepararFicha() {

        if (fichasRegulares.isVacia() && fichasPreferenciales.isVacia()) {
            JOptionPane.showMessageDialog(null, "No hay fichas Pendientes!");
            return;
        }

        String regex = "[1-" + String.valueOf(cantcajas) + "]";
        String preCaja = Comun.regexConfirm(regex, "Ingrese el numero de caja que atiende", "No existe caja!");
        if (preCaja == null) {
            return;
        }

        int cajaActual = Integer.parseInt(preCaja);

        //caja preferencial
        if (cajaActual == 1) {
            if (fichasPreferenciales.isVacia()) {
                atenderFicha(cajaActual, false);
                return;
            }
            atenderFicha(cajaActual, true);
            return;
        }

        //caja usuarios regulares
        if (cajaActual == 2) {
            if (fichasPreferenciales.getSize() > fichasRegulares.getSize()) {
                atenderFicha(cajaActual, true);
                return;
            }
            atenderFicha(cajaActual, false);
            return;
        }

        //cajas restantes
        if (fichasRegulares.isVacia()) {
            atenderFicha(cajaActual, true);
            return;
        }

        atenderFicha(cajaActual, false);

    }

    /**
     * Atiende a un cliente de acuerdo con la caja asignada y el tipo de ficha.
     *
     * @param numCaja Número de caja asignada al cliente
     * @param preferencial Indicador de si la ficha es preferencial o no
     */
    public static void atenderFicha(int numCaja, boolean preferencial) {

        String m;
        Ficha actual;

        if (preferencial) {
            actual = fichasPreferenciales.sacarDeCola();
        } else {
            actual = fichasRegulares.sacarDeCola();
        }

        //Ficha # <<número de ficha>> con cédula <<cédula de identidad>> pasar a caja <caja asignada>.
        m = "Ficha #" + actual.getNumero() + " con cédula " + actual.getCedula() + " pasar a caja " + numCaja;

        JOptionPane.showMessageDialog(null, m);
    }

    /**
     * Muestra las fichas pendientes en las colas, tanto regulares como
     * preferenciales.
     */
    public static void imprFichas() {
        System.out.println("\n---Fichas Pendientes---");
        System.out.println("Fichas Regulares:");
        fichasRegulares.imprCola();
        System.out.println("\nFichas Preferenciales:");
        fichasPreferenciales.imprCola();
        System.out.println("\n-----------------------");
    }

    
    //OtrosMetodos
    
    
    
}
