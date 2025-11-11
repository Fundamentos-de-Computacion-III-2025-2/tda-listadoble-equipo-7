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

    }


    //Eliminar al inicio
    public int eliminarInicio(){

        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){
        int elemento = -1;
        if (fin == null){
            elemento = eliminarInicio();
        } else if (!listaVacia()) {
            elemento = fin.dato;
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){

        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){

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
        NodoDoble actual = fin;
        System.out.println();
        while (actual != null){
            System.out.print(" <-- "+actual.dato);
            actual = actual.anterior;
        }
    }
}