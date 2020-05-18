
package kia;

import java.util.Scanner;


public class KiaPickup extends Kia{
     Scanner sc = new Scanner(System.in); 
    private int loadL;
    
    public KiaPickup(int wheels,int range , int loadL){
        super(wheels,range);
        this.loadL =loadL;
    }
    public  void print (){
        super.printKia();
        System.out.println("Load :"+this.loadL);
    }
    public  void fullRange(){
        int weight =this.loadL +super.getRange() ;
        System.out.println("Full Weight :"+weight);
    }
    
      public int Pickuphesap( int arabasayisi){
      
        int sonuc=arabasayisi*10000*2/6;
       
     return sonuc;
    }
     
       
       
 
    
}
