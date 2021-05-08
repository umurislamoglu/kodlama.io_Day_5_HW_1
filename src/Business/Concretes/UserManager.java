package Business.Concretes;

import Business.Abstracts.UserService;
import Core.Abstracts.LoginServices;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.Scanner;
import java.util.regex.*; 

public class UserManager implements UserService {

	private UserDao userDao;
	private LoginServices loginServices;
	
	
		
	public UserManager(UserDao userDao, LoginServices loginServices) {
		super();
		this.userDao = userDao;
		this.loginServices = loginServices;
	}

	@Override
	public void login(String email, String password) {
		for(User user : userDao.getAllUsers()) {
			if(email == user.getEmail() && password == user.getPassword()) {
				userDao.login(user);
			return;
		} else {
			System.out.println("Üye bilgilsi bulunmamakta");
		}}
		
	}

	@Override
	public void register(User user) {
	
		
		
		
	
		if (Pattern.matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}",user.getEmail()) && 
			user.getPassword().length()>6 && 
			user.getFirstName().length()>=2 &&
			user.getLastName().length()>=2 &&
			userDao.checkEmail(user.getEmail())) {
			
			emailValidation(user);
			
			userDao.add(user);
		} else {
			System.out.println("Email veya þifre hatalý");
		}
		
	}

	@Override
	public void emailValidation(User user) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Press Enter to validate");
		scanner.nextLine();
		scanner.close();
		System.out.println("Email Doðrulandý.");
		
	}

	@Override
	public void googleLogin(User user) {
			
		loginServices.login();
	}
	
	

}

