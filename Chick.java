class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private String myGrownSound;      
     public Chick(String type, String sound, String sound2)     {         
         myType = type;         
         mySound = sound; 
         myGrownSound = sound2;
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound()
     {
     	int num = (int)(Math.random()*3);
     	if (num == 0)
     	{
     		return mySound;
     	}
     	else
     	{
     		return myGrownSound;
     	}
     }     
     public String getType(){return myType;} 
}