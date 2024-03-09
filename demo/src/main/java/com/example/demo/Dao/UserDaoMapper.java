package com.example.demo.Dao;


import com.example.demo.models.trainModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface UserDaoMapper {
//    public void addUser(User user);
//    public  User getUser(int UserID);
//    public User findUser(String loginName,String password);
//    public void update(User user);
//    public void delete(User user);

    List<trainModel> selctByModelname(String modelname);
    List<trainModel> queryAll(Map<String, Object> params);
    long count();
}
