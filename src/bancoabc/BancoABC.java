package bancoabc;

import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * Clase principal que simula una sucursal bancaria del Banco ABC.
 * 
 * 
 * @author Allan Nunez Brenes, Anyelo Vargas Merlo, Celeste Cerdas Hernandez 
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
    
    /**
     * Variable estática de tipo ChatBot que representa el chatbot.
     */
    public static ChatBot chatBot = new ChatBot();

    //Metodo principal
    /**
     * Método principal que inicia el sistema de gestión de cajas.
     * El método arranca el sistema configurando las cajas mediante el método 
     * {@code defCajas()}.
     *
     * Este método contiene una simulacion para verificar el funcionamiento 
     * del sistema. solo para el manejo de desarrolladores
     * 
     * @param args Requisito de java
     */
    public static void main(String[] args) {

        //arranque del sistema
        montarChatbot();
        defCajas();
        
        
        //arranque con Simulacion montada
//        montarChatbot();
//        montarSimulacion();
//        menu();

        //Pruebas
                
        
    }
    
    /**
     * Metodo que monta una simulacion preconfigurada manualmente.
     */
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
    
    /**
     * Monta el chatbot, insertando los Nodos y las preguntas correspondientes
     * al chatbot
     */
    public static void montarChatbot(){
//        System.out.println(chatBot.insertar("1", "Banca de Personas"));
//        System.out.println(chatBot.insertar("1", "Banca de Empresas"));
//        System.out.println(chatBot.insertar("11", "Preguntas de Productos"));
//        System.out.println(chatBot.insertar("11", "Otras Preguntas (Personas)"));
//        System.out.println(chatBot.insertar("111", "Cuentas de Ahorro"));
//        System.out.println(chatBot.insertar("111", "Tarjetas de Crédito"));
//        System.out.println(chatBot.insertar("12", "PYMES"));
//        System.out.println(chatBot.insertar("121", "Preguntas de Productos"));
//        System.out.println(chatBot.insertar("121", "Otras Preguntas (PYME)"));
//        
//        System.out.println(chatBot.insertarPregunta("1111", "Requisitos para abrir una cuenta de ahorro", "Debe presentar: Cédula de Identidad Comprobante de Origen de los fondos y formulario firmado"));
//        System.out.println(chatBot.insertarPregunta("1111", "Saldo mínimo en cuenta de ahorro", "Debe mantener un mínimo de 2000 colones para que su cuenta se mantenga activa."));
//        System.out.println(chatBot.insertarPregunta("1112", "Requisitos para abrir una obtener una tarjeta de crédito?", "Debe presentar: Cédula de Identidad, tener un historial de crédito limpio y Comprobante de Origen de los fondos y formulario firmado"));
//        System.out.println(chatBot.insertarPregunta("1112", "Tipos para tener una tarjeta de crédito", "Existen diferentes tipos: Devolución de un porcentaje, milla de viajero frecuente, ahorro en combustible, entre otros."));
//        System.out.println(chatBot.insertarPregunta("112", "Horario de atención", "El horario de nuestras sucursales es de 8am a 4pm (Sucursales regulares) y de 10 am a 7pm (Sucursales en centros comerciales)"));
//        System.out.println(chatBot.insertarPregunta("112", "Sucursales", "Tenemos sucursales en todo el país, ingrese a www.bancoabc.com/sucursales para mayor información"));
//        System.out.println(chatBot.insertarPregunta("112", "Aplicar a una plaza", "Ingrese a www.bancoabc.com/reclutamiento ."));


        
        chatBot.insertar("1", "Banca de Personas");
        chatBot.insertar("1", "Banca de Empresas");

        chatBot.insertar("11", "Preguntas de Productos");
        chatBot.insertar("11", "Otras Preguntas (Personas)");
        chatBot.insertar("111", "Cuentas de Ahorro");
        chatBot.insertar("111", "Tarjetas de Crédito");

        chatBot.insertar("12", "PYMES");
        chatBot.insertar("121", "Preguntas de Productos");
        chatBot.insertar("121", "Otras Preguntas (PYME)");
        
        
        chatBot.insertarPregunta("1111", "Requisitos para abrir una cuenta de ahorro", "Debe presentar: Cédula de Identidad Comprobante de Origen de los fondos y formulario firmado");
        chatBot.insertarPregunta("1111", "Saldo mínimo en cuenta de ahorro", "Debe mantener un mínimo de 2000 colones para que su cuenta se mantenga activa.");
        chatBot.insertarPregunta("1112", "Requisitos para abrir una obtener una tarjeta de crédito?", "Debe presentar: Cédula de Identidad, tener un historial de crédito limpio y Comprobante de Origen de los fondos y formulario firmado");
        chatBot.insertarPregunta("1112", "Tipos para tener una tarjeta de crédito", "Existen diferentes tipos: Devolución de un porcentaje, milla de viajero frecuente, ahorro en combustible, entre otros.");
        chatBot.insertarPregunta("112", "Horario de atención", "El horario de nuestras sucursales es de 8am a 4pm (Sucursales regulares) y de 10 am a 7pm (Sucursales en centros comerciales)");
        chatBot.insertarPregunta("112", "Sucursales", "Tenemos sucursales en todo el país, ingrese a www.bancoabc.com/sucursales para mayor información");
        chatBot.insertarPregunta("112", "Aplicar a una plaza", "Ingrese a www.bancoabc.com/reclutamiento .");
        
    }

    //Metodos de Menu
    
    /**
     * El método solicita al usuario que ingrese la cantidad de cajas con las
     * que se va a inicar la sucursal bancaria mediante una expresión regular, 
     * que valida el numero ingresado entre 3 y 5.
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
     *
     * Este método muestra un menú principal. El menú incluye opciones para
     * gestionar cheques, listar cajas activas, gestionar cajas, generar
     * reportes, ChatBot, obtener ayuda y salir del programa.
     *
     * Las opciones del menú están representadas por un arreglo de strings y se
     * muestran mediante un cuadro de diálogo de opciones JOptionPane. 
     * Dependiendo de la opción seleccionada por el usuario, 
     * se ejecutan los métodos correspondientes.
     */
    public static void menu() {

        String[] botones = {"Gestionar Cheques", "Listar Cajas Activas", "Gestionar Cajas", "Reporteria", "ChatBot", "Ayuda", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU PRINCIPAL",
                    "Banco ABC",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[6]);

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
                    opChatBot();
                    break;
                case 5:
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
                    "Banco ABC",
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
     */
    public static void opUsuariosCajas() {

        String[] botones = {"Selec ficha", "Llamar Usuario a cajas", "Mostrar Fichas Pendientes", "Cerrar Ficha", "Consultar Bitacora", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU CHEQUES GERENCIA",
                    "Banco ABC",
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
    
    /**
     * Este método proporciona una interfaz de usuario para interactuar
     * con el chatbot. Muestra un menú con tres opciones: "Ver chatbot",
     * "Mantenimiento" y "SALIR". El usuario puede elegir una opción para
     * interactuar con el chatbot o salir al menu principal.
     */
    public static void opChatBot() {

        String[] botones = {"Ver chatbot", "Mantenimiento", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU CHAT-BOT",
                    "Banco ABC",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[2]);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(
                        null, 
                        ("Bienvenido al ChatBot de Banco ABC."), 
                        "Banco ABC", 
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    verChatbot(chatBot.getRaiz());
                    
                    JOptionPane.showMessageDialog(
                        null, 
                        ("Gracias por usar nuestro ChatBot, Hasta luego."), 
                        "Banco ABC", 
                        JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 1:
                    opMantChatBot();
                    break;
                default:
                    break OUTER;
            }

        }

    }
    
    /**
     * Este método proporciona una interfaz de usuario para realizar
     * operaciones de mantenimiento en el chatbot. Muestra un menú con 
     * cuatro opciones: "Añadir Nodos", "Añadir Pregunta", "Ver Preguntas" 
     * y "SALIR". El usuario puede elegir una opción para agregar nodos,
     * preguntas, ver preguntas o salir del menú de mantenimiento.
     */
    public static void opMantChatBot() {

        String[] botones = {"Añadir Nodos", "Añadir Pregunta", "Ver Preguntas", "SALIR"};
        int opcion;
        OUTER:
        while (true) {
            opcion = JOptionPane.showOptionDialog(null,
                    "MENU MANTENIMIENTO CHAT-BOT",
                    "Banco ABC",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botones, botones[3]);

            switch (opcion) {
                case 0:
                    insertarNodoChatBot();
                    break;
                case 1:
                    insertarPreguntaChatBot();
                    break;
                case 2:
                    prepararPreguntasChatbot();
                    break;
                default:
                    break OUTER;
            }

        }

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
     * Este método se encarga de preparar y llamar a un usuario (Ficha) para ser
     * atendido en una caja. La preparación incluye la selección de la caja que
     * realizará la llamada y la determinación de si se atenderá a un usuario
     * preferencial o regular, según las reglas definidas.
     *
     * El método verifica la disponibilidad de fichas pendientes tanto para
     * usuarios preferenciales como para regulares. 
     * Luego, muestra un cuadro de diálogo con las cajas disponibles y permite 
     * al usuario seleccionar la caja que realizará la llamada. 
     * Después de seleccionar la caja, determina si se atenderá a un 
     * usuario preferencial o regular según las reglas definidas. 
     * Finalmente, llama al método {@code atenderFicha} para realizar
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
        if (preCaja < 0) {
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

        int preCaja;
        Cajero cajAct;

        String[] botones = cajeros.getArrayStr(true, false, estTer.FALSE);

        if (botones.length == 1) {
            JOptionPane.showMessageDialog(null, "Ningun Cajero esta atendiendo!");
            return;
        }

        preCaja = Comun.mostrarBotones(botones, "Seleccione el cajero que cierra Ficha");
        if (preCaja < 0) {
            return;
        }

        cajAct = cajeros.buscar(Integer.parseInt(botones[preCaja]));

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
        int preCaja;
        Cajero cajAct;

        String[] botones = cajeros.getArrayStr(true, true, estTer.NO_APLICA);

        preCaja = Comun.mostrarBotones(botones, "Seleccione el cajero a consultar Bitacora");
        if (preCaja < 0) {
            return;
        }

        if (preCaja == botones.length - 2) {
            System.out.println("\n---Bitacora de todos los cajeros---");
            for (int i = 0; i < cajeros.getSize(); i++) {

                cajAct = cajeros.buscar(i + 1);
                System.out.println("\nCajero #" + cajAct.getId());
                cajAct.getListaBitacora().imprimir();
                System.out.println("-----------------");

            }
            return;
        }

        cajAct = cajeros.buscar(Integer.parseInt(botones[preCaja]));
        System.out.println("\n---Bitacora del Cajero #" + cajAct.getId() + "---");
        cajAct.getListaBitacora().imprimir();
        System.out.println("----------------------------");

    }

    /**
     * Este método inicia la generación de un informe personalizado basado en la
     * información de las fichas atendidas por un cajero o todos los cajeros del
     * sistema. Permite al usuario seleccionar varios parámetros para
     * personalizar el informe: incluyendo el cajero (uno o todos), 
     * el tipo de ficha (preferencial, regular o todas), 
     * el elemento de ordenamiento (Fecha de llegada o atencion) 
     * y el criterio de ordenamiento (Ascendentemente o Descendentemente). 
     * Finalmente, muestra el informe generado por la consola.
     */
    public static void iniciarReporte() {
        int preCaja, preElemento, preOrdena;
        estTer preTiFicha;

        String[] botCaj = cajeros.getArrayStr(true, true, estTer.NO_APLICA);
        String[] botFichas = {"Preferencial", "Regular", "Todos", "Volver"};
        String[] botElemento = {"Fecha Y hora de llegada", "Fecha Y hora de Atencion", "Volver"};
        String[] botOrdena = {"Ascendentemente", "Descendentemente", "Volver"};

        preCaja = Comun.mostrarBotones(botCaj, "Seleccione el cajero del Reporte");
        if (preCaja < 0) {
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
        if (preElemento < 0) {
            return;
        }

        preOrdena = Comun.mostrarBotones(botOrdena, "Seleccione el criterio de ordenamiento");
        if (preOrdena < 0) {
            return;
        }

        Reporteria repoActual = new Reporteria((preElemento == 0), (preOrdena == 0), preTiFicha);

        if (preCaja == botCaj.length - 2) {
            for (int i = 0; i < cajeros.getSize(); i++) {
                repoActual.insertarLista(cajeros.buscar(i + 1).getListaBitacora().getCabeza());
            }
        } else {
            repoActual.insertarLista(cajeros.buscar(Integer.parseInt(botCaj[preCaja])).getListaBitacora().getCabeza());
        }

        System.out.println("\n---Inicio Reporte Personalizado---");
        repoActual.imprimir();
        System.out.println("----Fin Reporte Personalizado-----");

    }
    
    /**
     * Este método muestra el nodo actual del árbol del chatbot 
     * y navega a otros nodos de manera recursiva según 
     * las selecciones del usuario a traves de botones desplegados segun los
     * hijos del nodo.
     * 
     * Itera si el usuario decide volver o sale del bucle si decide salirse.
     * 
     * Si llega a un nodo hoja que contiene preguntas llama 
     * al metodo {@code mostrarPreguntasChatbot(lista)}.
     * 
     * @param actual Un objeto NodoDoble que
     * representa el nodo actual en el árbol del chatbot.
     * 
     * @return true si el usuario elige volver al nodo anterior, 
     * falso en caso que decida salir del chatBot.
     */
    public static boolean verChatbot(NodoDoble<DatoChatBot> actual){
        
        boolean mantener = true;
        while (mantener) {
            
            
            if (actual.getDato().isPreguntas()) {
                mostrarPreguntasChatbot(actual.getDato().getPreguntas());
                return true;
            }
            
            String[] array = actual.getEnlacesString();
            int op = Comun.mostrarBotones(array, (actual.getDato().getName() + " - " + actual.getDato().getId()));
            
            if (op < 0) {
                return op != -1;
            }
            
            
            String siguiente = array[op];
            
            if (siguiente.equals(actual.getEnlaceIzq().getDato().getName())) {
                mantener = verChatbot(actual.getEnlaceIzq());
            } else{
                mantener = verChatbot(actual.getEnlaceDer());
            }
            
            
        }
        
        
        return false;
    }
    
    /**
     * Este método muestra las preguntas y sus correspondientes
     * respuestas desde un objeto ListaPreguntas.
     * Permite al usuario seleccionar una pregunta y muestra su respuesta.
     * @param lista Un objeto ListaPreguntas que 
     * contiene las preguntas y sus respuestas.
     */
    public static void mostrarPreguntasChatbot(ListaPreguntas lista){
        
        String preOp;
        String re = "[" + (lista.getCabeza().getDato().getId() + 1) + "-" + (lista.getUltimo().getDato().getId() + 1) + "]";
        
        while (true) {            
            preOp = Comun.regexConfirm(re, lista.getPreguntas(), "Escriba un numero entre " + re);
            if (preOp == null) {
                return;
            }
            
            JOptionPane.showMessageDialog(null, lista.getRespuesta(Integer.parseInt(preOp) -1));
            
        }
        
        
    }
    
    /**
     * Este método agrega un nuevo nodo al árbol del chatbot. 
     * Se solicita al usuario que ingrese el ID del nodo padre y 
     * el nombre del nuevo nodo.
     * 
     * Si el nodo padre existe, no contiene lista de preguntas y
     * se puede agregar un hijo. El nuevo nodo se agrega al árbol.
     * 
     * Si el nuevo nodo se agrego muestra un mensaje con la nueva id del nodo
     * agregado, caso contrario muestra un mensaje de error y vuelve a iterar
     * hasta que el usuario decida salirse.
     */
    public static void insertarNodoChatBot(){
        
        String prePadre, preNombre, resultado;
        
        while (true) {            
            
            prePadre = Comun.regexConfirm("[1-2]+", "Escriba el ID del padre donde quiere insertar el Nodo", "Escriba un ID en el formato valido!");
            if (prePadre == null) {
                return;
            }
            
            preNombre = Comun.regexConfirm(".+", "Escriba el nombre del nuevo Nodo a insertar", "El campo no puede ir vacio!");
            if (preNombre == null) {
                return;
            }
            
            resultado = chatBot.insertar(prePadre, preNombre);
            if (resultado != null) {
                JOptionPane.showMessageDialog(
                        null, 
                        ("El nodo " + preNombre + " Se inserto con exito en el Nodo: " + resultado), 
                        "Banco ABC", 
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            } else{
                JOptionPane.showMessageDialog(
                        null, 
                        ("El nodo " + prePadre + " No se encontro o No se puede insertar! \nIntente con otro"), 
                        "Banco ABC", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    /**
     * Este método agrega una nueva pregunta a un nodo existente en el
     * árbol del chatbot. 
     * 
     * Se solicita al usuario que ingrese el ID del nodo (donde desea agregar
     * la pregunta), la pregunta y la respuesta. 
     * 
     * Si el nodo existe y es una hoja, la pregunta se agrega a la lista de
     * preguntas del nodo. 
     * 
     * Si se agrega la nueva pregunta muestra un mensaje de confirmacion, caso
     * contrario muestra un mensaje de error y vuelve a iterar
     * hasta que el usuario decida salirse.
     */
    public static void insertarPreguntaChatBot(){
        
        String preNodo, prePregunta, preRespuesta;
        
        while (true) {            
            
            preNodo = Comun.regexConfirm("[1-2]+", "Escriba el ID del Nodo donde añadir la pregunta", "Escriba un ID en el formato valido!");
            if (preNodo == null) {
                return;
            }
            
            prePregunta = Comun.regexConfirm(".+", "Escriba la nueva Pregunta", "El campo no puede ir vacio!");
            if (prePregunta == null) {
                return;
            }
            
            preRespuesta = Comun.regexConfirm(".+", "Escriba la Respuesta a:\n" + prePregunta, "El campo no puede ir vacio!");
            if (preRespuesta == null) {
                return;
            }
            
            if (chatBot.insertarPregunta(preNodo, prePregunta, preRespuesta)) {
                JOptionPane.showMessageDialog(
                        null, 
                        ("Nueva Pregunta creada con exito!"), 
                        "Banco ABC", 
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }else{
                JOptionPane.showMessageDialog(
                        null, 
                        ("No se puede añadir la pregunta al nodo " + preNodo + "\nIntente con otro!"), 
                        "Banco ABC", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }
        
        
    }
    
    /**
     * Este método prepara las preguntas para un nodo determinado en el árbol 
     * del chatbot. Se solicita al usuario que ingrese el ID del nodo y 
     * las preguntas para ese nodo se recuperan del chatbot. 
     * Si el nodo existe y tiene preguntas, se llama al método 
     * {@code mostrarPreguntasChatbot()} para mostrar las preguntas al usuario.
     */
    public static void prepararPreguntasChatbot(){
        
        String preNodo;
        ListaPreguntas lista;
        while (true) {            
            preNodo = Comun.regexConfirm("[1-2]+", "Escriba el ID del Nodo para ver las preguntas", "Escriba un ID en el formato valido!");
            if (preNodo == null) {
                return;
            }
            
            lista = chatBot.getListapreguntas(preNodo);
            if (lista != null) {
                mostrarPreguntasChatbot(lista);
                return;
            } else{
                JOptionPane.showMessageDialog(
                        null, 
                        ("El Nodo " + preNodo + " No se encontro o No tiene preguntas.\nIntente con otro!"), 
                        "Banco ABC", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
    }

    //OtrosMetodos
    
    /**
     * Requisito de javaDoc, ignorar.
     */
    public BancoABC() {
    }
    
    
    
}
