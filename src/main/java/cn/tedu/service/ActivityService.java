package cn.tedu.service;

import cn.tedu.pojo.Activity;

import java.util.List;

    /*
     * 查询所有信息
     * */
public interface ActivityService {
    List<Activity> findActivity();
}
