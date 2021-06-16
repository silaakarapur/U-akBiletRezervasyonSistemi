package mediator;



/**
 *
 * @author Sila
 */
public class Mediator {
    private Personel personel;
    private Yolcu yolcu;
    
    public void personelekle(final Personel personel){
        this.personel= personel;
    }
    public void yolcuekle(final Yolcu yolcu){
        this.yolcu= yolcu;
     
    }
    public void personelbiletsil(){
       
    }
    public void yolcubiletsil(){
       
    }
    public void personelverilisteleme(){
      
      // personel.verilistele();
    }
    public void yolcuverilisteleme(){
      // yolcu.verilistele();
    }
  
}
