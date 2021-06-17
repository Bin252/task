package Command;
public class TVOpenCommand extends Command {
	private Televlsion tv=new Televlsion();
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.open();
	}
 
}