package com.example.demo.Controller;

import cn.hutool.json.JSONObject;
import com.example.demo.Dao.trainModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class uploadController {
    private final String filepathDir = "D:\\onedrive\\OneDrive - shermantestapi\\桌面\\大论文插图";

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        //旧的文件名称
        String oldfilename = file.getOriginalFilename();
        //获取文件扩展名
        String extname = oldfilename.substring(file.getOriginalFilename().lastIndexOf("."));

        //防止重名
        String newfliename = UUID.randomUUID() + extname;
        //返回是整个文件的大小
        String savepath = filepathDir + newfliename;
        File file1 = new File(savepath);
        if(!file1.exists()){
            file1.createNewFile();
        }
        Integer n= FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(new File(savepath)));
        long size = file.getSize();
        if(n!=size){
            return "文件上传失败！";
        }else {
            //String res = "";
            savepath = "/workspace/sganTransformer/scripts/"+"test_eth_trans811_1221_with_model.pt";
            HashMap<String,String> map = new HashMap<>();
            map.put("path",savepath);
            RestTemplate restTemplate = new RestTemplate();
            JSONObject p = new JSONObject(map);
            String url = "http://10.150.59.168:13389/evaluate";
            ResponseEntity<String> responseEntity = restTemplate.postForEntity
                    (
                            url,
                            p,
                            String.class);
            if (responseEntity.getBody()!=null){
                return responseEntity.getBody();
            }
            return savepath+"上传异常";
        }

    }
}
