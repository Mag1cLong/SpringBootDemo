package indi.jcl.service;

import indi.jcl.dao.UserDAO;
import indi.jcl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jcl on 2018/2/22
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userDAO.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
