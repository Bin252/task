package Facade;

public class Client 
{
	public static void main(String args[]) 
	{
		EncryptFacade ef=new EncryptFacade();
		ef.fileEncrypt("444", "555");
	}
}