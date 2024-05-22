package org.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.entity.Users;
@Repository
public interface UserDao extends JpaRepository<Users,Integer> {
}
