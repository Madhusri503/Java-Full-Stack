/*public class Instance                                                                                                                      
{
int num=10;
String name="ram";
static void InstanceVariable()
{
Instance obj=new Instance();
System.out.println("number:"+obj.num);
System.out.println("name:"+obj.name);
}
public static void main(String[] m)
{
InstanceVariable();
}
}
output:
number:10
name:ram 


public class Instance1
{
static int count=100;
static String course="java";
void StaticVariables()
{
System.out.println("count:"+count);
System.out.println("course:"+course);
}
public static void main(String[] args)
{
Instance1 obj=new Instance1();
obj.StaticVariables();
}
}                                                                                                                                                                                                                                                                                                  
OUTPUT:
count:100
course:java */


public class Instance2
{
void greet()
{
System.out.println("hello");}
 static void InstanceMethod()
{
Instance2 obj=new Instance2();
obj.greet();
}
public static void main(String[] args)
{
InstanceMethod();
}        }


                                                                                                                                                     

