import java.util.*;
public class MatrixMulti
{
public static void main(String[]st)
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner scan=new Scanner(System.in);
int i,j,k,s=0;
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
System.out.print("ENTER 2 NO:");
a[i][j]=scan.nextInt();
b[i][j]=scan.nextInt();
	}
}
System.out.println("\n\n");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
	s=0;
		for(k=0;k<3;k++)
		{
		s=s+a[i][k]*b[k][j];   ////IMP LINE///
		}
	c[i][j]=s;
	System.out.print(" "+c[i][j]);
	}
System.out.print("\n");
}
}}
