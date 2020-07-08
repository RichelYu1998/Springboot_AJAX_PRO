package cn.tedu.service;

import cn.tedu.pojo.Activity;

import java.util.List;


public interface ActivityService {
    /*
     * 查询所有信息
     * */
    List<Activity> findActivity();
    /*
     * 删除信息
     * */
    int doDeleteById(Long id);
    /*
     * 新增数据
     * */
    int saveObject(Activity entity);
}
