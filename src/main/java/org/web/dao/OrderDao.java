package org.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
}
