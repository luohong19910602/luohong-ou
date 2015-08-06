package cn.springmvc.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 


import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
 
 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDao;
     
    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void insertUser(List<User> user) {
		int i=0;
		for(User u: user){
			if(i++ > 3){
				throw new RuntimeException();
			}
			userDao.insertUser(u);
		}
	}
 
}