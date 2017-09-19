package ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.UserDao;
import pres.nilesh.models.UserInfo;

public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public UserService(){
		System.out.println("Constr called");
	}

	public boolean addUserDetails(UserInfo user){
		
		userDao.addUser(user);
		return true;
		
		
	}

	public List<UserInfo> getUserInfo(String name) {
		
		return (List<UserInfo>) userDao.getUserInfo(name);
	}
}
