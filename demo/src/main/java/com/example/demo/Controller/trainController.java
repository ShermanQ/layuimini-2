package com.example.demo.Controller;

import cn.hutool.json.JSONObject;
import com.example.demo.Dao.trainModelMapper;
import com.example.demo.models.trainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Administrator
 */
@RestController
public class trainController {
    @Autowired
    trainModelMapper trainModelMapper;

    @RequestMapping("train")
    public void trainForm(@RequestParam Map<String, String> map) {
//        for (String k:map.keySet()){
//            System.out.println(k+":"+map.get(k));
//        }
        trainModel obj = new trainModel();
        obj.setMode_name(map.get("modelName"));
        obj.setPeople_name(map.get("peopleName"));
        obj.setPhone(map.get("phone"));
        obj.setDataset_name(map.get("datasetName"));
        obj.setDate(map.get("date"));
        obj.setGpu_nums(Integer.parseInt(map.get("gpu_nums")));
        obj.setMail(map.get("mail"));
        obj.setState(false);
        trainModelMapper.insert(obj);
        RestTemplate restTemplate = new RestTemplate();
        JSONObject p = new JSONObject(map);
        String url = "http://10.150.59.168:18888/";
        ResponseEntity<String> responseEntity = restTemplate.postForEntity
                (
                        url,
                        p,
                        String.class);
        if ("success".equals(responseEntity.getBody())){
            obj.setState(true);
            trainModelMapper.updateBystate(obj.getId());
        }
        //System.out.println(responseEntity.getStatusCode());
        return;
//        return "redirect:/page/task.html";
    }

}
