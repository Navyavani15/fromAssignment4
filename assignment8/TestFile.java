package assignment8;
import java.io.File;
import java.io.IOException;
public class TestFile {
	public static void main(String args[]) throws IOException 
	{
		 File dir=new File("D:\\Badminton");
		 dir.mkdir();
		 File file=new File(dir,"singles.txt");
		 file.createNewFile();
		 
		 File file1=new File(dir,"dubbles.txt");
		 file1.createNewFile();
		
		 
		 File dir2=new File("D:\\Badminton\\court");
		 dir2.mkdir();
		 File file2=new File(dir2,"smash.dat");
		 file2.createNewFile();
		 
		 File replace=new File(dir,"doubles.txt");
		boolean f= file1.renameTo(replace);
		 
		if(f) {
	       System.out.println(file1.getName()+" changed succesful to "+replace.getName());
	     } else {
	        System.out.println("Rename failed");
	     } 
		 
		 file.delete();
		 if(file.exists())
		 {
			 System.out.println("fail to delete the file");
		 }
		 else
		 {
			 System.out.println(file.getName()+" successfully deleted");
		 }
	}

}
