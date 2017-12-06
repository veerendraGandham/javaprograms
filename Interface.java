interface Student3{
void maths();
}

interface Student4 extends student3{
void physics();
}

class Faculty implements Student3,Student4{

public void maths(){System.out.println("This is maths....");}
public void physics(){System.out.println("This is Physics.....");}
}
class idGeneration{
public static void main(String args[]){
Faculty obj = new Faculty();
System.out.println("haiiii");
obj.physics();
obj.maths();
 }
}

