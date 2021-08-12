import org.graalvm.compiler.nodes.graphbuilderconf.IntrinsicContext.SideEffectsState;

public class Animal {
   
    //atributos
    Int ojos;
    String name;
    String raza;
    boolean domestico;

    //Constructor 1

    Animal(){
        ojos=2;
        name="";
        raza="";
        domestico= false;
    }

    //constructor 2

    Animal(int ojos, String name, String raza, boolean domestico){
        
    }


    //método

    public void informacion(){
        System.out.println("La Detalles del Animal: ");
        System.out.println("Nombre: "+ name);
        System.out.println("Raza: "+ raza);
        System.out.println("domestico: "+ domestico);

    }

    //Este método debe imprimir en pantalla lo que el objeto come, se creativo. 
    public void comer(){

    }

    //*Disfruta de tu código, no te bloquees. */
}
