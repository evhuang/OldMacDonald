class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String sound2)     {         
         myType = type;         
         if((int)(Math.random() * 10) < 5){mySound = sound;}  
        else  {mySound = sound2;}    
     }     
     public Chick()     {         
         myType = "chick"; 
         if((int)Math.random() * 10 - 5 < 0)        
         {
            mySound = "cheep";  
         }  
         else  
         {
            mySound = "cluck";
         }
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}