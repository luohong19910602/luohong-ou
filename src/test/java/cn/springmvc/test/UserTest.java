package cn.springmvc.test;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml"})
public class UserTest {

	@Autowired
	private UserService userService;

	@Test
	public void addUser(){
		User user = new User();
		user.setNickname("你好");
		user.setState(2);
		System.out.println(userService.insertUser(user));
	}

	@Test
	public void testListAll(){
		List<User> allUsers = userService.findAll();
		System.out.println(allUsers.size());
	}

	@Test
	public void testTransaction(){
        
		System.out.println(userService);
		
		List<User> userList = new ArrayList<User>();
        for(int i=0; i<5; i++){
        	User user = new User();
    		user.setNickname("你好");
    		user.setState(2);
            
    		userList.add(user);
        }
        
        userService.insertUser(userList);
        
        testListAll();
	}
}