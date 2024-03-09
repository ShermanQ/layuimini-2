package com.example.demo.Controller;

import com.example.demo.Dao.trainModelMapper;
import com.example.demo.models.trainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ibatiesController {
    @Autowired
    trainModelMapper trainModelMapper;
    @RequestMapping("/test")
    public trainModel  getInfo(HttpServletRequest request, HttpServletResponse response){
        System.out.println("sql start");
        trainModel trainModel = trainModelMapper.selectByPrimaryKey(2);
        System.out.println(trainModel.getPeople_name());
        System.out.println("succ");
        return trainModel;
    }
}
