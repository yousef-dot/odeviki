
package kia;
import java.util.Scanner; 

public class KiaTaxi extends Kia{
            Scanner sc = new Scanner(System.in); 

    private  int P ;
     public  KiaTaxi (int wheels , int range ,int p){
         super(wheels , range);
         P=p;
     }
   public void print(){
        super.printKia();
        System.out.println("P :"+this.P);
    }
    public  void costwheels(){
        
        int cost =super.getWheels()*5000;
        System.out.println("cost ="+cost);
    }
    
  
       public int Taxihesap( int arabasayisi){
      
        int sonuc=arabasayisi*10000*2/3;
       
     return sonuc;
    }
     
    
}
