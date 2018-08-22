package teste;

public interface Auntenticable {
	
	final int PASSWORD_LENGTH=8;
	
	void Authenticate(String login,String password);

}
