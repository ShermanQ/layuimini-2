package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Entity.Pager;
import com.example.demo.models.coormodels;
import com.example.demo.models.trainModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("get")
public class coorController {
    @RequestMapping("coor")
    public JSONObject coorForm(int page, int limit) {

        Map<String, Object> params = new HashMap<>();
        params.put("page", (page - 1) * limit);
        params.put("limit", limit);


        String url = "http://10.150.59.168:16006/plot";
        RestTemplate restTemplate = new RestTemplate();
        //JSONObject p = new JSONObject(map);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(
                url,
                null,
                String.class
        );



        Pager<coormodels> pager = new Pager<>();
        List<coormodels> list = (List<coormodels>)JSON.parse( responseEntity.getBody());
        int sum = list.size();
        //System.out.println(sum);
        pager.setRows(list);
        pager.setTotal(sum);

        JSONObject res = new JSONObject();
        res.put("code", 0);
        res.put("msg", "");
        res.put("count", sum);
        res.put("data", pager.getRows());
        return res;
    }


}
