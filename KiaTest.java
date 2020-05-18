
package kia;

import java.util.Scanner;
public class KiaTest  {
   
    private int taxiwheels;
    private int taxirange;
    private int taxip;
    
      public int KiaTest1(int c){
                   
          this.taxiwheels=c;
          return taxiwheels;
      }
      
      
      public int KiaTest2(int c){
                  
          this.taxirange=c;
          return taxirange;
      }
      
        public int KiaTest3(int c){
                 
          this.taxip=c;
          return taxip;
      }
      
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
    
       KiaTest a= new KiaTest();
         System.out.print("lutfen tekerlekler sayisini giriniz :  " );
         int w=sc.nextInt();
          System.out.print("arabanın Range : ");
         int R=sc.nextInt();
         
            System.out.print(" P : ");
         int P=sc.nextInt();
                
         KiaTaxi rio =new KiaTaxi( a.KiaTest1(w), a.KiaTest2(R), a.KiaTest3(P));
         KiaPickup car1 =new KiaPickup(6, 2500, 4000);
         //kiaTaxi
         System.out.println("Kia Taxi....");
         rio.print();
        rio.costwheels();
        //kia Pickup
        System.out.println("Kia Pickup....");
        car1.print();
      
         System.out.print("lutfen pickup sayisi giriniz : ");
         
         int pickupsayi=sc.nextInt();
         System.out.println("fiyat :"+car1.Pickuphesap(pickupsayi));      

     System.out.println("lutfen Taxi sayisi giriniz ");
       
         int taxisayi=sc.nextInt();
      
   System.out.println("fiyat :"+rio.Taxihesap(taxisayi)); 

  
  

     }
      
 
    
}
