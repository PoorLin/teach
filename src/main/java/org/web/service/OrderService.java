package org.web.service;

import org.springframework.stereotype.Service;
import org.web.dao.OrderDao;
import org.web.dto.Result;
import org.web.entity.Orders;
import org.web.entity.Users;

import java.util.Optional;

@Service
public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao){
        this.orderDao=orderDao;
    }


    public Result createOrder(Orders orders){
        orderDao.save(orders);
        return new Result(200,"success");
    }

    public Result updateOrder(Orders orders){
        orderDao.save(orders);
        return new Result(200,"success");
    }
    public Result deleteOrder(Integer id){
        orderDao.deleteById(id);
        return new Result(200,"success");
    }

    public Result getOrder(Integer id){
        Optional<Orders> orderOptional =orderDao.findById(id);
        if(orderOptional.isPresent()){
            return new Result(200,orderOptional.get());
        }else {
            return new Result(9999,"no data");
        }

    }




}
