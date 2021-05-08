import Business.Concretes.UserManager;
import Core.Concretes.GoogleLoginAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleLoginAdapter());
		User umur = new User(1, "Umur","�slamo�lu", "test@gmail.com", "123456as");
		User umurHatal�Email = new User(1, "Umur","�slamo�lu", "test+gmail.com", "123456");
		User umurHatal�Pass = new User(1, "Umur","�slamo�lu", "test@gmail.com", "1234");
		
		userManager.register(umur);
		userManager.register(umurHatal�Email);
		userManager.register(umurHatal�Pass);
		System.out.println("*************");
		userManager.googleLogin(umur);
		userManager.login("test@gmail.com","123456as");
		userManager.login("test@gmail.co","123456");
		
	}

}
