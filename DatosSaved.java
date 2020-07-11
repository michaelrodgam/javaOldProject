import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

//esta clase se encarga de las opereciones de guardar y cargar datos de un archivo.
public class DatosSaved{
    public BufferedWriter entrPre;
    BufferedReader lectPre;
    BufferedWriter entrCli;
    BufferedReader lectCli;
    File archivo= new File("precios.txt");
    File archivo2= new File("clientes.txt");

//el constructor verifica que exista el archivo.
    public DatosSaved(){
      try{
      if(!archivo.exists()){entrPre= new BufferedWriter(new FileWriter("precios.txt",false));entrPre.close();}
      if(!archivo2.exists()){entrPre= new BufferedWriter(new FileWriter("clientes.txt",false));entrPre.close();}
      }catch(IOException ioe){System.exit(1);}
     }
   
 //este metodo guarda los valores de precios y descuentos, en precios.txt
  public void guardarVal(Cliente pedido){
    try{
      entrPre= new BufferedWriter(new FileWriter("precios.txt",false));
      entrPre.write(pedido.get(4)+"-"+pedido.get(6)+"-"+pedido.get(5)+"-"+descuento.get(1)+"-"+descuento.get(2)+
                    "-"+descuento.get(3)+"-"+descuento.get(4)+"-"+descuento.get(7)+"-"+descuento.get(8)+"-"+
                    descuento.get(5)+"-"+descuento.get(6));
      entrPre.flush();
      entrPre.close();
    }catch(IOException ioe){System.exit(1);}
  }
  
  //este metodo carga los valores de los precios que estan en el archivo precios.txt
  public void cargarVal(Cliente pedido){
    String[] precios={"0","0","0","0","0","0","0","0","0","0","0"};
    String linea;
    try{
  lectPre= new BufferedReader(new FileReader("precios.txt"));
  linea=lectPre.readLine();
  precios=linea.split("-",11);
  }catch(IOException ioe){System.exit(1);}
  pedido.set(5,Integer.parseInt(precios[0]));
  pedido.set(7,Integer.parseInt(precios[1]));
  pedido.set(6,Integer.parseInt(precios[2]));
  descuento.set(1,Integer.parseInt(precios[3]));
  descuento.set(2,Integer.parseInt(precios[4]));
  descuento.set(3,Integer.parseInt(precios[5]));
  descuento.set(4,Integer.parseInt(precios[6]));
  descuento.set(7,Integer.parseInt(precios[7]));
  descuento.set(8,Integer.parseInt(precios[8]));
  descuento.set(5,Integer.parseInt(precios[9]));
  descuento.set(6,Integer.parseInt(precios[10]));
  }
  
  //este metodo guarda los datos del cliente.
  public void guardarCli(String elemento){
    try{
      entrCli= new BufferedWriter(new FileWriter("clientes.txt",true));
      entrCli.write(elemento);
      entrCli.newLine();
      entrCli.close();
    }catch(IOException ioe){System.exit(1);}
  }

//este metodo se encarga de limpiar el archivo, luego de ser cargado a la lista.
  public void cleanCli(){
    try{
      entrCli= new BufferedWriter(new FileWriter("clientes.txt",false));
      entrCli.write("");
      entrCli.close();
    }catch(IOException ioe){System.exit(1);}
  }

//este metodo carga los datos a la lista.
  public void cargarCli(ListaClientes lista){
    try{
  lectCli= new BufferedReader(new FileReader("clientes.txt"));
    String linea = lectCli.readLine();
    if(linea!=null){
    while(!linea.equals("Fin del archivo.")){
    lista.agregarElemento(linea);
    linea=lectCli.readLine();
    }}
    }catch(IOException ioe){System.exit(1);}
  }

}