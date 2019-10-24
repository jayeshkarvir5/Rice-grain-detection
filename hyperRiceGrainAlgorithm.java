
import java.util.Scanner;
 
class Main {
 public static void main(String[] args) {
 double burglary=0.002;
 double earthquake=0.001;
 double[]alarm={0.94,0.95,0.69,0.999};//tt,tf,ft,ff
 double[]david={0.91,0.05};
 double[]sophia={0.75,0.02};
 boolean[] listOfRelations=new boolean[5];
 double probability=1.0;
  Scanner sc=new Scanner(System.in);
 
 String[] values={"burglary happened?","earthquake happened?","alarm played?","david called?","sophia called?"};
  
   System.out.println("Enter 1 if the following events happen or 0 if they dont");
   for(int i=0;i<5;i++){
     System.out.println(values[i]);
     if(sc.nextInt()==1)
       listOfRelations[i]=true;     
     else     
       listOfRelations[i]=false;
   }
 
   if(listOfRelations[0]){
     probability=probability*burglary;
   }
   else{
     probability=probability*(1-burglary);
   }
 
  
   if(listOfRelations[1]){
     probability=probability*earthquake;
   }
   else{
     probability=probability*(1-earthquake);
   }
 
  
  
   if(listOfRelations[2]){
    
     if(listOfRelations[0]&&listOfRelations[1])
       probability=probability*alarm[0];
     if(listOfRelations[0]&&!listOfRelations[1])
       probability=probability*alarm[1];
     if(!listOfRelations[0]&&listOfRelations[1])
       probability=probability*alarm[2];
     if(!listOfRelations[0]&&!listOfRelations[1])
       probability=probability*alarm[3];
 
    
   }
   else{
    
     if(listOfRelations[0]&&listOfRelations[1])
       probability=probability*(1-alarm[0]);
     if(listOfRelations[0]&&!listOfRelations[1])
       probability=probability*(1-alarm[1]);
     if(!listOfRelations[0]&&listOfRelations[1])
       probability=probability*(1-alarm[2]);
     if(!listOfRelations[0]&&!listOfRelations[1])
       probability=probability*(1-alarm[3]);
 
   }
 
   if(listOfRelations[3]){
     if(listOfRelations[2])
       probability=probability*david[0];
     else
       probability=probability*david[1];
 
   }
   else{
     if(listOfRelations[2])
       probability=probability*(1-david[0]);
     else
       probability=probability*(1-david[1]);
 
   }
 
//sophia
   if(listOfRelations[4]){
     if(listOfRelations[2])
       probability=probability*sophia[0];
     else
       probability=probability*sophia[1];
 
   }
   else{
     if(listOfRelations[2])
       probability=probability*(1-sophia[0]);
     else
       probability=probability*(1-sophia[1]);
 
   }
 
   System.out.println("The fnal probability is: "+probability);
 
  
 
 
 
 }
}
