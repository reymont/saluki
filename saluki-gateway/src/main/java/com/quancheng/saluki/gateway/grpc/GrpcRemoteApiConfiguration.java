/*
 * Copyright (c) 2017, Quancheng-ec.com All right reserved. This software is the
 * confidential and proprietary information of Quancheng-ec.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Quancheng-ec.com.
 */
package com.quancheng.saluki.gateway.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.quancheng.saluki.gateway.filters.route.GrpcRemoteApiFilter;

/**
 * @author shimingliu 2017年3月28日 下午5:23:30
 * @version GrpcRemoteApiConfiguration.java, v 0.0.1 2017年3月28日 下午5:23:30 shimingliu
 */
@Configuration
public class GrpcRemoteApiConfiguration {

    @Autowired
    private GrpcRemoteComponent grpcRemoteComponent;

    @Bean
    public GrpcRemoteApiFilter grpcRemoteApiFilter() {
        return new GrpcRemoteApiFilter(grpcRemoteComponent);
    }
}
