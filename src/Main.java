import javax.swing.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */
        public static void main(String[] args) {

            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();

            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+ //TODO @Félix Espejo Alehtse María
                                    "2. Insertar un elemento al final\n"+ //TODO @Tapia Fimbres Gerardo
                                    "3. Insertar un elemento en orden\n"+ //TODO @López Gonzáles Andrea Guadalupe
                                    "4. Eliminar un elemento al inicio\n"+ //TODO @Tapia Fimbres Gerardo
                                    "5. Eliminar un elemento al final\n"+ //TODO @Montaño Lares Leonardo
                                    "6. Eliminar un elemento\n"+ //TODO @Félix Espejo Alehtse María
                                    "7. Buscar un elemento\n"+ //TODO @López Gonzáles Andrea Guadalupe
                                    "8. Mostrar los datos de inicio a fin\n"+
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @Montaño Lares Leonardo
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio TODO @Félix Espejo Alehtse María
                            break;
                        case 2://Insertar un elemento al final @Tapia Fimbres Gerardo
                            elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a insertar al final:"));
                            lista.insertarFinal(elemento);
                            JOptionPane.showMessageDialog(null, "Elemento " + elemento + " insertado al final");
                            break;
                        case 3: //Insertar en orden TODO @López Gonzáles Andrea Guadalupe
                            break;
                        case 4: //Eliminar al inicio @Tapia Fimbres GerardoS
                            int eliminadoInicio = lista.eliminarInicio();
                            if(eliminadoInicio == -1){
                                JOptionPane.showMessageDialog(null, "La lista está vacía, no se puede eliminar");
                            } else {
                                JOptionPane.showMessageDialog(null, "Elemento eliminado al inicio: " + eliminadoInicio);
                            }
                            break;
                        case 5: //Eliminar al final TODO @Montaño Lares Leonardo
                            break;
                        case 6: //Eliminar TODO @Félix Espejo Alehtse María
                            break;
                        case 7: //Buscar elemento TODO @López Gonzáles Andrea Guadalupe
                            break;
                        case 8: //MostrarLista
                            lista.mostrarInicioFin();
                            break;
                        case 9: //MostrarLista TODO @Montaño Lares Leonardo
                            lista.mostrarFinInicio();
                            break;
                        case 10: //Salir
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}