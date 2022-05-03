package com.sliu.providerserver.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @PackageName:com.sliu.providerserver.service
 * @ClassName:TicketServiceImpl
 * @Description:
 * @author:sliu
 * @data 2022/5/2 21:38
 */
@Service
@Component  //  项目启动时将该服务注册到注册中心
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《程序员评测室》";
    }
}
