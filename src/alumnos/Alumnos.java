
package alumnos;




import java.util.ArrayList;
import titulos.TitulosSuperior;


public class Alumnos extends Persona{
    
    private TitulosSuperior titulo1, titulo2; 
    private ArrayList<TitulosSuperior> titulos;
     
      public void ver(){
       
        titulos=new ArrayList<TitulosSuperior>();
        for (int i = 0; i < 3; i++) {
        titulos.add(i, titulo1);
        titulos.add(i, titulo2);
        System.out.println(titulos.get(i));
           
       }
  }
    
    //Sobreescribiendo el constructor

    public Alumnos(String nombre,String apellido,String dni,int edad,TitulosSuperior titulo1) {
        super();
        this.titulo1 = titulo1;
       
    }
   

    public TitulosSuperior getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(TitulosSuperior titulo1) {
        this.titulo1 = titulo1;
    }

    public TitulosSuperior getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(TitulosSuperior titulo2) {
        this.titulo2 = titulo2;
    }
       
       
   }

   

    
    
    
    
    

   
