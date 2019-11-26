package classes;

public class Parametres {
	private String password = "";
	private int conn_delay = 0;
	private int num_attempts = 0;
	private int num_wrong = 0;
	
	public Parametres() {}
	
	public Parametres(String pass, int delay, int attempts, int wrong) {
		this.password = pass;
		this.conn_delay = delay;
		this.num_attempts = attempts;
		this.num_wrong = wrong;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public int getConnDelay() {
		return this.conn_delay;
	}
	
	public void setConnDelay(int delay) {
		this.conn_delay = delay;
	}
	
	public int getNumAttempts() {
		return this.num_attempts;
	}
	
	public void setNumAttempts(int attempts) {
		this.num_attempts = attempts;
	}
	
	public int getNumWrong() {
		return this.num_wrong;
	}
	
	public void setNumWrong(int wrong) {
		this.num_wrong = wrong;
	}
}
