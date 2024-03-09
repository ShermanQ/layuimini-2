package com.example.demo.controllerTest;
import com.alibaba.fastjson.JSON;
import com.example.demo.Dao.UserDaoMapper;
import com.example.demo.Entity.Pager;
import com.example.demo.models.trainModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class userDaoTest {
    @Autowired
    public UserDaoMapper userDaoMapper;
    @Test
    public void getUser(){
        int page = 1;
        int limit = 10;
        Map<String,Object> params = new HashMap<>();
        params.put("page",(page-1)*limit);
        params.put("limit",limit);
        Pager<trainModel> pager = new Pager<>();
        List<trainModel> list = userDaoMapper.queryAll(params);
        for (trainModel t:list){
            JSON j = (JSON) JSON.toJSON(t);
            System.out.println(j);
        }
        int sum = (int) userDaoMapper.count();
        System.out.println("sum="+sum);
        pager.setRows(list);
        pager.setTotal(sum);
        for (trainModel t:pager.getRows()){
            JSON j = (JSON) JSON.toJSON(t);
            System.out.println(j);
        }

//        List<trainModel> list = userDaoMapper.selctByModelname("lee");
//        for (trainModel t: list){
//            JSON j = (JSON) JSON.toJSON(t);
//            System.out.println(j);
//           // System.out.println(t.getId()+t.getDate()+t.getPhone()+t.getDate()+t.getMail()+t.getMode_name()+t.getPeople_name()+t.getState());
//        }
    }
}
