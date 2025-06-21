/*public class Arraysum
{
public static int sumArray(int[] array)
{
int sum=0;
for(int num:array)
{
sum+=num;
}
return sum;
}
public static void main(String[] args)
{
int[] numbers={11,21,31,41,51};
System.out.println("sum of array elements:"+sumArray(numbers));
}
}
 OUTPUT:sum of array elements:155

PROGRAM 2:

class Index
{
public static void main(String[] args)
{
int num[]={10,20,30,40,50};
int value=40;
int index=-1;
for (int i=0;i<num.length;i++)
{
if(num[i]==value)
{
index=i;
break;
}
}
if(index==-1)
{
System.out.println("not found");
}
else
{
System.out.println("index is:"+index);                .
}
}
}

OUTPUT: index is:3

PROGRAM 3:*/

public class Arrayavg
{
public static double avgarray(int[] array)
{
int sum=0;
double avg=0.0;
for(int num:array)
{
sum+=num;
avg=sum/num;
}
return avg;
}
public static void main(String[] args)
{

int[] numbers={1,2,3,4,5,6,7};
System.out.println("average of elements of array:"+avgarray(numbers));
}
}
