package mediator;

public class ChatUser extends User {

	public ChatUser(MessagMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name+" sends: "+message);
		mediator.sendMessage(message, this);
		/*if (message.contains("addBot")) {
			//
		}*/
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name+" received: "+message);

	}

}
