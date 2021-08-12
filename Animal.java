import org.graalvm.compiler.nodes.graphbuilderconf.IntrinsicContext.SideEffectsState;

public class Animal {
   
    //atributos
    Int ojos;
    String name;
    String raza;
    boolean domestico;

    Animal(){
        ojos=2;
        name="";
        raza="";
        domestico= false;
    }

    Animal(int ojos, String name, String raza, boolean domestico){
        
    }

    public void informacion(){
        System.out.println("La Detalles del Animal: ");
        System.out.println("Nombre: "+ name);
        System.out.println("Raza: "+ raza);
        System.out.println("domestico: "+ domestico);

    }

    public void comer(){

    }
}
