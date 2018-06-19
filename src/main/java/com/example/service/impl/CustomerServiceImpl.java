package com.example.service.impl;

import com.example.domain.Customer;
import com.example.mapper.CustomerMapper;
import com.example.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 客户表 业务处理实现
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 10:07:48
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;

}