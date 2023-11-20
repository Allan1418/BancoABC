package bancoabc;

import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * @author 
 * 
 * Clase principal que simula una sucursal bancaria del Banco ABC.
 */

public class BancoABC {


    //Variables Globales
    
    /**
     * Variable estática que representa la lista de cajeros en el sistema.
     *
     * Esta variable se utiliza para almacenar y gestionar la información de los
     * cajeros disponibles en el sistema. La lista de cajeros se inicializa y
     * manipula a lo largo del ciclo de vida de la aplicación.
     */
    public static ListaCajeros cajeros;

    /**
     * variable global que almacena los cheques del sistema se establece el tipo
     * de la pila en objetos de tipo Cheque
     */
    public static Pila<Cheque> cheques = new Pila<>();

    /**
     * variable global que almacena las fichas regulares del sistema se
     * establece el tipo de la cola en objetos de tipo Ficha
     */
    public static Cola<Ficha> fichasRegulares = new Cola<>();

    /**
     * variable global que almacena las fichas preferenciales del sistema se
     * establece el tipo de la cola en objetos de tipo Ficha
     */
    public static Cola<Ficha> fichasPreferenciales = new Cola<>();

    //Metodo principal
    /**
     * Método principal que inicia el sistema de gestión de cajas y ejecuta la
     * simulación de la aplicación.
     *
     * El método comienza configurando las cajas mediante el método
     * {@code defCajas()}. Luego, monta la simulación con el método
     * {@code montarSimulacion()}. Después, inicia el menú principal del sistema
     * mediante el método {@code menu()}.
     *
     * Este método también puede contener pruebas adicionales para verificar el
     * funcionamiento del sistema.
     */
    public static void main(String[] args) {

        //arranque del sistema
        //defCajas();
        //arranque con Simulacion montada
        montarSimulacion();
        menu();

        //Pruebas
    }

