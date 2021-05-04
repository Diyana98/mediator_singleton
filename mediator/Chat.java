package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessagMediator {
	
	private List<User> Users;
	private int isBotCreated;
	singleton BotInstance;


	public Chat() {
		this.Users=new ArrayList<>();
		isBotCreated = 0;
	}

	@Override
	public void addUser(User user) {
		this.Users.add(user);

	}

	@Override
	public void sendMessage(String message, User user) {
		
		if ( message.indexOf("addBot") > 0 ) {
		    BotInstance= singleton.getinstance();
		    BotInstance.singletonmsg("Singleton Bot created");	
		    isBotCreated = 1;
		}
		
		if (isBotCreated == 1) {
			 if (BotInstance.chckmsgforcat(message)) {
				 this.Users.remove(user);
				 BotInstance.singletonmsg("Singleton Bot user  "+ user.name + "  removed.");
			 }
			
		}
		
		for(User chatUser: this.Users)
		{
			if(user!=chatUser) {
			    chatUser.receive(message);
			}
		}

	}
		
	}

    


