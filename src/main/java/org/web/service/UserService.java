package org.web.service;

import org.springframework.stereotype.Service;
import org.web.dao.UserDao;
import org.web.dto.Result;
import org.web.dto.UserDTO;
import org.web.entity.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao=userDao;
    }

    public Result createUser(Users users){
        System.out.println(users);
        userDao.save(users);
        return new Result(200,"success");
    }

    public Result updateUser(){
        Users users = new Users();
        users.setUserId(1);
        users.setMail("s87034");
        userDao.save(users);
        return new Result(200,"success");
    }

    public Result deleteUser(){

        userDao.deleteById(1);
        return new Result(200,"success");
    }


    public Result getUser(Integer id){
        Optional<Users> usersOptional =userDao.findById(id);
        if(usersOptional.isPresent()){
            return new Result(200,usersOptional.get());
        }else {
            return new Result(9999,"no data");
        }
    }

    public Result test(Users users){
        List<Users> list=userDao.findByMailAndSecret(users.getMail(),users.getSecret());
        List<UserDTO> userDTOList = new ArrayList<>();
        return new Result(200,list);
    }

}
