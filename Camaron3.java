//lo principal del gui se crea y controla de aqui en adelante.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class Camaron3 extends JFrame{
  
  //componentes del gui
  
  private GridBagLayout esquema;
  private GridBagConstraints rest;
  
  private JLabel etiqueta0;
  private JLabel etiqueta1;
  private JLabel etiqueta2;
  private JLabel etiqueta3;
  private JLabel etiqueta4;
  private JLabel etiqueta5;
  private JLabel etiqueta6;
  private JLabel etiqueta7;
  private JLabel etiqueta8;
  private JLabel etiqueta9;
  private JLabel etiqueta10;
  private JLabel etiqueta11;
  
  
  private JTextField texto1;
  private JTextField texto2;
  private JTextField texto3;
  private JTextField texto4;
  private JTextField texto5;
  
  //pinky,jumbo,blanco,des1,des2,cantidad minima para descuento 1 y 2
  private JTextField pinky;
  private JTextField jumbo;
  private JTextField blanco;
  private JTextField descuentoA;
  private JTextField descuentoB;
  private JTextField pinkyA;
  private JTextField pinkyB;
  private JTextField jumboA;
  private JTextField jumboB;
  private JTextField blancoA;
  private JTextField blancoB;
  private JTextField busqueda;
  
  private JButton boton;
  private JButton boton2;
  private JButton boton3;
  
  private JTextArea registro;
  private JTextArea data;
  private JTextArea areaBusqueda;
  
  private JRadioButton pinkyButton;
  private JRadioButton blancoButton;
  private JRadioButton jumboButton;
  private ButtonGroup opcionesButton;

  //constructor de la ventana.
  public Camaron3(){
   super("Camaron Experience 4.0");
   
   //creacion de objetos del gui.
   etiqueta0 = new JLabel ("Bienvenido(a) al sistema Camaron Experience 4.0");
   etiqueta1 = new JLabel ("Nombre del Cliente:");
   etiqueta1.setToolTipText("Introduzca el nombre del cliente.");
   etiqueta2 = new JLabel ("Cédula del Cliente:");
   etiqueta2.setToolTipText("Introduzca el numero de cedula del cliente.");
   etiqueta3 = new JLabel ("Pinky (Kg)");
   etiqueta3.setToolTipText("Introduzca la cantidad de kilos de camarón: Pinky.");
   etiqueta4 = new JLabel ("Blanco (Kg)");
   etiqueta4.setToolTipText("Introduzca la cantidad de kilos de camarón: Blanco.");
   etiqueta5 = new JLabel ("Jumbo (Kg)");
   etiqueta5.setToolTipText("Introduzca la cantidad de kilos de camarón: Jumbo.");
   etiqueta6 = new JLabel ("---------- Totales ----------");
   etiqueta7 = new JLabel ("Valor de la Compra: ");
   etiqueta8 = new JLabel ("Valor con el descuento: ");
   etiqueta9 = new JLabel("Cambie el valor correspondiente en cada espacio.");
   etiqueta9.setToolTipText("Des. = son los descuentos de cada camaron. Cant. = la cantidad minima necesaria para el descuento.");
   etiqueta10 = new JLabel("Presione <ENTER>, para establecer el nuevo valor.");
   etiqueta11 = new JLabel("Ingrese el numero de cedula que desea buscar:    ");
   
   
   texto1 = new JTextField(12);
   texto2 = new JTextField(12);
   texto3 = new JTextField(4);
   texto4 = new JTextField(4);
   texto5 = new JTextField(4);
   
   pinky = new JTextField("Precio Pinky",10);
   jumbo = new JTextField("Precio Jumbo",10);
   blanco = new JTextField("Precio Blanco",10);
   descuentoA = new JTextField("Cant. mínima A (kg)",10);
   descuentoB = new JTextField("Cant. mínima B (kg)",10);
   pinkyA = new JTextField("Des. Pinky A (%)",10);
   pinkyB = new JTextField("Des. Pinky B (%)",10);
   jumboA = new JTextField("Des. Jumbo A (%)",10);
   jumboB = new JTextField("Des. Jumbo B (%)",10);
   blancoA = new JTextField("Des. Blanco A (%)",10);
   blancoB = new JTextField("Des. Blanco B (%)",10);
   busqueda= new JTextField(10);
   
   boton = new JButton("Calcular Compra");
   boton2 = new JButton("Mostrar Registro");
   boton3 = new JButton("Buscar");
   boton3.setToolTipText("Escriba la palabra: completo, para mostrar todos los datos.");
   
   registro = new JTextArea();
   registro.setEditable(false);
   data = new JTextArea();
   data.setEditable(false);
   data.setText("\nCrustáceos decápodos marinos o de agua dulce, \nconocidos comúnmente como camarones." +
    "\nSon relativamente fáciles de encontrar en todo el mundo, \ntanto en agua dulce, como en agua salada."+
      "\n-------------------------------------------------------------------------------------"+
       "\n\nCamarón Pinky.\n\n Nombre Cientifico: Caridea.\n\nColor: Rosado.\n\nTamaño: 35mm.");
   areaBusqueda = new JTextArea(12,22);
   areaBusqueda.setEditable(false);
   areaBusqueda.setText(" Escriba en el espacio el numero \n de cedula del cliente que desea buscar."+
                        "\n\n Escriba: completo. \n Para mostrar todos los datos \n de todos los clientes."+
                        "\n\n Escriba: borrar. \n Para borrar todos los datos \n de todos los clientes."+
                        "\n\n NOTA: Las cédulas apareceran con un 'C-', \n previo al numero. Es para uso del archivo.");
   
   pinkyButton= new JRadioButton("Pinky",true);
   blancoButton= new JRadioButton("Blanco",false);
   jumboButton= new JRadioButton("Jumbo",false);
   opcionesButton= new ButtonGroup();
   opcionesButton.add(pinkyButton);
   opcionesButton.add(blancoButton);
   opcionesButton.add(jumboButton);
   
   //JScrollPane scroll = new JScrollPane(registro);
   Box cuadro = Box.createHorizontalBox();
  cuadro.add(new JScrollPane(registro));
  Box cuadro2 = Box.createHorizontalBox();
  cuadro2.add(new JScrollPane(data));
  Box cuadro3 = Box.createHorizontalBox();
  cuadro3.add(new JScrollPane(areaBusqueda));
  
  
  
  //creando el primer panel; 
  esquema = new GridBagLayout();
  rest = new GridBagConstraints();
  JPanel panel1 = new JPanel(esquema);
  JPanel panel2 = new JPanel(new FlowLayout());
  JPanel panel3 = new JPanel(esquema);
  JPanel panel4 = new JPanel(new FlowLayout());
  
    
   //agregando los elementos al panel 1.
   rest.fill= GridBagConstraints.BOTH;
   agregar(etiqueta0, 0, 0, 4, 1);
   panel1.add(etiqueta0);//nombre del programa.
   agregar(etiqueta1,0,1,3,1);
   panel1.add(etiqueta1);//nombre cliente.
   agregar(texto1,0,2,3,1);
   panel1.add(texto1);
   agregar(etiqueta2,3,1,1,1);
   panel1.add(etiqueta2);//cedula cliente.
   agregar(texto2,3,2,1,1);
   panel1.add(texto2);
   
   agregar(etiqueta3,0,5,1,1);
   panel1.add(etiqueta3);//pinky.
   agregar(texto3,0,6,1,1);
   panel1.add(texto3);
   agregar(etiqueta4,1,5,1,1);
   panel1.add(etiqueta4);//blanco
   agregar(texto4,1,6,1,1);
   panel1.add(texto4);
   agregar(etiqueta5,2,5,1,1);
   panel1.add(etiqueta5);//jumbo.
   agregar(texto5,2,6,1,1);
   panel1.add(texto5);
   
   agregar(boton,3,5,1,2);
   panel1.add(boton); //calcular.
   agregar(etiqueta6,0,7,4,1);
   panel1.add(etiqueta6);//totales.
   agregar(etiqueta7,0,8,4,1);
   panel1.add(etiqueta7);//resultado1
   agregar(etiqueta8,0,9,4,1);
   panel1.add(etiqueta8);//resultado2
   
   agregar(boton2,0,10,4,1);
   panel1.add(boton2);//regristro
   rest.fill= GridBagConstraints.BOTH;
   rest.weighty = 3;
   rest.weightx = 3;
   agregar(cuadro,0,11,4,4);
   panel1.add(cuadro);
   
   //agregando los componentes a panel 2.
   panel2.add(etiqueta9);
   panel2.add(pinky);
   panel2.add(jumbo);
   panel2.add(blanco);
   panel2.add(descuentoA);
   panel2.add(descuentoB);
   panel2.add(pinkyA);
   panel2.add(pinkyB);
   panel2.add(jumboA);
   panel2.add(jumboB);
   panel2.add(blancoA);
   panel2.add(blancoB);
   panel2.add(etiqueta10);
   
   //agregar al panel 3.
   agregar(pinkyButton,0,0,1,1);
   panel3.add(pinkyButton);
   agregar(jumboButton,1,0,1,1);
   panel3.add(jumboButton);
   agregar(blancoButton,2,0,1,1);
   panel3.add(blancoButton);
   rest.fill= GridBagConstraints.BOTH;
   agregar(data, 0, 1, 3, 1);
   panel3.add(data);
   
   //agregando elementos al panel 4.
   panel4.add(etiqueta11);
   panel4.add(busqueda);
   panel4.add(boton3);
   panel4.add(cuadro3);
   
   
   //creando el tabbed y agragandolo a la ventana.
   JTabbedPane tabbed = new JTabbedPane();
   tabbed.addTab("Ventas",null,panel1,"Calcular Ventas");
   tabbed.addTab("Precios", null, panel2, "Cambiar los Precios de Camarón");
   tabbed.addTab("Enciclopedia",null,panel3,"Enciclopedia");
   tabbed.addTab("Busqueda",null,panel4,"Busqueda de datos de clientes");
   add(tabbed);
   
   //manejador de eventos.
   actions manejador = new actions();
   boton.addActionListener(manejador);
   boton2.addActionListener(manejador);
   boton3.addActionListener(manejador);
   pinky.addActionListener(manejador);
   jumbo.addActionListener(manejador);
   blanco.addActionListener(manejador);
   descuentoA.addActionListener(manejador);
   descuentoB.addActionListener(manejador);
   pinkyA.addActionListener(manejador);
   pinkyB.addActionListener(manejador);
   jumboA.addActionListener(manejador);
   jumboB.addActionListener(manejador);
   blancoA.addActionListener(manejador);
   blancoB.addActionListener(manejador);

   items manejador2 = new items();
   pinkyButton.addItemListener(manejador2);
   blancoButton.addItemListener(manejador2);
   jumboButton.addItemListener(manejador2);
  }
  
  //metodo para aplicar las restricciones y agregar al panel;
  
  private void agregar(Component componente, int x, int y, int ancho, int alto){
  rest.gridx= x;
  rest.gridy = y;
  rest.gridwidth= ancho;
  rest.gridheight= alto;
  esquema.setConstraints(componente, rest);
  }
  
  private class actions implements ActionListener{
    
    Cliente pedido = new Cliente(5840,10045,23200);
    DatosSaved archivo = new DatosSaved();
    ListaClientes listaConDatos = new ListaClientes();
    
    int contador=0;
    int i,compra,desc;
    boolean corte=false;
      //variables de la clase, para almacenar diferentes clientes.
   String[] namclientes= new String[20];
   int[][] datclientes= new int[20][6];
   
    
    public void actionPerformed (ActionEvent evento){
  
//carga los archivos precios.txt y clientes.txt
//ambos archivos se cargan constantemente.
      archivo.cargarVal(pedido);
      archivo.cargarCli(listaConDatos);
      
      
      if(evento.getSource()==boton){
          try{
        pedido.setname(texto1.getText());//nombre
        pedido.set(4,Integer.parseInt(texto2.getText()));//cedula
        pedido.set(1,Integer.parseInt(texto3.getText()));//pinky
        pedido.set(2,Integer.parseInt(texto4.getText()));//blanco
        pedido.set(3,Integer.parseInt(texto5.getText()));//jumbo
        
        compra=pedido.showtotal(25);//total del valor de la compra
        desc=(descuento.pinky(pedido.get(1),pedido.get(4))+ descuento.blanco(pedido.get(2),pedido.get(5))+
              descuento.jumbo(pedido.get(3),pedido.get(6)));//valor tras el descuento.
        
        etiqueta7.setText("Valor de la Compra: "+compra+" colones.");
        etiqueta8.setText("Valor tras el descuento: "+desc+" colones.");
        
    //aqui se guardan las ventas de forma temporal en un array, para mostrar las ventas del dia.
        namclientes[contador]=pedido.getname();//nombre
        datclientes[contador][0]=pedido.get(1);//pinky
        datclientes[contador][1]=pedido.get(2);//blanco
        datclientes[contador][2]=pedido.get(3);//jumbo
        datclientes[contador][3]=pedido.get(7);//cedula
        datclientes[contador][4]=compra;//compra
        datclientes[contador][5]=desc;//descuento
        
    //aqui se guardan los datos del cliente de forma permanente, para obtenerlas a final del mes.
    //si el numero de cedula ya existe, se sobre escribe.
        int clave = listaConDatos.buscarElemento("C-"+texto2.getText());
        if(clave<0){
        listaConDatos.agregarElemento("C-"+texto2.getText());//cedula
        listaConDatos.agregarElemento(texto1.getText());//nombre
        listaConDatos.agregarElemento(String.valueOf(desc));//compra
        listaConDatos.agregarElemento(texto3.getText());//pinky
        listaConDatos.agregarElemento(texto4.getText());//blanco
        listaConDatos.agregarElemento(texto5.getText());//jumbo
        }
        if(clave>=0){
        listaConDatos.modifElemento("C-"+texto2.getText(),clave,1);//cedula
        listaConDatos.modifElemento(texto1.getText(),clave+1,1);//nombre
        listaConDatos.modifElemento(String.valueOf(desc),clave+2,2);//compra
        listaConDatos.modifElemento(texto3.getText(),clave+3,2);//pinky
        listaConDatos.modifElemento(texto4.getText(),clave+4,2);//blanco
        listaConDatos.modifElemento(texto5.getText(),clave+5,2);//jumbo
        }
     //agrega al archivo clientes.txt la lista completa.
        archivo.cleanCli();//se vacia el archivo, para que no se repita el guardado.
        int i;
        int e=0;
        for(i=listaConDatos.getSize();i>0;i--){
        archivo.guardarCli(listaConDatos.getVal(e));
        e++;}
        archivo.guardarCli("Fin del archivo.");// para saber donde termina.
        listaConDatos.limpiarLista();//se limpia la lista, para que no se agreguen más elementos.
            
            
        
        
        
        contador++;
          }
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(null, "ERROR!\nDebe Introducir Valores Validos.");}
        
  }
        if (evento.getSource()==boton2){
          corte = false;
          if(datclientes[i][3]!=0){
            corte = true;
            for(i=0;i<contador;i++){
            registro.append("Nombre: " + namclientes[i]+". Cedula: "+datclientes[i][3]+".\n"
                              +"Pinky: "+datclientes[i][0]+"kg. Blanco: "+datclientes[i][1]+"kg. Jumbo: "+
                            datclientes[i][2]+"kg.\n"+"Total con descuento: "+datclientes[i][5]+" colones.\n\n");
          }
          }
          if(corte==true){registro.append("------------------Fin del Registro-------------------\n"+ 
                                            "Cantidad de ventas realizadas en el dia: "+contador+". \n");}
          listaConDatos.limpiarLista();
        }
        
        //toma el valor de los espacios del panel2 y los establece en la clase cliente/descuento.
        try{
        if(evento.getSource()==pinky){pedido.set(5,Integer.parseInt(pinky.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==jumbo){pedido.set(7,Integer.parseInt(jumbo.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==blanco){pedido.set(6,Integer.parseInt(blanco.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==descuentoA){descuento.set(1,Integer.parseInt(descuentoA.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==descuentoB){descuento.set(2,Integer.parseInt(descuentoB.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==pinkyA){descuento.set(3,Integer.parseInt(pinkyA.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==pinkyB){descuento.set(4,Integer.parseInt(pinkyB.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==jumboA){descuento.set(7,Integer.parseInt(jumboA.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==jumboB){descuento.set(8,Integer.parseInt(jumboB.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==blancoA){descuento.set(5,Integer.parseInt(blancoA.getText()));listaConDatos.limpiarLista();}
        if(evento.getSource()==blancoB){descuento.set(6,Integer.parseInt(blancoB.getText()));listaConDatos.limpiarLista();}
        } catch(NumberFormatException ex){JOptionPane.showMessageDialog(null, "ERROR!\nDebe Introducir Valores Validos.");}

        //se utiliza el boton3 del panel4. "buscar".
        if(evento.getSource()==boton3){
        String elemento = "C-"+busqueda.getText();
        int clave2 = listaConDatos.buscarElemento(elemento);
        if(clave2>=0){
        areaBusqueda.setText("Nombre: "+listaConDatos.getVal(clave2+1)+".\nCedula: "+listaConDatos.getVal(clave2)+ 
                             "\nVentas totales: "+listaConDatos.getVal(clave2+2)+".\nPinky: "+
                             listaConDatos.getVal(clave2+3)+"Kg"+".\nBlanco: "+listaConDatos.getVal(clave2+4)+"Kg"+
                             ".\nJumbo: "+listaConDatos.getVal(clave2+5)+"Kg.");
        }
        else areaBusqueda.setText("Cédula no encontrada.");
       
        if(busqueda.getText().toLowerCase().equals("completo")){
          areaBusqueda.setText("Lista Completa:\n");
          int e=listaConDatos.getSize();
          int i;
          for(i=0;i<e;i=i+6){
            areaBusqueda.append("\nNombre: "+listaConDatos.getVal(i+1)+".\nCedula: "+listaConDatos.getVal(i)+ 
            "\nVentas totales: "+listaConDatos.getVal(i+2)+".\nPinky: "+
            listaConDatos.getVal(i+3)+"Kg"+".\nBlanco: "+listaConDatos.getVal(i+4)+"Kg"+
            ".\nJumbo: "+listaConDatos.getVal(i+5)+"Kg."+"\n");
            
          }
          areaBusqueda.append("\nLista completada. De "+listaConDatos.getSize()/6+" elementos.");
        }
        archivo.cleanCli();
        int i;
        int e=0;
        for(i=listaConDatos.getSize();i>0;i--){
        archivo.guardarCli(listaConDatos.getVal(e));
        e++;}
        archivo.guardarCli("Fin del archivo.");
        listaConDatos.limpiarLista();
        if(busqueda.getText().toLowerCase().equals("borrar")){archivo.cleanCli();
          archivo.guardarCli("Fin del archivo.");areaBusqueda.setText("Datos borrados.");}
        }
        archivo.guardarVal(pedido);//guarda los datos en el pedido.
        
}

}//fin de la clase actions
  
  private class items implements ItemListener{
  
    public void itemStateChanged(ItemEvent evento){
      Blanco blancoob = new Blanco();
  Pinky pinkyob = new Pinky();
  Jumbo jumboob = new Jumbo();
      if(pinkyButton.isSelected()){data.setText(pinkyob.data());}
      else if(blancoButton.isSelected()){data.setText(blancoob.data());}
      else if(jumboButton.isSelected()){data.setText(jumboob.data());}
      
    }
    
    
  } 
  
  
}