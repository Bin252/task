package Composite;
import java.util.*;
 
public class Folder extends AbstractFile
{
	private String fileName;
	private ArrayList fileList=new ArrayList();
	public Folder(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}
	public void add(AbstractFile element)
	{
		fileList.add(element);
		System.out.println("Folder:add");
	}
	public void remove(AbstractFile element)
	{
		fileList.remove(element);
		System.out.println("Folder:remove");
	}
	public void display()
	{
		for(Object object:fileList)
		{
			((AbstractFile)object).display();
		}
		System.out.println("Folder:display");
	}
}