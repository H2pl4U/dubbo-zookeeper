package com.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubboprovider.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到的票为:"+ticket);

    }

}
