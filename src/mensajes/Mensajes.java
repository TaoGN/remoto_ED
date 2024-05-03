/**
 * 
 */
package mensajes;

/**
 * Esta clase proporciona métodos para mostrar diferentes tipos de mensajes: de
 * bienvenida, opciones de menú y un mensaje de despedida. Esta clase se centra
 * en la interacción con el usuario.
 * 
 * @author Alejandro García
 * @version 1.0
 */
public class Mensajes {

    /**
     * Muestra un mensaje inicial de bienvenida a la tienda virtual.
     */
    public static void Mensaje_Inicial() {
        System.out.println(
                "Bienvenido a la tienda virtual\n\n" + "El programa simula una tienda que vende juegos, música y cine\n"
                        + "Solamente se pueden vender productos si aparecen disponibles en la tienda\n");
    }

    /**
     * Muestra las opciones del menú disponibles.
     */
    public static void Opciones_Menu() {

        System.out.println("\nSeleccione que desea realizar:\n\n" + "\t1. Mostrar productos. (Listar productos)\n"
                + "\tSALIR --> Pulse cualquier otro número\n");
    }

    /**
     * Muestra un mensaje de despedida al usuario.
     */
    public static void Mensaje_Fin() {

        System.out.println("---- Gracias por usar este software. ----");
    }

    /**
     * Muestra un mensaje de error.
     * 
     * @param mensaje Mensaje de error a mostrar.
     */
    public static void imprimirError(String mensaje) {
        System.out.println("ERROR:" + mensaje);

    }

}