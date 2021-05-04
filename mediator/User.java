package mediator;

public abstract class User {
	
	protected MessagMediator mediator;

	protected String name;
	
	public User(MessagMediator mediator, String name) {
		this.mediator=mediator;
		this.name=name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
    
}
