class Family
{
string a="My family";
string b="Pinni family";
public void group()
{
System.out.println(a+"and"+b+" We form a Group"); 
}
}

class Tree extends Family
{
string c="Chinnu family";
string d="Vijju family";
public void  huge()
{
super.group();
System.out.println(c+"and"+d+We form a Group");
}
}


class Main
{
public static void main(String args[])
{
Tree T=new Tree();
System.out.println("haiiii");
T.huge();
}
}
