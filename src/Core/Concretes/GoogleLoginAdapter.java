package Core.Concretes;

import Core.Abstracts.LoginServices;
import GoogleLogin.GoogleLoginManager;

public class GoogleLoginAdapter implements LoginServices {

	@Override
	public void login() {
		GoogleLoginManager googleLogin = new GoogleLoginManager();
		
		googleLogin.googleLogin();
		
		
	}

}
