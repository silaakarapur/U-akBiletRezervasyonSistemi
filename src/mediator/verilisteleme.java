package mediator;

/**
 *
 * @author Sila
 */
public abstract class verilisteleme {
   protected Mediator mediator;
   public verilisteleme( final Mediator mediator){
       this.mediator= mediator;
   }
   public abstract void verilistele();
   
   public abstract void biletsil();
}
