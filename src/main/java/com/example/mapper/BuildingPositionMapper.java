package com.example.mapper;

import com.example.domain.BuildingPosition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 楼盘职位 基础支持，该文件添加后不做修改
 *
 * @author Roger
 * @email 190642964@qq.com
 * @create 2018-6-19 10:07:48
 */
@Mapper
public interface BuildingPositionMapper {

    /**
     * 新增数据
     *
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int insert(BuildingPosition buildingPosition);

    /**
     * 新增数据并回写主键
     *
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int insertUseGeneratedKeys(BuildingPosition buildingPosition);

    /**
     * 新增数据(字段不为空) 并回写主键
     *
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int insertSelective(BuildingPosition buildingPosition);

    /**
     * 根据主键删除数据
     *
     * @param primaryKey 主键
     * @return 数据库影响行数
     */
    int deleteByPrimaryKey(Long primaryKey);

    /**
     * 根据 BuildingPosition 删除数据
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int delete(BuildingPosition buildingPosition);

    /**
     * 根据 BuildingPosition 主键 修改其所有内容
     *
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int updateByPrimaryKey(BuildingPosition buildingPosition);

    /**
     * 根据 BuildingPosition 主键 修改其(字段不为空)内容
     *
     * @param buildingPosition BuildingPosition
     * @return 数据库影响行数
     */
    int updateByPrimaryKeySelective(BuildingPosition buildingPosition);

    /**
     * 根据 BuildingPosition 统计数据库中的行数
     *
     * @param buildingPosition BuildingPosition
     * @return count值
     */
    int selectCount(BuildingPosition buildingPosition);

    /**
     * 根据 主键 获取 BuildingPosition
     *
     * @param primaryKey 主键
     * @return BuildingPosition
     */
    BuildingPosition selectByPrimaryKey(Long primaryKey);

    /**
     * 根据 BuildingPosition 获取一个集合
     *
     * @param buildingPosition BuildingPosition
     * @return List<BuildingPosition>
     */
    List<BuildingPosition> select(BuildingPosition buildingPosition);
}