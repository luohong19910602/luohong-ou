package cn.springmvc.service;
import java.util.List;

import cn.springmvc.model.User;
 
 
public interface UserService {
 
    public int insertUser(User user);
    
    public List<User> findAll();
    
    public void insertUser(List<User> user);
}