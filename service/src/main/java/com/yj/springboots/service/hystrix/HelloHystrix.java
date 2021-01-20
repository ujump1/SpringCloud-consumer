package com.yj.springboots.service.hystrix;

import com.yj.springboots.api.IHelloProducerService;
import com.yj.springboots.api.IHelloService;
import com.yj.springboots.service.feignClient.IHelloServiceExt;
import org.springframework.stereotype.Component;

/**
 * hello服务熔断器
 */
@Component
public class HelloHystrix implements IHelloServiceExt {
	@Override
	public String sayHello(String name) {
		return "hello:"+name+" I am port 9003, sorry, you message send failed";
	}
}
