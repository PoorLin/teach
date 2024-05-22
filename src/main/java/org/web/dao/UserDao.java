package org.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.entity.Users;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<Users,Integer> {

    public List<Users> findByMail(String mail);

    public List<Users> findByMailAndSecret(String mail,String secret);

}
