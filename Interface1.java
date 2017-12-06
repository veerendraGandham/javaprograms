interface Employee{  
void proj();  
}  
  
class Gm1 implements Employee{  
public void proj(){System.out.println("Proj cmplt thru gm1");}  
}  
class Gm2 implements Employee{  
public void proj(){System.out.println("Proj cmplt thru gm2");}  
}  
  
class idGeneration{  
public static void main(String args[]){  
	Employee e=new Gm1();  
e.proj();  
}}
