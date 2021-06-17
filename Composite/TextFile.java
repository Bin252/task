package Composite;



public class TextFile extends AbstractFile
{
	private String fileName;
	public TextFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}
	public void add(AbstractFile element)
	{
		System.out.println("TextFile:add");
	}
	public void remove(AbstractFile element)
	{
		System.out.println("TextFile:remove");
	}
	public void display()
	{
		System.out.println(fileName);
		System.out.println("TextFile:display");
	}
}
