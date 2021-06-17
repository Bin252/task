package Composite;


public class VideoFile extends AbstractFile
{
	private String fileName;
	public VideoFile(String filename)
	{
		this.fileName=new String();
		this.fileName=filename;
	}
	public void add(AbstractFile element)
	{
		System.out.println("VideoFile:add");
	}
	public void remove(AbstractFile element)
	{
		System.out.println("VideoFile:remove");
	}
	public void display()
	{
		System.out.println(fileName);
		System.out.println("VideoFile:display");
	}
}