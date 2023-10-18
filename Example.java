
interface Example { 
void learnPAPL(); 
void learnDS(); 
void manageStudies(); 
} 
abstract class prg implements Example{ 
public void learnPAPL() 
{ 
System.out.println("Learn java"); 
} 
public void learnDS(){ 
System.out.println("Learn data str"); 
} 
} 
class student extends prg { 
public void manageStudies(){ 
System.out.println("Study"); 
} 
public static void main(String[] args) { 
student s1=new student(); 
s1.learnDS(); 
s1.learnPAPL(); 
s1.manageStudies(); 
} 
} 

