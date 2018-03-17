package com.giscloud.registrycenter.controller;

import com.giscloud.registrycenter.mapper.ServiceGroupMapper;
import com.giscloud.registrycenter.model.ServiceGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.logging.Logger;


/**
 * @author hxj89.
 * @date 2018/3/17 21:18.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger("HelloController");

    @Autowired
    private DiscoveryClient client;

    @Resource
    ServiceGroupMapper serviceGroupMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public ServiceGroup index() {
        logger.warning("hello "+ client.description());
        ServiceGroup serviceGroup = serviceGroupMapper.selectByPrimaryKey(1);
        return serviceGroup;
    }

}
