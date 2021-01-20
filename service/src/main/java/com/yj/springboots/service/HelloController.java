package com.yj.springboots.service;

import com.yj.springboots.api.IHelloProducerService;

import com.yj.springboots.service.feignClient.IHelloServiceExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/helloProducer")
public class HelloController implements IHelloProducerService {

    @Resource
    private IHelloServiceExt helloServiceExt;

    @Override
    public String sayHello(String name) {
        return helloServiceExt.sayHello(name) ;
    }
}