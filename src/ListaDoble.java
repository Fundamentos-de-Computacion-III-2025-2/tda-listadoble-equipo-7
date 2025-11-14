public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato){


    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato){

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){
        if (listaVacia() || dato < inicio.dato) {
            insertarInicio(dato);
        } else {
            NodoDoble actual = inicio;
            while (actual.siguiente != null && actual.siguiente.dato < dato) {
                actual = actual.siguiente;
            }
            actual.siguiente = new NodoDoble(dato,actual.siguiente,actual.anterior);
        }

    }


    //Eliminar al inicio
    public int eliminarInicio(){

        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){

        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){

        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){
        NodoDoble actual = inicio;
        while(actual!=null){
            if (actual.dato==elemento){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;


    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){

    }


}