    public static void montarSimulacion() {

        cajeros = new ListaCajeros(5);

        Calendar calendar = Calendar.getInstance();

        Ficha a1 = new Ficha("a1", "1", true);
        calendar.set(2023, Calendar.OCTOBER, 1, 0, 0, 0);
        a1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 2, 0, 0, 0);
        a1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha b1 = new Ficha("b1", "2", false);
        calendar.set(2023, Calendar.OCTOBER, 3, 0, 0, 0);
        b1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 4, 0, 0, 0);
        b1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha c1 = new Ficha("c1", "3", true);
        calendar.set(2023, Calendar.OCTOBER, 5, 0, 0, 0);
        c1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 6, 0, 0, 0);
        c1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha d1 = new Ficha("d1", "4", false);
        calendar.set(2023, Calendar.OCTOBER, 7, 0, 0, 0);
        d1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 8, 0, 0, 0);
        d1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha e1 = new Ficha("e1", "5", true);
        calendar.set(2023, Calendar.OCTOBER, 9, 0, 0, 0);
        e1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 10, 0, 0, 0);
        e1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha f1 = new Ficha("f1", "6", false);
        calendar.set(2023, Calendar.OCTOBER, 11, 0, 0, 0);
        f1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 12, 0, 0, 0);
        f1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha g1 = new Ficha("g1", "7", true);
        calendar.set(2023, Calendar.OCTOBER, 13, 0, 0, 0);
        g1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 14, 0, 0, 0);
        g1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha h1 = new Ficha("h1", "8", false);
        calendar.set(2023, Calendar.OCTOBER, 15, 0, 0, 0);
        h1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 16, 0, 0, 0);
        h1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha i1 = new Ficha("i1", "9", true);
        calendar.set(2023, Calendar.OCTOBER, 17, 0, 0, 0);
        i1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 18, 0, 0, 0);
        i1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha j1 = new Ficha("j1", "10", false);
        calendar.set(2023, Calendar.OCTOBER, 19, 0, 0, 0);
        j1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 20, 0, 0, 0);
        j1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha k1 = new Ficha("k1", "11", true);
        calendar.set(2023, Calendar.OCTOBER, 21, 0, 0, 0);
        k1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 22, 0, 0, 0);
        k1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha l1 = new Ficha("l1", "12", false);
        calendar.set(2023, Calendar.OCTOBER, 23, 0, 0, 0);
        l1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 24, 0, 0, 0);
        l1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha m1 = new Ficha("m1", "13", true);
        calendar.set(2023, Calendar.OCTOBER, 25, 0, 0, 0);
        m1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 26, 0, 0, 0);
        m1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha n1 = new Ficha("n1", "14", false);
        calendar.set(2023, Calendar.OCTOBER, 27, 0, 0, 0);
        n1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 28, 0, 0, 0);
        n1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha o1 = new Ficha("o1", "15", true);
        calendar.set(2023, Calendar.OCTOBER, 29, 0, 0, 0);
        o1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.OCTOBER, 30, 0, 0, 0);
        o1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        Ficha p1 = new Ficha("p1", "16", false);
        calendar.set(2023, Calendar.OCTOBER, 31, 0, 0, 0);
        p1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        calendar.set(2023, Calendar.NOVEMBER, 1, 0, 0, 0);
        p1.setAtencion(new Timestamp(calendar.getTimeInMillis()));

        cajeros.buscar(1).getListaBitacora().insertar(a1);
        cajeros.buscar(2).getListaBitacora().insertar(b1);
        cajeros.buscar(3).getListaBitacora().insertar(c1);
        cajeros.buscar(4).getListaBitacora().insertar(d1);

        cajeros.buscar(3).getListaBitacora().insertar(e1);
        cajeros.buscar(2).getListaBitacora().insertar(h1);
        cajeros.buscar(1).getListaBitacora().insertar(i1);
        cajeros.buscar(4).getListaBitacora().insertar(j1);

        cajeros.buscar(4).getListaBitacora().insertar(k1);
        cajeros.buscar(3).getListaBitacora().insertar(l1);
        cajeros.buscar(1).getListaBitacora().insertar(m1);
        cajeros.buscar(2).getListaBitacora().insertar(n1);

        cajeros.buscar(2).getListaBitacora().insertar(o1);
        cajeros.buscar(4).getListaBitacora().insertar(p1);
        cajeros.buscar(3).getListaBitacora().insertar(f1);
        cajeros.buscar(1).getListaBitacora().insertar(g1);

        Ficha q1 = new Ficha("q", "17", true);
        calendar.set(2023, Calendar.NOVEMBER, 2, 0, 0, 0);
        q1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        cajeros.buscar(1).setAtendiendo(q1);

        Ficha r1 = new Ficha("r", "18", false);
        calendar.set(2023, Calendar.NOVEMBER, 3, 0, 0, 0);
        cajeros.buscar(3).setAtendiendo(r1);
        r1.setLlegada(new Timestamp(calendar.getTimeInMillis()));

        Ficha s1 = new Ficha("s1", "19", true);
        calendar.set(2023, Calendar.NOVEMBER, 4, 0, 0, 0);
        s1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        cajeros.buscar(4).setAtendiendo(s1);

        Ficha t1 = new Ficha("t1", "20", true);
        calendar.set(2023, Calendar.NOVEMBER, 5, 0, 0, 0);
        t1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasPreferenciales.ingresarACola(t1);

        Ficha u1 = new Ficha("u1", "21", true);
        calendar.set(2023, Calendar.NOVEMBER, 6, 0, 0, 0);
        u1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasPreferenciales.ingresarACola(u1);

        Ficha v1 = new Ficha("v1", "22", true);
        calendar.set(2023, Calendar.NOVEMBER, 7, 0, 0, 0);
        v1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasPreferenciales.ingresarACola(v1);

        Ficha w1 = new Ficha("w1", "23", true);
        calendar.set(2023, Calendar.NOVEMBER, 8, 0, 0, 0);
        w1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasPreferenciales.ingresarACola(w1);

        Ficha x1 = new Ficha("x", "24", true);
        calendar.set(2023, Calendar.NOVEMBER, 9, 0, 0, 0);
        fichasPreferenciales.ingresarACola(x1);
        x1.setLlegada(new Timestamp(calendar.getTimeInMillis()));

        Ficha y1 = new Ficha("y", "25", true);
        calendar.set(2023, Calendar.NOVEMBER, 10, 0, 0, 0);
        y1.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasPreferenciales.ingresarACola(y1);

        Ficha z1 = new Ficha("z1", "26", true);
        calendar.set(2023, Calendar.NOVEMBER, 11, 0, 0, 0);
        fichasPreferenciales.ingresarACola(z1);
        z1.setLlegada(new Timestamp(calendar.getTimeInMillis()));

        Ficha a2 = new Ficha("a2", "27", false);
        calendar.set(2023, Calendar.NOVEMBER, 12, 0, 0, 0);
        a2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(a2);

        Ficha b2 = new Ficha("b2", "28", false);
        calendar.set(2023, Calendar.NOVEMBER, 13, 0, 0, 0);
        b2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(b2);

        Ficha c2 = new Ficha("c2", "29", false);
        calendar.set(2023, Calendar.NOVEMBER, 14, 0, 0, 0);
        c2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(c2);

        Ficha d2 = new Ficha("d2", "30", false);
        calendar.set(2023, Calendar.NOVEMBER, 15, 0, 0, 0);
        fichasRegulares.ingresarACola(d2);
        d2.setLlegada(new Timestamp(calendar.getTimeInMillis()));

        Ficha e2 = new Ficha("e2", "31", false);
        calendar.set(2023, Calendar.NOVEMBER, 16, 0, 0, 0);
        e2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(e2);

        Ficha f2 = new Ficha("f2", "32", false);
        calendar.set(2023, Calendar.NOVEMBER, 17, 0, 0, 0);
        f2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(f2);

        Ficha g2 = new Ficha("g2", "33", false);
        calendar.set(2023, Calendar.NOVEMBER, 18, 0, 0, 0);
        g2.setLlegada(new Timestamp(calendar.getTimeInMillis()));
        fichasRegulares.ingresarACola(g2);

    }

    //Metodos de Menu
    /**
     * indique la cantidad de cajas para abrir la sucursal bancaria (3-5)
     *
     * @param args
     */
    public static void defCajas() {
        String precajas = Comun.regexConfirm("[3-5]", "indique la cantidad de cajas \nPara abrir la sucursal bancaria \n(3-5)", "Solo entre 3 a 5 cajas");
        if (precajas == null) {
            return;
        }

        cajeros = new ListaCajeros(Integer.parseInt(precajas));

        menu();
    }

    /**
     * Este método muestra un menú principal. El menú incluye opciones para
     * gestionar cheques, listar cajas activas, gestionar cajas, generar
     * reportes, obtener ayuda y salir del programa.
     *
     * Las opciones del menú están representadas por un arreglo de cadenas y se
     * muestran mediante un cuadro de diálogo de opciones. Dependiendo de la
     * opción seleccionada por el usuario, se ejecutan los métodos
     * correspondientes.
     */
    public static void menu() {

        String[] botones = {"Gestionar Cheques", "Listar Cajas Activas", "Gestionar Cajas", "Reporteria", "Ayuda", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU PRINCIPAL",
                    "Menu temporal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[5]);

            switch (opcion) {
                case 0:
                    opChequesGerencia();
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "La sucursal actual del banco ABC tiene " + cajeros.getSize() + " cajas activas");
                    break;
                case 2:
                    opUsuariosCajas();
                    break;
                case 3:
                    iniciarReporte();
                    break;
                case 4:
                    opAyuda();
                    break;
                default:
                    break OUTER;
            }

        }
    }

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
     * Este método muestra un menú de opciones relacionadas con la gestión de
     * usuarios en cajas mediante una ventana de diálogo JOptionPane. Las
     * opciones incluyen seleccionar ficha, llamar usuario a cajas, mostrar
     * fichas pendientes, cerrar ficha y consultar bitácora.
     *
     * Opciones del menú: 0 - Seleccionar Ficha 1 - Llamar Usuario a Cajas 2 -
     * Mostrar Fichas Pendientes 3 - Cerrar Ficha 4 - Consultar Bitácora 5 -
     * SALIR
     */
    public static void opUsuariosCajas() {

        String[] botones = {"Selec ficha", "Llamar Usuario a cajas", "Mostrar Fichas Pendientes", "Cerrar Ficha", "Consultar Bitacora", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU CHEQUES GERENCIA",
                    "Menu temporal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[5]);

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
                case 3:
                    cerrarFicha();
                    break;
                case 4:
                    imprBitacoras();
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
     * Crea un nuevo cheque y lo agrega a la pila de cheques. pregunta al
     * usuario el titular del cheque y el monto.
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
     * Imprime en consola la lista de cheques pendientes en la pila de cheques.
     * Muestra una cabecera con el título "Cheques Pendientes," seguido de la
     * lista de cheques y una línea divisoria.
     */
    public static void imprCheques() {
        System.out.println("\n---Cheques Pendientes---");
        cheques.impPila();
        System.out.println("------------------------");
    }

    /**
     * Crea una nueva ficha de cliente y la agrega a la cola correspondiente
     * (preferencial o regular). Se le pregunta al usuario el tipo de ficha,
     * nombre y cedula.
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

        preCedula = Comun.regexConfirm("\\d{9}", "Ingrese su Cedula", "Formato de cedula invalido! \n(9 digitos)");
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
     * Este método se encarga de preparar y llamar a un usuario para ser
     * atendido en una caja. La preparación incluye la selección de la caja que
     * realizará la llamada y la determinación de si se atenderá a un usuario
     * preferencial o regular, según las reglas definidas.
     *
     * El método verifica la disponibilidad de fichas pendientes tanto para
     * usuarios preferenciales como para regulares. Luego, muestra un cuadro de
     * diálogo con las cajas disponibles y permite al usuario seleccionar la
     * caja que realizará la llamada. Después de seleccionar la caja, determina
     * si se atenderá a un usuario preferencial o regular según las reglas
     * definidas. Finalmente, llama al método {@code atenderFicha} para realizar
     * la atención correspondiente.
     *
     */
    public static void prepararFicha() {

        if (fichasRegulares.isVacia() && fichasPreferenciales.isVacia()) {
            JOptionPane.showMessageDialog(null, "No hay fichas Pendientes!");
            return;
        }

        String[] botones = cajeros.getArrayStr(true, false, estTer.TRUE);
        int preCaja = Comun.mostrarBotones(botones, "Seleccione la Caja que llama");
        if (preCaja == -1) {
            return;
        }

        int cajaActual = Integer.parseInt(botones[preCaja]);

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
     * Este método se encarga de atender a un usuario con la ficha
     * correspondiente en una caja específica. La ficha se obtiene de la cola de
     * fichas preferenciales si el parámetro {@code preferencial} es verdadero,
     * de lo contrario, se obtiene de la cola de fichas regulares.
     *
     * El método muestra un mensaje con la información de la ficha atendida,
     * incluyendo el número de ficha, la cédula de identidad y la caja asignada.
     * Luego, asigna la ficha a la caja correspondiente para su atención.
     *
     * @param numCaja El número de la caja que atenderá al usuario.
     * @param preferencial Un valor booleano que indica si la ficha a atender es
     * preferencial o no.
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

        cajeros.buscar(numCaja).setAtendiendo(actual);
    }

    /**
     * Este método imprime por la consola la información de las fichas
     * pendientes y las fichas en atención.
     *
     * Imprime las fichas pendientes tanto para usuarios regulares como
     * preferenciales, mostrando el número de cada ficha y su cédula. Además,
     * imprime las fichas en atención en cada caja, indicando el número de la
     * caja y la ficha que está siendo atendida. La salida se organiza de manera
     * clara y legible para proporcionar una visión general del estado actual de
     * las fichas en el sistema.
     */
    public static void imprFichas() {
        System.out.println("\n---Fichas Pendientes---");
        System.out.println("Fichas Regulares:");
        fichasRegulares.imprCola();
        System.out.println("\nFichas Preferenciales:");
        fichasPreferenciales.imprCola();
        System.out.println("\nFichas en Atencion:");
        cajeros.imprimirAtendiendo();
        System.out.println("\n-----------------------");
    }

    /**
     * Este método permite cerrar la ficha que está siendo atendida por un
     * cajero específico.
     *
     * Muestra un cuadro de diálogo con la lista de cajeros que están
     * actualmente atendiendo a un usuario. Si no hay cajeros atendiendo, se
     * muestra un mensaje informativo y el método termina. Luego, el usuario
     * selecciona el cajero que cerrará la ficha mediante un cuadro de diálogo.
     * Se registra la hora de cierre de la atención en la ficha, se inserta la
     * ficha en la bitácora del cajero y se establece que el cajero ya no está
     * atendiendo a ninguna ficha.
     *
     */
    public static void cerrarFicha() {

        int preCaj;
        Cajero cajAct;

        String[] botones = cajeros.getArrayStr(true, false, estTer.FALSE);

        if (botones.length == 1) {
            JOptionPane.showMessageDialog(null, "Ningun Cajero esta atendiendo!");
            return;
        }

        preCaj = Comun.mostrarBotones(botones, "Seleccione el cajero que cierra Ficha");
        if (preCaj == -1) {
            return;
        }

        cajAct = cajeros.buscar(Integer.parseInt(botones[preCaj]));

        cajAct.getAtendiendo().setAtencion(new Timestamp(System.currentTimeMillis()));
        cajAct.getListaBitacora().insertar(cajAct.getAtendiendo());
        cajAct.setAtendiendo(null);

    }

    /**
     * Este método imprime por la consola la bitácora de un cajero específico o
     * de todos los cajeros del sistema. Permite al usuario seleccionar el
     * cajero para el cual consultar la bitácora mediante un cuadro de diálogo.
     * Luego, muestra la bitácora correspondiente, organizada por cajero,
     * incluyendo la información de las fichas atendidas.
     *
     * Si se elige consultar la bitácora de todos los cajeros, se imprimirá la
     * bitácora de cada uno de ellos.
     */
    public static void imprBitacoras() {
        int preCaj;
        Cajero cajAct;

        String[] botones = cajeros.getArrayStr(true, true, estTer.NO_APLICA);

        preCaj = Comun.mostrarBotones(botones, "Seleccione el cajero a consultar Bitacora");
        if (preCaj == -1) {
            return;
        }

        if (preCaj == botones.length - 2) {
            System.out.println("\n---Bitacora de todos los cajeros---");
            for (int i = 0; i < cajeros.getSize(); i++) {

                cajAct = cajeros.buscar(i + 1);
                System.out.println("\nCajero #" + cajAct.getId());
                cajAct.getListaBitacora().imprimir();
                System.out.println("-----------------");

            }
            return;
        }

        cajAct = cajeros.buscar(Integer.parseInt(botones[preCaj]));
        System.out.println("\n---Bitacora del Cajero #" + cajAct.getId() + "---");
        cajAct.getListaBitacora().imprimir();
        System.out.println("----------------------------");

    }

    /**
     * Este método inicia la generación de un informe personalizado basado en la
     * información de las fichas atendidas por un cajero o todos los cajeros del
     * sistema. Permite al usuario seleccionar varios parámetros para
     * personalizar el informe, incluyendo el cajero, el tipo de ficha
     * (preferencial, regular o todas), el elemento de ordenamiento y el
     * criterio de ordenamiento. Finalmente, muestra el informe generado por la
     * consola.
     */
    public static void iniciarReporte() {
        int preCaj, preElemento, preOrdena;
        estTer preTiFicha;

        String[] botCaj = cajeros.getArrayStr(true, true, estTer.NO_APLICA);
        String[] botFichas = {"Preferencial", "Regular", "Todos", "Volver"};
        String[] botElemento = {"Fecha Y hora de llegada", "Fecha Y hora de Atencion", "Volver"};
        String[] botOrdena = {"Ascendentemente", "Descendentemente", "Volver"};

        preCaj = Comun.mostrarBotones(botCaj, "Seleccione el cajero del Reporte");
        if (preCaj == -1) {
            return;
        }

        switch (Comun.mostrarBotones(botFichas, "Seleccione el tipo de Ficha del Reporte")) {
            case 0:
                preTiFicha = estTer.TRUE;
                break;
            case 1:
                preTiFicha = estTer.FALSE;
                break;
            case 2:
                preTiFicha = estTer.NO_APLICA;
                break;
            default:
                return;
        }

        preElemento = Comun.mostrarBotones(botElemento, "Seleccione el elemento de ordenamiento");
        if (preElemento == -1) {
            return;
        }

        preOrdena = Comun.mostrarBotones(botOrdena, "Seleccione el criterio de ordenamiento");
        if (preOrdena == -1) {
            return;
        }

        Reporteria repoActual = new Reporteria((preElemento == 0), (preOrdena == 0), preTiFicha);

        if (preCaj == botCaj.length - 2) {
            for (int i = 0; i < cajeros.getSize(); i++) {
                repoActual.insertarLista(cajeros.buscar(i + 1).getListaBitacora().getCabeza());
            }
        } else {
            repoActual.insertarLista(cajeros.buscar(Integer.parseInt(botCaj[preCaj])).getListaBitacora().getCabeza());
        }

        System.out.println("\n---Inicio Reporte Personalizado---");
        repoActual.imprimir();
        System.out.println("----Fin Reporte Personalizado-----");

    }

    //OtrosMetodos
}
