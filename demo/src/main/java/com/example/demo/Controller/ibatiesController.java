//package com.example.demo.Controller;
//
//import com.example.demo.models.TrainModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@RestController
//public class ibatiesController {
//    @Autowired
//    TrainModelMapper TrainModelMapper;
//    @RequestMapping("/test")
//    public TrainModel  getInfo(HttpServletRequest request, HttpServletResponse response){
//        System.out.println("sql start");
//        TrainModel trainModel = TrainModelMapper.selectByPrimaryKey(2);
//        System.out.println(trainModel.getModelName());
//        System.out.println("succ");
//        return trainModel;
//    }
//}
