class OneZero
{
public static void main(String[] args)
{
int n=5;
int val=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if((i+j)%2==0)
{
System.out.print(val +" ");
}
else
{
System.out.print("0"+" ");
}
}
System.out.println();

}
}
}
