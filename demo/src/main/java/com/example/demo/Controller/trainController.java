package com.example.demo.Controller;

import cn.hutool.json.JSONObject;
import com.example.demo.Dao.TrainModelMapper;
import com.example.demo.models.TrainModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 */
@RestController
@Slf4j
public class trainController {
    @Autowired
    TrainModelMapper trainModelMapper;
    @PostMapping("train")
    public void trainForm(@RequestBody TrainModel data) {

        trainModelMapper.insert(data);
        log.info("已提交训练数据{}",data);
        log.info("成功插入数据{}",data);
        log.info("等待训练中...");
//        RestTemplate restTemplate = new RestTemplate();
//        JSONObject p = new JSONObject(data);
//        String url = "http://10.150.59.168:18888/";
//        ResponseEntity<String> responseEntity = restTemplate.postForEntity
//                                                                    (
//                                                                            url,
//                                                                            p,
//                                                                            String.class);
//        if ("success".equals(responseEntity.getBody())){
//            obj.setState("已完成");
//            TrainModel trainModel = new TrainModel();
//            trainModel.setId(obj.getId());
//            trainModelMapper.updateByPrimaryKey(trainModel);
//        }
        //System.out.println(responseEntity.getStatusCode());
        return;
//        return "redirect:/page/task.html";
    }

}
