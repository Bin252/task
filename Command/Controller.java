package Command;

public class Controller {
	private Command command; 
	public Controller(Command command) {
		this.command=command;
	}
	public void function() {
		command.execute();
	}
	
}
