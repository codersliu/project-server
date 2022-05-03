package com.sliu.consumerserver.service;



import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.sliu.consumerserver.service
 * @ClassName:ConsumerService
 * @Description:
 * @author:sliu
 * @data 2022/5/3 10:58
 */

@Service    //放到容器中，区别于dubbo包下的service用于标识注册到服务中心
@Component
public class UserService {
    //拿到Provider-server提供的Ticket
    @Reference  //引用，   pom坐标，可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("注册中心获取=====>"+ticket);
    }

}
