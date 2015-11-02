class NamedCow extends Cow {      
     private String myName;     
     public NamedCow(String type, String sound, String name)     
     {         
         myName = name;            
     }     
     /*public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";     
     } */     
     //public String getSound(){return mySound;}  
     public String getName(){return myName;}
     //public String getType(){return myType;} 
}
