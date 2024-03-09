package com.example.demo.controllerTest;

import cn.hutool.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class pythonTest {
    @Test
    public void pythontest() {
        RestTemplate restTemplate = new RestTemplate();
        JSONObject p = new JSONObject();
        String url = "http://10.150.59.168:18888/evaluate";
        p.put("modelName", "tom");
        int i = 0;
        ResponseEntity<String> res = restTemplate.postForEntity
                (
                        url,
                        p,
                        String.class);

        System.out.println(res.getBody());
    }

}
