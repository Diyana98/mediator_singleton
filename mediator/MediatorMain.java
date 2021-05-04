package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		
		MessagMediator chat=new Chat();
		User user1=new ChatUser(chat, "Ivan");
		User user2=new ChatUser(chat, "Maria");
		User user3=new ChatUser(chat, "Georgi");

		user2.send("Hi guys cat");
		
		user2.send("Hi guys addBot");
		
		user2.send("New cat in the block");
		
		user2.send("User Maria have bean deleted.");
	
	}

}
