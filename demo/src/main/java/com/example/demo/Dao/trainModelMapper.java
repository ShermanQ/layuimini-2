package com.example.demo.Dao;

import com.example.demo.models.trainModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 */
@Mapper
@Component
public interface trainModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(trainModel record);

    int insertSelective(trainModel record);

    trainModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(trainModel record);

    int updateBystate(Integer id);

    int updateByPrimaryKey(trainModel record);
}