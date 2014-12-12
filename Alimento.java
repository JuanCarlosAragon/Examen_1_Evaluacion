
/**
 * Clase que permite almacenar la descripción de un alimento con su porcentaje de 
 * proteinas, carbohidratos y grasas.
 * 
 * @author (Juan Carlos Aragón) 
 * @version (a version number or a date)
 */
public class Alimento
{
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private String nombre;
    //Declaramos nuestras constantes
    private int incrementoProteinas = 4;
    private int incrementoCarbohidratos = 4;
    private int incrementoGrasas = 9;
    
    
    /**
     * Creamos el constructor de la clase donde podemos introducir las caracteristicas
     * del alimento.
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas){
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
    
    /**
     * Creamos el método que muestra por pantalla las características del alimento
     */
    public void muestraDatos(){
        System.out.println("Nombre: \t \t \t\t" + nombre 
                            + "\nProteinsa por cada 100 gramos: \t\t" + proteinas
                            + "\nCarbohidratos por cada 100 gramos:\t" + carbohidratos
                            + "\nGrasas por cada 100 gramos:\t\t" + grasas
                            + "\nCalorias:\t\t\t\t" + calorias()
                            + "\nComponente/s mayoritario/s:\t\t" + componenteMayoritario());
    }
    /**
     * Hacemos un método privado que calcula las calorias del alimento
     */
    public float calorias(){
        float totalCalorias = (proteinas * incrementoProteinas) 
                              + (carbohidratos * incrementoCarbohidratos)
                              + (grasas * incrementoGrasas);
        
        return totalCalorias;
    }
    
    /**
     * Creamos un metodo que retorna los componentes mayoritarios del alimento
     */
    public String componenteMayoritario(){
        String componente = "";
        if(proteinas >= carbohidratos && carbohidratos >= grasas){
            componente = "Proteinas";
            if(proteinas == carbohidratos && proteinas != grasas){
                componente = componente + " y Carbohidratos";
            }
            if(proteinas == carbohidratos && carbohidratos == grasas){
                componente = componente + ", Carbohidratos y Grasas";
            }
        }
        if(carbohidratos >= proteinas && proteinas >= grasas){
             componente = "Carbohidratos";
            if(carbohidratos == proteinas && carbohidratos != grasas){
                componente = componente + " y Proteinas";
            }
            if(carbohidratos == proteinas && proteinas == grasas){
                componente = componente + ", Proteinas y Grasas";
            }
        }
        if(grasas >= proteinas && proteinas >= carbohidratos){
             componente = "Grasas";
            if(grasas == proteinas && carbohidratos != grasas){
                componente = componente + " y Proteinas";
            }
            if(carbohidratos == proteinas && proteinas == grasas){
                componente = componente + ", Proteinas y Carbohidratos";
            }
        }
        return componente;
    }
    /**
     * Creamos los metodos que servirán para comunicarse con la clase Usuario
     */
    public float getProteinas(){
        return proteinas;
    }
    public float getCarbohidratos(){
        return carbohidratos;
    }
    public float getGrasas(){
        return grasas;
    }
    public String getNombre(){
        return nombre;
    }

}
