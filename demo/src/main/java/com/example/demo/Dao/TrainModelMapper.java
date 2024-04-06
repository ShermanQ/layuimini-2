package com.example.demo.Dao;

import com.example.demo.models.TrainModel;
import com.example.demo.models.TrainModelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TrainModelMapper {
    int countByExample(TrainModelExample example);

    int deleteByExample(TrainModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainModel record);

    int insertSelective(TrainModel record);

    List<TrainModel> selectByExample(TrainModelExample example);

    TrainModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByExample(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByPrimaryKeySelective(TrainModel record);

    int updateByPrimaryKey(TrainModel record);
    List<TrainModel> selectByPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
    int countTotal();
}