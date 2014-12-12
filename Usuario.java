
/**
 * Representa a las personas que usan la aplicación
 * 
 * @author (Juan Carlos Aragon) 
 * @version (a version number or a date)
 */
public class Usuario
{
   private String nombre;
   
   private float proteinasTotales;
   private float carbohidratosTotales;
   private float grasasTotales;
   private float caloriasTotales;
   
   public Usuario(String nombre){
       this.nombre = nombre;
       
       proteinasTotales = 0;
       carbohidratosTotales = 0;
       grasasTotales = 0;
       caloriasTotales = 0;
    }
    /**
     * Creamos un método que permite al usuario comer una cantidad de un alimento.
     */
   public void comer(Alimento comida, float gramosIngeridos){
       proteinasTotales = proteinasTotales + cantidadTotal(comida.getProteinas(), gramosIngeridos);
       carbohidratosTotales = carbohidratosTotales + cantidadTotal(comida.getCarbohidratos(), gramosIngeridos);
       grasasTotales = grasasTotales + cantidadTotal(comida.getGrasas(), gramosIngeridos);
       caloriasTotales = caloriasTotales + cantidadTotal(comida.calorias(), gramosIngeridos);
    }
    
   /**
    * Creamos un método que nos permite ver por pantalla las estadísticas del usuario
    */
   public void verEstadistica(){
       System.out.println("Nombre: \t\t\t\t\t" + nombre
                          + "\nGramos de proteinas ingeridos:\t\t\t" + proteinasTotales
                          + "\nGramos de carbohidratos ingeridos:\t\t" + carbohidratosTotales
                          + "\nGramos de grasas ingeridos:\t\t\t" + grasasTotales
                          + "\nCalorias ingeridas:\t\t\t\t" + caloriasTotales);
       
    }
   /**
    * Creamos un método privado que permite calcular que cantidad de nutriente
    * ha ingerido con determinado alimento
    */
   private float cantidadTotal(float tasa, float gramosTotales){
       float cantidadIngerida;
       
       cantidadIngerida = tasa * (gramosTotales/100);
       
       return cantidadIngerida;
    }
   
}
