package Composite;


public class ImageFile extends AbstractFile
{
	private String fileName;
	public ImageFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}
	public void add(AbstractFile element)
	{
		System.out.println("ImageFile:add");
	}
	public void remove(AbstractFile element)
	{
		System.out.println("ImageFile:remove");
	}
	public void display()
	{
		System.out.println(fileName);
		System.out.println("ImageFile:display");
	}
	
}