
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class MyFile 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ENTER FILE NAME: ");
		String fna=scan.nextLine();
		
		File file=new File("src//mypack//"+fna);
		
		System.out.println("\n EXISTS : "+file.exists());
		System.out.println("\n NAME : "+file.getName());
		System.out.println("\n FOLDER : "+file.getParent());
		System.out.println("\n PATH : "+file.getPath());
		System.out.println("\n LOCATION : "+file.getAbsolutePath());
		
		System.out.println("\n CAN READ : "+file.canRead());
		System.out.println("\n CAN WRITE : "+file.canWrite());
		
		System.out.println("\n IS FILE : "+file.isFile());
		System.out.println("\n IS DIRECTORY : "+file.isDirectory());
		
		System.out.println("\n SIZE OF FILE : "+file.length());
		
		System.out.println("\n LAST MODIFIED(IN LONG) : "+file.lastModified());
		
		Date dd=new Date(file.lastModified());
		
		System.out.println("\n DATE : "+dd);
		
		File ff=new File("src//Shanti.java");
		
		File tt=new File("src//Gtu.java");
		
		ff.renameTo(tt);
		
		try
		{
			ff.createNewFile();
		}
		catch(Exception e)
		{ }
		
		File f2=new File("src//SAMPLE");
		f2.mkdir();
		
	}

}
