package com.example.mapper;

import com.example.domain.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 客户表 基础支持，该文件添加后不做修改
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 10:07:48
 */
@Mapper
public interface CustomerMapper {

    /**
     * 新增数据
     *
     * @param customer Customer
     * @return 数据库影响行数
     */
    int insert(Customer customer);

    /**
     * 新增数据并回写主键
     *
     * @param customer Customer
     * @return 数据库影响行数
     */
    int insertUseGeneratedKeys(Customer customer);

    /**
     * 新增数据(字段不为空) 并回写主键
     *
     * @param customer Customer
     * @return 数据库影响行数
     */
    int insertSelective(Customer customer);

    /**
     * 根据主键删除数据
     *
     * @param primaryKey 主键
     * @return 数据库影响行数
     */
    int deleteByPrimaryKey(Long primaryKey);

    /**
     * 根据 Customer 删除数据
     * @param customer Customer
     * @return 数据库影响行数
     */
    int delete(Customer customer);

    /**
     * 根据 Customer 主键 修改其所有内容
     *
     * @param customer Customer
     * @return 数据库影响行数
     */
    int updateByPrimaryKey(Customer customer);

    /**
     * 根据 Customer 主键 修改其(字段不为空)内容
     *
     * @param customer Customer
     * @return 数据库影响行数
     */
    int updateByPrimaryKeySelective(Customer customer);

    /**
     * 根据 Customer 统计数据库中的行数
     *
     * @param customer Customer
     * @return count值
     */
    int selectCount(Customer customer);

    /**
     * 根据 主键 获取 Customer
     *
     * @param primaryKey 主键
     * @return Customer
     */
    Customer selectByPrimaryKey(Long primaryKey);

    /**
     * 根据 Customer 获取一个集合
     *
     * @param customer Customer
     * @return List<Customer>
     */
    List<Customer> select(Customer customer);
}