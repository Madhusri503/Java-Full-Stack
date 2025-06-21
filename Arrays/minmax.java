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

PROGRAM 3:

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
 OUTPUT:average of elements of array:4.0

PROGRAM 4:
class copy
{
public static void main(String[] args)
{
int original[]={100,20,30,40,50};
int copy[]=new int[original.length];
for(int i=0;i<original.length;i++)
{
copy[i]=original[i];
}
System.out.println("original array:");
for(int i=0;i<original.length;i++){
System.out.println(original[i]+"");
}
System.out.println("\ncopied array:");
for(int i=0;i<copy.length;i++)
{
System.out.println(copy[i]+"");
}
}
}

output:
original array:
100
20
30
40
50

copied array:
100
20
30
40
50

PROGRAM 5:
public class check
{
public static boolean Value(int[] array,int target)
{
for(int i=0;i<array.length;i++)
{
if(array[i]==target)
{
return true;}
}
return false;
}


public static void main(String[] args)
{
int[] numbers={1,2,3,4,5,6,7,8};
int element=7;
if(Value(numbers,element))
{
System.out.println("element is present in array");
}
else{
System.out.println("element is not present in array");
}
}
}

output:
element is present in array

PROGRAM 6: 

public  class count
{
public static void main(String[] args)
{
int[] numbers={1,2,3,4,5,6,7};
int even=0;
int odd=0;
for(int num:numbers)
{
if(num%2==0)
{
even++;
}
else{
odd++;
}
}
System.out.println("even numbers:"+even);
System.out.println("odd numbers:"+odd);
}
}

OUTPUT:

even numbers:3
odd numbers:4

PROGRAM 7:

public class reversearray
{
public static void main(String[] args)
{
int[] numbers={1,2,3,4,5,6,7};
int start=0;
int end=numbers.length-1;
while(start<end)
{
int temp=numbers[start];
numbers[start]=numbers[end];
numbers[end]=temp;
start++;
end--;
}
for(int num:numbers)
{
System.out.println(num+"");
}
}
}
OUTPUT:

7
6
5
4
3
2
1

PROGRAM 8:

public class minmax
{
public static  void main(String[] args)
{
int[] arr={9,3,5,2,1,8};
int min=arr[0];
int max=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("minimum:"+min);
System.out.println("maximum:"+max);
}
}
OUTPUT:
minimum:1
maximum:9 

PROGRAM 9:*/

import java.util.Scanner;
class insert
{
public static void main(Strin[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter size");
int n=sc next

