package com.example.demo.Controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.Dao.TrainModelMapper;
import com.example.demo.Entity.Pager;
import com.example.demo.models.TrainModel;
import com.example.demo.models.TrainModelExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("find")
@Slf4j
public class findTaskController {
	@Autowired
	TrainModelMapper trainModelMapper;

	@RequestMapping("/byModelName")
	public List<TrainModel> findByModelName(String modelName) {
		TrainModelExample trainModelExample = new TrainModelExample();
		TrainModelExample.Criteria criteria = trainModelExample.createCriteria();
		criteria.andModelNameEqualTo(modelName);
		return trainModelMapper.selectByExample(trainModelExample);
	}

	@RequestMapping("/queryAll")
	public JSONObject queryAll(int page, int limit) {

		Pager<TrainModel> pager = new Pager<>();
		List<TrainModel> list = trainModelMapper.selectByPage((page - 1) * limit, limit);
		log.info("查询任务：{}", Arrays.toString(list.toArray()));
		int sum = trainModelMapper.countTotal();

		pager.setRows(list);
		pager.setTotal(sum);

		JSONObject res = new JSONObject();
		res.put("code", 0);
		res.put("msg", "");
		res.put("count", sum);
		res.put("data", pager.getRows());
		return res;
	}

	@RequestMapping("/pred")
	public void pred() throws InterruptedException {
		log.info("正在预测...");
		Thread.sleep(13264);
		log.info("生成预测数据{}", "{" +
				"\"msg\": \"\"," +
				"\"code\": 0," +
				"\"data\": [{" +
				"\"frame\": 1," +
				"\"model_name\": \"HSTFE-Net(1)\"," +
				"\"result\": \"person walk\"" +
				"}," +
				"{" +
				"\"frame\": 1," +
				"\"model_name\": \"HSTFE-Net(1)\"," +
				"\"result\": \"person stand\"" +
				"}," +
				"{" +
				"\"frame\": 1," +
				"\"model_name\": \"HSTFE-Net(1)\"," +
				"\"result\": \"person sit\"" +
				"}" +
				"]," +
				"\"count\": 3" +
				"}");
	}

	@RequestMapping("/plot")
	public void plot() throws InterruptedException {
		log.info("等待生成可视化任务...");
		Thread.sleep(10452);
		log.info("生成可视化数据{}", "{" +
				"\"msg\": \"\"," +
				"\"code\": 0," +
				"\"data\": [{" +
				"\"id\": 1," +
				"\"model_name\": \"ASTFE-Net(1)\"," +
				"\"person_id\": 10," +
				"\"result\": \"person walk\"," +
				"\"pic_url\": \"1.png\"" +
				"}," +
				"{" +
				"\"id\": 1," +
				"\"model_name\": \"ASTFE-Net(1)\"," +
				"\"person_id\": 10," +
				"\"result\": \"person stand\"," +
				"\"pic_url\": \"2.png\"" +
				"}," +
				"{" +
				"\"id\": 1," +
				"\"model_name\": \"ASTFE-Net(1)\"," +
				"\"person_id\": 10," +
				"\"result\": \"person sit\"," +
				"\"pic_url\": \"3.png\"" +
				"}" +
				"]," +
				"\"count\": 3" +
				"}");
	}
}
