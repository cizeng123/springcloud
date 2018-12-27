package com.example.consumer8005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@Controller
@Configuration
public class Consumer8005Application {
    public static final  String provider8001 = "http://Provider8001/order";
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Autowired
    RestTemplate restTemplate;

    MultiValueMap<String, Object> param = new LinkedMultiValueMap<String, Object>();

    @RequestMapping(value = "/showOrder")
    @ResponseBody
    public String test(){
        param.add("username","a456123");
        param.add("password","123456");
        RestTemplate rtp = new RestTemplate();
        String result = restTemplate.postForObject(provider8001,param,String.class);
        return result;
    }
    public static void main(String[] args) {
        SpringApplication.run(Consumer8005Application.class, args);
    }

}

