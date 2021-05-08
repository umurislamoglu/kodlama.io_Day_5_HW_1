package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Veritaban�na eklendi : "+user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Veritaban�nda g�ncellendi : "+user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Veritaban�ndan silindi : "+user.getFirstName() + " " + user.getLastName());
		
	}
	
	@Override
	public User getUser(String email) {
		
		User i = null;
		
		for (User user:users) {
			if (user.getEmail()==email) {
				i = user;
				return i;
			}
		}
		return i;
		
	}

	@Override
	public List<User> getAllUsers() {
			
		return users;
	}

	@Override
	public void login(User user) {
		System.out.println("Giri� yap�ld� : "+user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public boolean checkEmail(String email) {
		for (User user:users) {
			if (user.getEmail()==email) 
				return false;
		}
		
		return true;
	}

}
