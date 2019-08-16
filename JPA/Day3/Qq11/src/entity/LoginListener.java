package entity;

import javax.persistence.PostPersist;

public class LoginListener {

	@PostPersist
	public void initialize(Login lg)
	{
		System.out.println("After persist execution");
	}
	
}
