
public class Cliente {
  
  //variables del objeto.
  private int prepinky, preblanco, prejumbo, cjumbo, cblanco, cpinky, ccliente;
  private String ncliente;
  

  
 //metodo constructor de class cliente.
  public Cliente(int pinky, int blanco, int jumbo){ 
    ccliente=0;
    ncliente=" ";
    prepinky=pinky; 
    preblanco=blanco;
    prejumbo=jumbo;
    cpinky=0;
    cblanco=0;
    cjumbo=0;
  }
  
 //metodo get para las cantidades.
  public int get(int tipo){ 
    switch(tipo){
      case 1: return cpinky;
      case 2: return cblanco;
      case 3: return cjumbo;
      case 4: return prepinky;
      case 5: return preblanco;
      case 6: return prejumbo;
      case 7: return ccliente;
      default: System.out.print("Error!! Int no accesible."); return -1; 
      }
  }
  // get nombre del cliente.
  
  public String getname(){
  return ncliente;
  }
 
//metodo set para cantidades.
  public void set(int tipo, int valor){ 
    if(tipo==1){cpinky=valor;}
    else if (tipo==2){cblanco=valor;}
    else if (tipo==3){cjumbo=valor;}
    else if (tipo==4){ccliente=valor;}
    else if(tipo==5){prepinky=valor;}
    else if(tipo==6){preblanco=valor;}
    else if(tipo==7){prejumbo=valor;}
  }
 //metodo set para nombre.
  public void setname(String name){
  ncliente=name;
  }
 
//metodo para mostrar los totales.
  public int showtotal(int tipo){ 
    if(tipo==1){return (cpinky*prepinky);}
    else if(tipo==2){return (cblanco*preblanco);}
    else if(tipo==3){return (cjumbo*prejumbo);}
    else{return ((cpinky*prepinky)+(cblanco*preblanco)+(cjumbo*prejumbo));}
  }
 
  
}//fin de la clase cliente.

// realiza los calculos de los descuentos.
class descuento{ 
  //valores minimo de cantidad para descuento a y b.
  static int base1=5; 
  static int base2=10; 
  //descuentos a y b, para cada camaron.
  static int desc1=5; 
  static int desc2=10; 
  static int desc3=7; 
  static int desc4=15; 
  static int desc5=4; 
  static int desc6=7;
  
   
   public static int pinky(int cant, int val){
    if(cant<base1 && cant>=0){return cant * val;}
    if(cant>=base1 && cant<base2){return ((cant * val)-(((cant * val)*desc1)/100));}
    if(cant>=base2){return ((cant * val)-(((cant * val)*desc2)/100));}
    else{System.out.println("Error pinky!! La cantidad de kilos es invalida."+cant); return -1;}
   }
  
  public static int blanco(int cant, int val){
    if(cant<base1 && cant>=0){return cant * val;}
    if(cant>=base1 && cant<base2){return ((cant * val)-(((cant * val)*desc3)/100));}
    if(cant>=base2){return ((cant * val)-(((cant * val)*desc4)/100));}
    else{System.out.println("Error blanco!! La cantidad de kilos es invalida."+cant); return -1;}
  }
  
  public static int jumbo(int cant, int val){
    if(cant<base1 && cant>=0){return cant * val;}
    if(cant>=base1 && cant<base2){return ((cant * val)-(((cant * val)*desc5)/100));}
    if(cant>=base2){return ((cant * val)-(((cant * val)*desc6)/100));}
    else{System.out.println("Error jumbo!! La cantidad de kilos es invalida."+cant); return -1;}
  }
  
  public static void set(int tipo, int valor){
  if(tipo==1){base1=valor;}
    else if (tipo==2){base2=valor;}
    else if (tipo==3){desc1=valor;}
    else if (tipo==4){desc2=valor;}
    else if(tipo==5){desc3=valor;}
    else if(tipo==6){desc4=valor;}
    else if(tipo==7){desc5=valor;}
    else if(tipo==8){desc6=valor;}
  }
  
  public static int get(int tipo){ 
    switch(tipo){
      case 1: return base1;
      case 2: return base2;
      case 3: return desc1;
      case 4: return desc2;
      case 5: return desc3;
      case 6: return desc4;
      case 7: return desc5;
      case 8: return desc6;
      default: System.out.print("Error!! Int no accesible."); return -1; 
      }
  }
  
 }//fin de la clase descuento.
 
 