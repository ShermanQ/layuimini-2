package com.example.demo.Controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@RestController
public class CaptchaController {

    //private static Log logger = LogFactory.getLog(HuToolController.class);

    /**
     * 获取图形验证码
     * http://localhost:9999/JXWorkApi/captcha/getShearCaptcha
     *
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getShearCaptcha", method = RequestMethod.GET)
    public LinkedList<String> getShearCaptcha(HttpServletRequest request, HttpServletResponse response) {

        OutputStream out = null;
        try {
            // 取得输出流
            out = response.getOutputStream();
            //定义图形验证码的长、宽、验证码字符数、干扰线宽度
            ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(200, 100, 4, 4);
            //ShearCaptcha captcha = new ShearCaptcha(200, 100, 4, 4);
            //图形验证码写出，可以写出到文件，也可以写出到流
//            captcha.write("/Users/sunww/Desktop/shear.png");
            captcha.write(out);
            //验证图形验证码的有效性，返回boolean值
            //boolean checkPass = captcha.verify(captcha.getCode());
            //logger.info(checkPass);
            // 将生成的验证码code放入sessoin中
            request.getSession().setAttribute("code", captcha.getCode());
            out.flush();  // 将缓存中的数据立即强制刷新, 将缓冲区的数据输出到客户端浏览器
            out.close(); // 关闭输出流

            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new LinkedList<String>() {{
            add("error");
            add("图片获取失败");
            add(null);
            add("500");
        }};
    }
    /**
     * 验证图形码（这一步其实可以放到登录拦截器中去做）
     * http://localhost:9999/JXWorkApi/captcha/verifyCode?code=e2xr
     *
     * @param inCode 前端输入的图形验证码code
     * @param req
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/verifyCode", method = RequestMethod.GET)
    public String verifyCode(String inCode, HttpServletRequest req,HttpServletResponse response) {
        System.out.println("开始请求");
        System.out.println(inCode);
        // 获取存放在session中的验证码
        String code = (String) req.getSession().getAttribute("code");
        // 获取页面提交的验证码
        String inputCode = inCode;
        // 验证码不区分大小写
        String flag;
        if (code.equalsIgnoreCase(inputCode)){
            flag = "true";
        }else {
            flag="false";
        }
//        List<String> res = new ArrayList<>();
//        res.add(flag);
        return flag;
    }
}
