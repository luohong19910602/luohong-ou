package cn.springmvc.dao;
import java.util.List;

import cn.springmvc.model.User;
 
 
public interface UserDAO {
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
    
    public List<User> findAll();
}