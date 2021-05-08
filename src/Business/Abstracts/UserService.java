package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {
	
	void login(String email, String password);
	void register(User user);
	void emailValidation(User user);
	void googleLogin(User user);
	
	
}
