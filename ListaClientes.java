import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// esta clase se encarga de manejar la lista con datos de los clientes.
public class ListaClientes {
  ArrayList <String> lista;
  
//al iniciar el objeto se crea una lista vacia.
  public ListaClientes(){
    lista = new ArrayList <String> ();
  }
 
//este metodo agrega elementos nuevos a la lista.
  public void agregarElemento(String elemento){
  lista.add(elemento);
  }
  
//este metodo sobre escribe elementos
  public void modifElemento(String elemento, int clave, int tipo){
    String elementoB=elemento;
    if(tipo == 2){
    int valor1= Integer.parseInt(lista.get(clave));
    int valor2=Integer.parseInt(elemento);
    elementoB=String.valueOf(valor1+valor2);
    }
    lista.set(clave, elementoB);
  }
  

//este metodo borra la lista completa.
  public void limpiarLista(){
  Iterator <String> iterador = lista.iterator();
  while(iterador.hasNext()){lista.contains(iterador.next());iterador.remove();}
  
  }
 
//este metodo busca un elemento en la lista.
  public int buscarElemento(String elemento){
    int i;
    int e=0;
    int posicion = -1;
    for(i=lista.size();i>0;i--){
      if(elemento.equals(lista.get(e))){posicion = e;};e++;}
    return posicion;
  }
  
  public String getVal(int valor){return lista.get(valor);}
  public int getSize(){return lista.size();}
  
//imprime la lista completa.
  public void imprimirLista(){
    int i;
    int e=0;
    for(i=lista.size();i>0;i--){
    System.out.println(lista.get(e));e++;}
    System.out.println("Fin de la lista.");
      }
  }