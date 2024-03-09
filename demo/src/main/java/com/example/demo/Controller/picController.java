package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("show")
public class picController {
    @RequestMapping("pic")
    public JSONObject picaddrees() {

//        Map<String, Object> params = new HashMap<>();
//        params.put("page", (page - 1) * limit);
//        params.put("limit", limit);


        String url = "http://10.150.59.168:16006/plot2";
        RestTemplate restTemplate = new RestTemplate();
        //JSONObject p = new JSONObject(map);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(
                url,
                null,
                String.class
        );

//        Pager<coormodels> pager = new Pager<>();
//        List<T> list = (List<T>)JSON.parse( responseEntity.getBody());
//        int sum = list.size();
//        System.out.println(sum);
//        pager.setRows(list);
//        pager.setTotal(sum);

        JSONObject res = new JSONObject();
        res.put("code", 0);
        res.put("msg", "success");
//        res.put("count", sum);
//        res.put("data", responseEntity.getBody());
        List<JSONObject> jj = (List<JSONObject>) JSON.parse(responseEntity.getBody());
        List<JSONObject> tmp = new ArrayList<>();
//        tmp.add(jj.get(0));
//        tmp.add(jj.get(1));
//        tmp.add(jj.get(2));
        for (int i = 0; i < jj.size(); i++) {
            tmp.add(jj.get(i));
        }
        int sum = tmp.size();
        res.put("count",sum);
        res.put("data", tmp);
        System.out.println(sum);
        return res;
    }
}
