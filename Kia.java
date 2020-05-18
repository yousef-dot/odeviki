
package kia;
public class Kia {

  private int wheels;
  private int range;
  
    public Kia(int wheels,int range){
        super();
        this.wheels=wheels;
        this.range=range;
    }
 
    public Kia(){
       
        this.wheels=0;
        this.range=0;
    }
    public void printKia (){
        
        String output ="Wheels :"+this.wheels + "\n Range :"
                +this.range;
        System.out.println(output);
    }
    public  int getWheels(){
        return wheels;
    }
    public  int getRange(){
        return  range;
    }
    
   
    
   
}
