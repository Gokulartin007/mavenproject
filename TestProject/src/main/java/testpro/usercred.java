package testpro;

public enum usercred {
	
	username("gokul"),
	password("password");

	private final String name; 
	
	usercred(String string) {
		this.name=string;
	}

	public String getname() {
		return name;
	}
	
}
