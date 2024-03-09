package com.example.demo.Controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.Dao.UserDaoMapper;
import com.example.demo.Entity.Pager;
import com.example.demo.models.trainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("find")
public class findTaskController {
    @Autowired
    UserDaoMapper userDaoMapper;

    @RequestMapping("/byModelName")
    public List<trainModel> findByModelName(String modelName) {
        return userDaoMapper.selctByModelname(modelName);
    }

    @RequestMapping("/queryAll")
    public JSONObject queryAll(int page, int limit) {
        Map<String, Object> params = new HashMap<>();
        params.put("page", (page - 1) * limit);
        params.put("limit", limit);

        Pager<trainModel> pager = new Pager<>();
        List<trainModel> list = userDaoMapper.queryAll(params);
        int sum = (int) userDaoMapper.count();

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
