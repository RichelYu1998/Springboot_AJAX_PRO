package cn.tedu.controller;

import cn.tedu.pojo.Activity;
import cn.tedu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @RequestMapping("activity/doActivityUI")
    public String doActivityUI(){
        return "activity";
    }
    /*
     * 查询所有信息
     * */
    @RequestMapping("activity/findActivity")
    @ResponseBody //此注解用于告诉spring mvc要对此方法的返回结果进行转换处理
    //假如方法返回值为对象(不包含字符串，直接量),
    //spring mvc可以将其转换为json格式的字符串
    public List<Activity> doFindActivitys(){
        return activityService.findActivity();
    }//Spring MVC框架底层默认会使用jackson API将对象转换为json格式字符串。
    @RequestMapping(value = "activity/doDeleteById")
    @ResponseBody
    public String doDeleteById(Long id){
       activityService.doDeleteById(id);
       return "delete ok";
    }
   @RequestMapping("activity/doSaveObject")
   @ResponseBody
    public String doSaveObject(Activity entity){
        activityService.saveObject(entity);
        return "save ok";
   }
}
