package dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pres.nilesh.models.UserInfo;

//HibernetTemplate template;
@Repository(value="UserDao")
@EnableTransactionManagement
@Transactional(propagation=Propagation.REQUIRED)
public class UserDao {
	
	HibernateTemplate template=null;
	
	@Autowired
	SessionFactory sessionFactory = null;
	
	@PostConstruct
	public void initMethod(){
		template = new HibernateTemplate(sessionFactory);
	}

	
	public void addUser(UserInfo user) {
		System.out.println("in addUser");
		template.save(user);
		System.out.println("User Updated");
		
	}

	public List<?> getUserInfo(String name) {
		
		String query = "select e from UserInfo e where name=?";
		System.out.println("in getUser");
		return template.find(query, name);
	}

}
