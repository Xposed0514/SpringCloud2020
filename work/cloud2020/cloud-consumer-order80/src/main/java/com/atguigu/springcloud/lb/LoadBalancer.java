package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud2020
 * @description
 * @author: LIYAN
 * @create: 2020-11-26 11:33
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
