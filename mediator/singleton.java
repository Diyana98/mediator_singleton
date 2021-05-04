package mediator;

public class singleton {
 
	private static singleton instance;
	private singleton() {
		// private  constructor , can not create an instance
	}

	public static singleton getinstance() {
		
		if ( instance == null) {
			instance  = new singleton();
		}
		
		return instance;
	}
	
	public void singletonmsg(  String message) {
		
		System.out.println("Mesage from Sinleton  "+message);
	}
	
	public boolean chckmsgforcat(  String message) {
		if ( message.indexOf("cat") > 0 ) {
			System.out.println(" Sinleton  cat exists in "+message);
			return true;
		}
		System.out.println(" Sinleton  cat not exists in "+message);
	    return false;
	
	
	}	
	
	
}
