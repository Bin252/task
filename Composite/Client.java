package Composite;
public class Client 
{
	public static void main(String a[])
	{
		AbstractFile obj1,obj2,obj3,obj4,obj5;
		Folder plate1,plate2,plate3;
		obj1=new ImageFile("aaa");
		obj2=new TextFile("bbb");
		plate1=new Folder("ccc");
		plate1.add(obj1);
		plate1.add(obj2);
		
		obj3=new VideoFile("ddd");
		obj4=new VideoFile("eee");
		plate2=new Folder("fff");
		plate2.add(obj3);
		plate2.add(obj4);
		
		obj5=new ImageFile("ggg");
		plate3=new Folder("hhh");
		plate3.add(plate1);
		plate3.add(plate2);
		plate3.add(obj5);
		
		plate3.display();
		
	}
}